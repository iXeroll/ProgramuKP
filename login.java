import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class login {

    String username;
    String password;

    void login() throws FileNotFoundException {
        username = askForUsername();
        password = askForPass();

        if (userExsists(username, password)) {
            //loginTo;
        }
    }

    static String askForUsername(){
        System.out.println("Gib user");
        Scanner scanner = new Scanner("data.txt");
        return scanner.nextLine();

    }

    static String askForPass(){
        System.out.println("Gib pass");
        Scanner scanner = new Scanner("data.txt");
        return scanner.nextLine();
    }

    boolean userExsists(String username, String password) throws FileNotFoundException {

        File myObj = new File("data.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            String dataUsername = data.substring(data.indexOf(":") + 1, data.lastIndexOf(":"));
            String dataPassword = data.substring(data.lastIndexOf(":") + 1);
            if (dataUsername.equals(username) && (dataPassword.equals(dataPassword))) {
                myReader.close();
                return true;
            }

        }
        myReader.close();
        return false;

    }


}
