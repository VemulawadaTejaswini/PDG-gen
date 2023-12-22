import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] b=new int[n];
        int sum=0;
        for(int i=0;i<n;++i){
          b[i]= sc.nextInt();
          sum+=b[i];
        }
        sum=sum-2*(b[0]+b[1]);
        for(int i=1;i<n-1;++i){
          sum=(sum-2*(b[i]+b[i+1]))>sum?(sum-2*(b[i]+b[i+1])):sum;
        }
        System.out.println(sum);
    }
}
