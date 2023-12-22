import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
       
       if(a > x || a + b < x){
           System.out.println("NO");
       }else{
           System.out.println("YES");
       }
       
    }
}
