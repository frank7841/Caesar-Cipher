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

            }
        }
    }
}
