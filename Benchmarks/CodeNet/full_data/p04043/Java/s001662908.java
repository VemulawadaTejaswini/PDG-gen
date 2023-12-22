import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int C = Integer.parseInt(sc.next());
        
        if(A == 5 && B == 7 && C == 5){
            System.out.println("YES");
        }else if(A == 5 && B == 5 && C == 7){
            System.out.println("YES");
        }else if(A == 7 && B == 5 && C == 5){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
