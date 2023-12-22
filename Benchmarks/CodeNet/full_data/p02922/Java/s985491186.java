import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int amari = (B-1)%(A-1);
        int ans=0;
        if(amari==0){
             ans=(B-1)/(A-1);
        }else{
            ans=((B-1)+(A-amari))/(A-1);
        }
        System.out.println(ans);
    }
}
