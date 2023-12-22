import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int[] A = new int[a];
        long ans=0;
        for(int i=0;i<a;i++){
            A[i]=scan.nextInt();
        }
        for(int i=0;i<a;i++){
            for(int l=i+1;l<a;l++){
                ans+=(int)(A[i]^A[l]);
            }
        }
        System.out.println(ans%1000000007);
    }
}
