public class Q13ComputerAccountTest {
    public static void main(String[] args) {
        // pest the Q13ComputerAccount class
        Q13ComputerAccount computerAccount = new Q13ComputerAccount("John Doe", "johndoe123", "password123");

        // print the account
        computerAccount.printRealName();
        computerAccount.printUserName();
        computerAccount.printPassword();

        // change the password
        computerAccount.changePassword("newpassword123");

        // print new password
        computerAccount.printPassword();
    }
}