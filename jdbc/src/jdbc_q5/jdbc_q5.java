package jdbc_q5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_q5 {

	public static void main(String[] args) throws SQLException{
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "Kb761501");
            //creating statement
            System.out.println("Connection successful");
           st = con.createStatement();

           
            
            String sql1 = "select * from account order by balance asc limit 1";
            rs = st.executeQuery(sql1);
            
            while (rs.next()) {
                System.out.println("lowest balance: "+rs.getString("first_name") + "  " + rs.getString("last_name") + " "+ rs.getDouble("balance"));
            }
           
            String sql2 = "select * from account order by balance desc limit 1";
            rs = st.executeQuery(sql2);
            
            while (rs.next()) {
                System.out.println("highest balance: " +rs.getString("first_name") + "  " + rs.getString("last_name") + " "+ rs.getDouble("balance"));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(con != null){
                con.close();
            }
            if(st != null){
                st.close();
            }
            if(rs != null){
                rs.close();
            }
        }
    }
}


