import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt(),i=0;
        int[]a=new int[n];
        for(;i<n;){
            a[i++]=sc.nextInt();
        }
        Arrays.sort(a);
        int s=9999999;
        for(i=0;i+m-1<n;i++){
            s=Math.min(s,a[i+m-1]-a[i]);
        }
        System.out.print(s);
    }
}