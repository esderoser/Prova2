import java.sql.*;
public class Main{
    public static void main(String[] args){
        System.out.println("--------Prueba JDBC----------------");
        compruebaJDBC();

        Connection conexion;    
        Statement sentencia;
        ResultSet resultado;
        try{
            conexion = DriverManager.getConnection( "jdbc:mysql://localhost/biblioteca","root","" );
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery( "SELECT * FROM vista1" );
            while( resultado.next()){
                String titulo = resultado.getString( "Titulo" );
                String autor = resultado.getString("Autor");
                System.out.println(titulo+"|"+autor);
            }
            conexion.close();
        }catch(Exception e){
            System.out.println(e);
        }
    
    //RANDOM COMMENT 3
    }
    
    public static void compruebaJDBC(){
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        }catch(Exception e){
            System.out.println(e);//Random comment 2
        }
        System.out.println("El programa ha encontrado el JDBC");
    }
}





