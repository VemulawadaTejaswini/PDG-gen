import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int t=Integer.parseInt(br.readLine());
            long sum=0;
            for(int i=1;i<=t;i++){
                for(int j=1;j<=t;j++){
                    for(int k=1;k<=t;k++){
                        int u=gcd(j,k);
                        int p=gcd(i,u);
                        sum+=p;
                    }
                }
            }
            System.out.println(sum);

        }catch(Exception e){
            System.out.println("KKKK "+e.getMessage());
        }
    }
    static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        if(b==0){
            return a;
        }
        if(a>b){
            return gcd(a%b,b);
        }
        return gcd(a,b%a);

    }
}
