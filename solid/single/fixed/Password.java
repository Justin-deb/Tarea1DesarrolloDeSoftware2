public class Password {
    private String password;

    public Password(String password) {
        this.password = password;
    }

    public boolean validatePassword() {
        return password.length() >= 8 && password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$");
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
