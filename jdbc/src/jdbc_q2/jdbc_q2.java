package jdbc_q2;

import java.sql.*;

public class jdbc_q2 {

	public static void main(String[] args) throws SQLException{
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "Kb761501");
            //creating statement
            System.out.println("Connection successful");
           st = con.createStatement();

            String s = "update account set balance = balance*2";
            st.executeUpdate(s);
            
            String sql = "select * from account";
            rs = st.executeQuery(sql);
            
            while (rs.next()) {
                System.out.println(rs.getString("first_name") + " \t " + rs.getDouble("balance"));
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
