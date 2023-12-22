import java.util.Scanner;
import java.lang.Math;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next()); //switch
        int m = Integer.parseInt(sc.next()); // light
        int b[] = new int[m];
        for(int i=0;i<m;i++){
            int k = Integer.parseInt(sc.next());
            for(int j=0;j<k;j++){
                int l = Integer.parseInt(sc.next());
                b[i] += Math.pow(2,l-1);      
            }
        }
        int p[] = new int[m];
        for(int j=0;j<m;j++){
            p[j] = Integer.parseInt(sc.next());
        }
        int all=0;
        int count = 0;
        for(int i=0;i<Math.pow(2,n);i++){
            for(int j=0;j<m;j++){
                int a = b[j] & i;
                int sum=0;
                for(int k=0;k<n;k++){
                    if((a & 1) == 1){
                        sum++;
                    }
                    a /= 2;
                }
                if(p[j] != sum%2){
                    break;
                }
                count++;
            }
            if(count==m){
                all++;
            }
            count = 0;
        }
        System.out.println(all);
        sc.close();
    }
}