import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int[] bou = new int[a];
        int all = 0;
        int ans = 0;
        for(int i=0;i<a;i++){
            int b = scan.nextInt();
            all+=b;
            bou[i]=b;
        }
        int c = all/2;
        int d = 0;
        int mem = 0;
        for(int i=0;i<a;i++){
            d+=bou[i];
            if(d==c){
                ans=0;
                break;
            }else if(d>c){
                int p = c-mem;
                int q = d-c;
                if(p>=q){
                    ans=p;
                    break;
                }else{
                    ans=q;
                    break;
                }
            }
            mem=d;
        }
        System.out.println(ans);
    }
}