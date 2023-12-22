import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        long H = sc.nextLong();
        long W = sc.nextLong();
        long S= H*W;
        if(H==1||W==1){
            System.out.println(1);
        }else{
            System.out.println(S/2);
        }
        
    }
}
