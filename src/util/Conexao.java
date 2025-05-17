package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conexao {
    private static Connection conexao = null;

    public static Connection getConnection() throws SQLException {
        if (conexao == null || conexao.isClosed()) {
            try {
                Properties props = new Properties();
                FileInputStream fis = new FileInputStream("config.properties");
                props.load(fis);

                String url = props.getProperty("DB_URL");
                String user = props.getProperty("DB_USER");
                String password = props.getProperty("DB_PASSWORD");

                conexao = DriverManager.getConnection(url, user, password);

            } catch (IOException e) {
                throw new SQLException("Erro ao carregar config.properties", e);
            }
        }
        return conexao;
    }

    public static void fechar() {
        try {
            if (conexao != null && !conexao.isClosed()) {
                conexao.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
