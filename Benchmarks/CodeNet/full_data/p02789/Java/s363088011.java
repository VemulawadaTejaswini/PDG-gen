import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        int str1 = scan.nextInt();
        int str2 = scan.nextInt();
        if(str1==str2){
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}