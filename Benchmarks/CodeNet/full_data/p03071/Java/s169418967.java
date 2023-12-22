import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b)System.out.println(a + a-1);
        else if(a==b)System.out.println(a+a);
        else System.out.println(b + b-1);
        
    }
  
}
