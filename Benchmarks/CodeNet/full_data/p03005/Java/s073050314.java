import java.util.*;
public class Main {
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       int n = scan.nextInt();
       int k = scan.nextInt();
       if(k!=0) {
           System.out.println(n - k);
       } else{
           System.out.println(0);
       }
    }
}
