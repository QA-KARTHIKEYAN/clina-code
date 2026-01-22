package UserCredentails;

public class UserCredentials {
	
	 private String username;
	    private String password;
	    
	    //private static UserCredentials getCredentials();

	    public UserCredentials(String username, String password) {
	        this.username = username;
	        this.password = password;
	    }

	    public String getUsername() {
	    	  System.out.println("User is logged in");
	        return username;
	    }

	    public String getPassword() {
	        return password;
	    }

}
