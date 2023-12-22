import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for(int i=0; i<n; i++){
            a[n] = sc.nextLong();
        }
        Arrays.sort(a);
        long side1 = 0;
        long side2 = 0;
        
        for(int i=n-1; i>=0; i--){
            if(a[i] == a[i-1]){
                if(side1 == 0){
                    side1 = a[i];
                    i--;
                }else{
                    side2 = a[i];
                    break;
                }
            }
        }
        System.out.println(side1 * side2);
    }
}
