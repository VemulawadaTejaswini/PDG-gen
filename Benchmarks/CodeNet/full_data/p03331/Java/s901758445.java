import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int min=999999999;
        for(int a=1;a<N/2;a++){
            int A = a;
            int B = N-a;
            int sum=0;
            while(A!=0){
                sum+=A%10;
                A/=10;
            }
            while(B!=0){
                sum += B%10;
                B/=10;
            }
            if(min>sum) min = sum;
        }
        System.out.println(min);
    }
}