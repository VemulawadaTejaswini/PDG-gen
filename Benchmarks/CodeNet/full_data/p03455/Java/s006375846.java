import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
       Scanner in = new Scanner(System.in);
       int a = in.nextInt();
       int b = in.nextInt();
       
       int s = a*b;
       if (s % 2 == 0){
           System.out.println("Even");
       }else{
           System.out.println("Odd");
       }
     }
}
