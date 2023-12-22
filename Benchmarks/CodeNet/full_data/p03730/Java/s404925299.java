import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int C = Integer.parseInt(sc.next());
        
        for(int i=A; i<=A*B; i+=A){
            if(i % B == C){
                System.out.println("YES");
                return;
            }
        }
        
        System.out.println("NO");
    }
}