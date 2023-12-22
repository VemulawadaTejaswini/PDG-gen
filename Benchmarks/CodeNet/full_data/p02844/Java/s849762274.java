import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        String b = scan.next();
        char[] c = b.toCharArray();
        int d=0;
        int e=0;//100
        int f=0;//10
        int g=0;//1
        int ans=0;
        int cou=0;
        for(int l=0;l<1000;l++){
            d=g;
            loop : for(int i=0;i<a;i++){
                if(d==(int)c[i]-48){
                    switch(cou){
                        case 0:d=f;cou++;break;
                        case 1:d=e;cou++;break;
                        case 2:ans++;break loop;
                    }
                }
            }
            cou=0;
            g++;
            if(g==10){
                g=0;
                f++;
                if(f==10){
                    f=0;
                    e++;
                }
            }
        }
        System.out.println(ans);
    }
}
