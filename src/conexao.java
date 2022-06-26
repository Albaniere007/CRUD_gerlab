import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class conexao {

    private String url;
    private String usuario;
    private String senha;
    private Connection con;

    conexao(){
        url= "jdbc:postgresql://localhost:5432/gerlab_aurora"; //Se for na rede, precisa ip
        usuario= "postgres";
        senha= "123";

        try{
            Class.forName("org.postgresql.Driver");
            con= DriverManager.getConnection(url,usuario,senha);
            System.out.println("Conexão bem sucedida");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public int executaSQL(String sql) {
        try {
            Statement statement=con.createStatement();
            int resultado= statement.executeUpdate(sql);
            con.close();
            return resultado;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public ResultSet executaBusca(String sql){
        try {
            Statement statement=con.createStatement();
            ResultSet resultSet=statement.executeQuery(sql);
            con.close();
            return resultSet;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

}
