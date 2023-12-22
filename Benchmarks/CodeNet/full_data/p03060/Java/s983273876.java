import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v=new int[n];
        for(int i=0;i<n;i++){
          v[i]= sc.nextInt();
        }
        int[] c=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
          c[i]= v[i]-sc.nextInt();
          sum+=c[i]>=0?c[i]:0;
        }
        System.out.println(sum);
    }
}
