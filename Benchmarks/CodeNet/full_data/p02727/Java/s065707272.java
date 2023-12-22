import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        long p[] = new long[a];
        long q[] = new long[b];
        long r[] = new long[c];

        for(int i=0;i<a;i++)p[i]=sc.nextInt();
        for(int i=0;i<b;i++)q[i]=sc.nextInt();
        for(int i=0;i<c;i++)r[i]=sc.nextInt();

        Arrays.sort(p);
        Arrays.sort(q);
        Arrays.sort(r);

        long red[] = new long [x+1];
        long green[] = new long[y+1];
        red[x]=Long.MAX_VALUE;
        green[y]=Long.MAX_VALUE;

        for(int i=0;i<x;i++){
            red[i]=p[a-i-1];
        }
        for(int i=0;i<y;i++){
            green[i]=q[b-i-1];
        }

        Arrays.sort(red);
        Arrays.sort(green);

        int redP = 0;
        int greenP = 0;

        for(int i=c-1;i>=0;i--){
            //System.out.println("r:"+r[i]+" red:"+red[redP]+" grn:"+green[greenP]);

            if(r[i]<=red[redP]&&r[i]<=green[greenP])break;

            if(r[i]>red[redP]&&r[i]>green[greenP]){
                if(red[redP]>=green[greenP]){
                    red[redP]=r[i];
                    redP++;
                }else{
                    green[greenP]=r[i];
                    greenP++;
                }
            }else if(r[i]>red[redP]){
                red[redP]=r[i];
                redP++;
            }else{
                green[greenP]=r[i];
                greenP++;
            }
        }

        long ans = 0;

        for(int i=0;i<x;i++)ans+=red[i];
        for(int i=0;i<y;i++)ans+=green[i];


        System.out.println(ans);

    }

}
