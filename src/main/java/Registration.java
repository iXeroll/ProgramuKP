import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Registration {

    private String name;
    private String username;
    private String password;
    static final private String dataFileName = "data.txt";

    public Registration() {}

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void badRegistrationMessage(){
        System.out.println("Username is not unique, or passwords are not matching!");
    }

    public void addUserToAnExitingList(String name, String username, String password) throws IOException {
        FileWriter myWriter = new FileWriter(dataFileName, true);
        myWriter.write("\n"+name+":"+username+":"+password);
        myWriter.close();
    }

    public void addFirstUserInTheFile(String name, String username, String password) throws IOException {
        FileWriter myWriter = new FileWriter(dataFileName, true);
        myWriter.write(name+":"+username+":"+password);
        myWriter.close();
    }

    public boolean dataFileIsCreated() throws IOException {
        File dataFile = new File(dataFileName);
        if (dataFile.createNewFile()) {
            return true;
        }
        return false;
    }

    public static boolean usernameIsUnique(String username) throws FileNotFoundException {
        File myObj = new File(dataFileName);
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            String data2 = data.substring(data.indexOf(":")+1, data.lastIndexOf(":"));
            if(data2.equals(username))
                return false;
        }
        myReader.close();
        return true;
    }

    public String registrationName(Scanner sc){
        System.out.println("Your name:");
        return sc.nextLine();
    }

    public String registrationUsername(Scanner sc){
        System.out.println("Your username:");
        return sc.nextLine();
    }

    public String registrationPassword(Scanner sc){
        System.out.println("Your password:");
        return sc.nextLine();
    }

    public String registrationRepeatedPassword(Scanner sc){
        System.out.println("Repeat password:");
        return sc.nextLine();
    }
}