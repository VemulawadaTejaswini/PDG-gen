import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args){
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int n=Integer.parseInt(br.readLine());
            String ss=br.readLine();
            char[] c=ss.toCharArray();
            long ans=0;
            long[][] arr=new long[3][n];
            long r=0,g=0,b=0;
            HashSet<Integer> R=new HashSet<>(),G=new HashSet<>(),B=new HashSet<>();
            for(int i=n-1;i>=0;i--){
                if(c[i]=='R'){
                    r++;
                    R.add(i);
                }else if(c[i]=='G'){
                    g++;
                    G.add(i);
                }else{
                    b++;
                    B.add(i);
                }
                arr[0][i]=r;
                arr[1][i]=g;
                arr[2][i]=b;
            }
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n-1;j++){
                    if(c[i]==c[j]){
                        continue;
                    }
                    int u=j+(j-i);
                    if((c[i]=='R' && c[j]=='G') || (c[i]=='G' && c[j]=='R')){
                        ans+=arr[2][j+1];
                        if(B.contains(u)){
                            ans--;
                        }
                    }else if((c[i]=='R' && c[j]=='B') || (c[i]=='B' && c[j]=='R')){
                        ans+=arr[1][j+1];
                        if(G.contains(u)){
                            ans--;
                        }
                    }else if((c[i]=='G' && c[j]=='B') || (c[i]=='B' && c[j]=='G')){
                        ans+=arr[0][j+1];
                        if(R.contains(u)){
                            ans--;
                        }
                    }
                }
            }

            System.out.println(ans);

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
