import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n], b= new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        for(int i=0;i<n;i++) b[i]=sc.nextInt();
        long need=0,have=0;
        for(int i=0;i<n;i++){
            if(a[i]<=b[i]){
                have += b[i]-a[i];
            }else{
                need += 2*(a[i]-b[i]);
            }
        }
        String ans = have>=need?"Yes":"No";
        System.out.println(ans);
    }
}
