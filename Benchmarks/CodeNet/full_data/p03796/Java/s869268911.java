import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        long output=1;
        long mod=1000000007;
        for(int i=0;i<n;i++){
            output*=i+1;
            output%=mod;
        }
        System.out.println(output);
    }
}