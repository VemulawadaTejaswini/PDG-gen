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
            int ans=0;
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(c[i]==c[j]){
                        continue;
                    }
                    for(int k=j+1;k<n;k++){
                        if(j-i==k-j){
                            continue;
                        }
                        if(c[k]!=c[j] && c[i]!=c[k]){
                            ans++;
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
