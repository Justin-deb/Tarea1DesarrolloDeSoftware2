public class Username {
    private String username;

    public Username(String username) {
        this.username = username;
    }

    public boolean validateUsername() {
        return username.length() >= 5 && username.matches("[a-zA-Z_0-9]+");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
}
