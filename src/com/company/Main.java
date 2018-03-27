import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean lol = true;
        Scanner myScanner=new Scanner(System.in);
        String usernam, passwor = null, username = null, password;
        do {

            System.out.println("Sign in or sign up");
            String ino = myScanner.nextLine().toLowerCase();
             lol = true;
            if (ino.matches("sign in")) {
                    System.out.println("What is your username: ");
                    usernam = myScanner.nextLine();
                    System.out.println("What is your password: ");
                    password = myScanner.nextLine();
                    if(usernam == username && passwor == password)
                lol=false;
            } else if (ino.matches("sign up")){
                System.out.println("What would you like your username to be? ");
                usernam = myScanner.nextLine();
                System.out.println("What would you like your password to be? ");
                password = myScanner.nextLine();
                lol = true;
            }
            else if(ino.matches("Y33T")) {
                System.out.println("Yeet!");
            }
            else{
                System.out.println("That was not an option");
            }
        }while(lol!=false);


    }
}
