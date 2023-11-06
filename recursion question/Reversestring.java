// import java.util.Scanner;

public class Reversestring{
        
        static String reverseString(String str) {
            if(str.isEmpty()) {
                return str; 
            }
            return reverseString(str.substring(1)) + str.charAt(0);
        
        }
    
        public static void main(String[] args) {
            // Scanner s=new Scanner(System.in);
            // System.out.println("ENTER THE STRING: ");
            // String string=s.nextLine();
            System.out.println(reverseString("DIGVIJAY"));
            // s.close();
        }
 }