import java.math.*;
import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int k[] = new int[n-1];
        int i = 0;
        while(i<k.length){
            k[i] = 0;
            i++;
        }
        int buf1 = 1;
        while(buf1<=n){
            int buf2 = buf1+1;
            while(buf2<=n){
                if(buf2>=y && buf1<=x){
                    k[(buf2-buf1-(y-x)+1)-1]++;
                    //System.out.println((buf2-buf1-(y-x)+2)-1);
                }
                else{
                    int k1[] = new int[2];
                    k1[0] = (buf2-buf1)-1;
                    k1[1] = (Math.abs(buf1-x)+1+Math.abs(y-buf2))-1;
                    Arrays.sort(k1);
                    k[k1[0]]++;
                    //System.out.println(k1[0]);
                }
                buf2++;
            }
            //System.out.println();
            buf1++;
        }
        
        int buf3 = 0;
        i = 0;
        while(i<k.length){
            buf3 = k[i];
            System.out.println(buf3);
            i++;
        }
    }
}