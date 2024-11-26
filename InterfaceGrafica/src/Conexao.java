import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Conexao {
	// gerencia a conex�o com o banco de dados 
		private Connection connection = null;
		// gerencia as consultas com o banco de dados
		private Statement statement = null;
		// armazena as irfoma��es vindo de um select.
		private ResultSet resultset = null;	
	
		public void conectar() {
			// 1� Java data base connection
			// 2 � servidor
			// 3 � nome da tabela
			String servidor = "jdbc:mysql://localhost:3306/bdAmigos_felps";
			// login do banco de dados
			String usuario ="root";
			String senha = "";
			// Driver utilizado para conex�o
			String driver= "com.mysql.jdbc.Driver";
			//Exce��o
			try {
				// faz conex�o com o banco 
				this.connection = DriverManager.getConnection(servidor, usuario, senha);
				// cria o ambiente para executar c�digos  dentro do banco
				this.statement = this.connection.createStatement();
				System.out.println("Conex�o efetuada com sucesso");
			}catch (Exception e) {
				System.out.println("Erro: "+ e.getMessage());

			}
		}
		
		public void inserirContato (String nome, String apelido, String telefone) {
			try {
				//Guarda dentro da Variavel query, o codigo que vai ser executado
				String query = "INSERT INTO amigo (nome, apelido, telefone) VALUES ('"+ nome +"','"+ apelido +"','" + telefone +"')";
				//Executa o codigo dentro do sql
				this.statement.executeUpdate(query);
			}				
				catch (Exception e) {
					System.out.println("Erro: "+ e.getMessage());
				}

		}
	
}