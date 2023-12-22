// "static void main" must be defined in a public class.
import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] a = new int[x];
        int c=0;
        for(int i=0;i<x;i++){
            a[i] = sc.nextInt();
            c=c+a[i];
        }
        int count=0;
        for(int j=0;j<a.length;j++){
            if((a[j]*4*y)>=c){count++;}
            if(count==y){System.out.println("Yes");return;}
        }
        
        
        System.out.println("No");
    }
}
