import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt(); 

        int c = A+B;
        int d = A-B;
        int e = A*B;
			System.out.println(Math.max(e,Math.max(c,d)));
    }
}
