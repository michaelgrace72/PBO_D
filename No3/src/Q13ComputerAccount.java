public class Q13ComputerAccount {
    private String realName;
    private String userName;
    private String password;

    //constructor
    public Q13ComputerAccount(String realName, String userName, String password) {
        this.realName = realName;
        this.userName = userName;
        this.password = password;
    }

    //print realName
    public void printRealName() {
        System.out.println("Real Name: " + realName);
    }

    //print userName
    public void printUserName() {
        System.out.println("User Name: " + userName);
    }

    //print password
    public void printPassword() {
        System.out.println("Password: " + password);
    }

    //change the password
    public void changePassword(String newPassword) {
        this.password = newPassword;
    }
}
