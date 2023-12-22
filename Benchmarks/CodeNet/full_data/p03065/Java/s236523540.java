import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N = sc.nextInt()+1;
        // スペース区切りの整数の入力
        int[] a =new int[N];
        int sum=0;
        a[0]= sc.nextInt();
        int g=a[0];
        for(int i=1;i<N;i++){
           a[i]= sc.nextInt();
           g=gcd(g,a[i]);
        }
        int result2=0;
        for(int i=0;i<N-1;i++){
            if(a[i]%2!=0){
                result2++;
            }
        }
        if(result2%2==0&&a[N-1]%2==0){
            System.out.println(2);
        }
        int b=2;
        g=Math.abs(g);

        while(Math.sqrt(g)>=b){
            if(g%b==0){
                while(g%b==0){
                    g=g/b;
                }
                if(b!=2) {
                    System.out.println(b);
                }
            }
            b++;
        }
        if(g!=1){
            System.out.println(g);
        }
    }
    static int gcd (int a, int b) {
        int temp;
        while((temp = a%b)!=0) {
            a = b;
            b = temp;
        }
        return b;
    }
}