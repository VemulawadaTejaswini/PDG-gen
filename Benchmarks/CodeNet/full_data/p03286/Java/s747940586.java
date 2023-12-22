import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        long n = Long.parseLong(sc.next());
        
        String ans = "";
        long a = 2;
        long b = 0;
        while(n != 0){
            if(n%(a<<b) != 0){
                ans = "1" + ans;
                if(b%2 == 0){
                    n -= (a>>1)<<b;
                }else{
                    n += (a>>1)<<b;
                }
            }else{
                ans = "0" + ans;
            }
            b++;
        }
        
        if(ans.length() == 0){
            System.out.println(0);
        }else{
            System.out.println(ans);
        }
    }
}