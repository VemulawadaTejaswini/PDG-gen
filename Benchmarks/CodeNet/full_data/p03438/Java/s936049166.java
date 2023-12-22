import java.util.*;
//APC001B
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i = 0;i < n;i++)a[i] = sc.nextInt();
        for(int i = 0;i < n;i++)b[i] = sc.nextInt();
        sc.close();
        int[] ary = new int[n];
        int minus = 0;
        int plus = 0;
        for(int i=0;i<n;i++){
            ary[i] = a[i]-b[i];
            if(ary[i]>0){
                plus+=ary[i];
            }else{
                minus-=ary[i];
            }
        }
        if(minus%2==0&&(plus-minus)%3==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}