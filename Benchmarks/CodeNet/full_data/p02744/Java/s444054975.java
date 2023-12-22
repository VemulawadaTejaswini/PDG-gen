import java.util.*;

public class Main {

    static final int MOD=1000000007;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        rec(n,1,"a");

    }
    private static void rec(int n,int i,String s){
        if(n==i){
            System.out.println(s);
            return;
        }
        else {
            for(char c ='a';c<(char)(s.charAt(s.length()-1)+2);c++){
                rec(n,i+1,s+c);
            }
        }

    }
}