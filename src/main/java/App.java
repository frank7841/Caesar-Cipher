import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java .io.IOException;

public class App {
    public static void main(String[] args ){
        Scanner value = new Scanner(System.in);
        boolean header = true;
        System.out.println("Welcome to the CAESAR CIPHER Application Console");
        while(header){
            System.out.println("_________*************************************_____________________");
            System.out.println("Choose what you want to do\n" + "1: Encrypting\n "+ "2:Decrypting\n"+ "3: Exit");
            int selection = value.nextInt();
            value.nextLine();
            if(selection ==1){
                System.out.println("What is it that you want to encrypt?");
                String userInput = value.nextLine();
                System.out.println("Do you want to encrypt your information Left or Right?");
                String userDirection = "";
                boolean validDirection = true;
                while(validDirection) {
                    userDirection = value.nextLine();
                    if (!userDirection.equalsIgnoreCase("right") && !userDirection.equalsIgnoreCase("left")) {
                        System.out.println("Select a direction by typing either left or right");
                    } else {
                        validDirection=false;

                    }
                }
                System.out.println("How many characters do you want to shift your information to the "+ userDirection);
                int userShift = value.nextInt();
                CaesarCipher cipher = new CaesarCipher(userInput);
                System.out.println("Your input is : "+userInput);
                System.out.println("Your Encrypted Input is "+ cipher.encryptText(userDirection, userShift));


            }
            else if(selection==2){

            }
        }
    }
}
