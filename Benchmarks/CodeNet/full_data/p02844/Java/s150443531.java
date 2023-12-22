import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char s[] = sc.next().toCharArray();
        int luck[] = new int[n];
        for(int i=0;i<n;i++){
            luck[i]=Integer.parseInt(""+s[i]);
        }
        int count[] = new int[10];

        int ans = 0;
        for(int i=0;i<10;i++)for(int j=0;j<10;j++)for(int k=0;k<10;k++){
            int l=0;
            boolean ok=false;
            for(;l<n;l++){
                if(luck[l]==i)break;
            }
            for(l++;l<n;l++){
                if(luck[l]==j)break;
            }
            for(l++;l<n;l++){
                if(luck[l]==k){
                    ok=true;
                    break;
                }
            }
            if(ok)ans++;
        }
        System.out.println(ans);
    }
}