import java.io.BufferedReader;
import java.io.InputStreamReader;
public class App {
    public static void main(String[] args ){
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        boolean header = true;
        System.out.println("Welcome to the CAESAR CIPHER Application Console");
        while(header){
            System.out.println("_________*************************************_____________________");
            System.out.println("Choose what you want to do\n" + "1: Encrypting\n "+ "2:Decrypting\n"+ "3: Exit");
        }
    }
}
