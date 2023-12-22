import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = Integer.parseInt(sc.next());
        int N = Integer.parseInt(sc.next());
        
        if(D == 0) {
            System.out.println(N);    
        }else if(D == 1) {
            System.out.println(N*100);
        }else {
            System.out.println(N*10000);
        }
    }
}