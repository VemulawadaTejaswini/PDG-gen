import java.util.*;
import static java.lang.Math.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int i = 0;
        while(x>0){
            x -= a[i];
            i++;
            if(i == a.length){
                break;
            }
        }
        if(x>0) i--;
        System.out.println(i);
    }
}