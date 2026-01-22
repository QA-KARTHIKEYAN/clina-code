package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import UserCredentails.UserCredentials;

public class DButils {

//	public static UserCredentials getAdminCredentials() {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	public static void getAllUsers() throws Exception {
//
//        Connection con = DButils.getConnection();
//        Statement stmt = con.createStatement();
//
//        String query = "SELECT * FROM users";
//        ResultSet rs = stmt.executeQuery(query);
//        
//        String role = "Admin";
//        if (rs.next()) {
//            role = rs.getString("role");
//            System.out.println(
//                "ID: " + rs.getInt("id") +
//                ", Username: " + rs.getString("username") +
//                //", Email: " + rs.getString("email")+
//                ", Password: " + rs.getString("password")
//            );
//        }
//
//        rs.close();
//        stmt.close();
//        con.close();
//    }
//
//	private static Connection getConnection() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
//	--------------------------------------------------------------------------------------
	    private static final String URL = "jdbc:mysql://localhost:3306/clina_db";
	    private static final String USER = "root";
	    private static final String PASS = "!Q2w3e4r";

	    public static UserCredentials getCredentials() throws Exception {
	    	
	    	  System.out.println("User is logged in DB");

	        Connection con = DriverManager.getConnection(URL, USER, PASS);

	        String sql = "SELECT username, password FROM users WHERE role = ?";
	        PreparedStatement ps = con.prepareStatement(sql);
	        ps.setString(1, "Admin");

	        ResultSet rs = ps.executeQuery();

	        UserCredentials user = null;
	        if (rs.next()) {
	            user = new UserCredentials(
	                rs.getString("username"),
	                rs.getString("password")
	            );
	        }

	        rs.close();
	        ps.close();
	        con.close();

	        return user;
	    }

		public static UserCredentials getAdminCredentials() {
			// TODO Auto-generated method stub
			return null;
		}
	    
//	  ------------------------------------------------------------------

//		public static UserCredentials getAdminCredentials() {
//			// TODO Auto-generated method stub
//			return null;
//		}
//	
	
//-----------------------	
	
//	    public static UserCredentials getAdminCredentials1() throws Exception {
//
//	        String url = "jdbc:mysql://localhost:3306/testdb?useSSL=false&allowPublicKeyRetrieval=true";
//	        String user = "root";
//	        String pass = "root";
//
//	        String sql = "SELECT id, username, password, email, created_at FROM users";
//
//	        try (Connection con = DriverManager.getConnection(url, user, pass);
//	             PreparedStatement ps = con.prepareStatement(sql);
//	             ResultSet rs = ps.executeQuery()) {
//
//	            while (rs.next()) {
//	                int id = rs.getInt("id");
//	                String username = rs.getString("username");
//	                String password = rs.getString("password");
//	                String email = rs.getString("email");
//	                String createdAt = rs.getString("created_at");
//
//	                System.out.println(
//	                    id + " | " +
//	                    username + " | " +
//	                    password + " | " +
//	                    email + " | " +
//                    createdAt
//	                );
//	            }
//
//	        } catch (Exception e) {
//	            e.printStackTrace();
//	        }
//			return null;
//	    }
	
	
	
	
//	private static final String URL = "jdbc:mysql://localhost:3306/clina_db?useSSL=false&allowPublicKeyRetrieval=true";
//	private static final String USER = "root";
//	private static final String PASS = "!Q2w3e4r";
//
//	public static UserCredentials getCredentials(String role)  throws Exception {
//
//	    System.out.println("Fetching user credentials from DB for role: " + role);
//
//	    Connection con = DriverManager.getConnection(URL, USER, PASS);
//
//	    String sql = "SELECT username, password FROM users WHERE role = ?";
//	    PreparedStatement ps = con.prepareStatement(sql);
//	    ps.setString(1, "Admin");
//
//	    ResultSet rs = ps.executeQuery();
//
//	    UserCredentials user = null;
//	    if (rs.next()) {
//	        user = new UserCredentials(
//	            rs.getString("username"),
//            rs.getString("password")
//          //  System.out.println("username:" + role);
//	        );
//	    }
//
//	    rs.close();
//	    ps.close();
//	    con.close();
//
//	    return user;
//	}
//
//
//	public static UserCredentials getCredentials(){
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//
//	public static UserCredentials getUserCredentialsByRole(String role) {
//		// TODO Auto-generated method stub
//		return null;
//	}
}
