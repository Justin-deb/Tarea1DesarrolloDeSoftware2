public class UserDataManager {
    private Username username;
    private Password password;

    public UserDataManager(String username, String password) {
        this.username = new Username(username);
        this.password = new Password(password);
    }

    public void registerUser() {
        if (username.validateUsername() && password.validatePassword()) {
            System.out.println("User registered successfully.");
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    public void loginUser() {
        if (username.validateUsername() && password.validatePassword()) {
            System.out.println("User logged in successfully.");
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    public static void main(String[] args) {
        UserDataManager userManager = new UserDataManager("john_doe", "Password123");
        userManager.registerUser();
        userManager.loginUser();
    }
}
