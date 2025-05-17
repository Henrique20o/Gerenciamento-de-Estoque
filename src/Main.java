import util.Conexao;

import java.sql.Connection;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            Connection conexao = Conexao.getConnection();

            if (conexao != null && !conexao.isClosed()) {
                System.out.println("✅ Conexão bem-sucedida com o banco de dados!");
            } else {
                System.out.println("❌ Conexão falhou.");
            }

        } catch (SQLException e) {
            System.out.println("Erro de conexão: " + e.getMessage());
        }
    }
}
