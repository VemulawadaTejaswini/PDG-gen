import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        if(a - c <= Math.abs(d)){
        	System.out.println("Yes");
        }else if(a - b <= Math.abs(d) && b - c <= Math.abs(d)){
        	System.out.println("Yes");
        }else{
        	System.out.println("No");
        }
    }
}