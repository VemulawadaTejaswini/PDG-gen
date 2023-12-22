
import java.util.*;

public class Main {

    static final int MOD=1000000007;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        char[] str= sc.next().toCharArray();
        int ac[] = new int[n];
        for(int i=0;i<n;i++)ac[i]=0;
        int sum=0;

        for(int i=1;i<n;i++){
            if(str[i-1]=='A'&&str[i]=='C'){
                sum++;
            }
            ac[i]=sum;
        }
        ac[n-1]=sum;

        //for(Integer a:ac) System.out.println(a);


        for(int i=0;i<q;i++){
            int l = sc.nextInt()-1;
            int r = sc.nextInt()-1;
            System.out.println(ac[r]-ac[l]);
        }
        

    }
}
