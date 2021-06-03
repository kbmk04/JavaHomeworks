package jdbc_q1;
import java.sql.*;
public class jdbc_q1 {

	public static void main(String[] args) throws SQLException{
        Connection con = null;
        Statement st = null;
        PreparedStatement stmt = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "Kb761501");
            //creating statement
            System.out.println("Connection successful");
          //  statement = connection.createStatement();

            stmt = con.prepareStatement("insert into account values(?,?,?,?)");
                stmt.setInt(1,101);
                stmt.setString(2,"muji");
                stmt.setString(3,"teka");
                stmt.setFloat(4,22000);
            stmt.executeUpdate();
            
                stmt.setInt(1,102);
                stmt.setString(2,"selam");
                stmt.setString(3,"kidane");
                stmt.setFloat(4,60000);
            stmt.executeUpdate();
            
                stmt.setInt(1,103);
                stmt.setString(2,"mulu");
                stmt.setString(3,"gebre");
                stmt.setFloat(4,50000);
            stmt.executeUpdate();
            
                stmt.setInt(1,104);
                stmt.setString(2,"salim");
                stmt.setString(3,"ahmed");
                stmt.setFloat(4,17000);
            stmt.executeUpdate();
            
                stmt.setInt(1,105);
                stmt.setString(2,"haji");
                stmt.setString(3,"adnan");
                stmt.setFloat(4,55000);
                stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(con != null){
                con.close();
            }
            if(st != null){
                st.close();
            }
            if(stmt != null){
                stmt.close();
            }
        }
    }
}
