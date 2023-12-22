import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt(), x = sc.nextInt();
        int[] a = new int[n];
        long total = 0;
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
            total += a[i];
        }
        Arrays.sort(a);
        int count = 0;
        if(x==total){
            System.out.println(n);
        } else if(x>total){
            System.out.println(n-1);
        } else {
            for(int i = 0;i<a.length;i++){
                if(x>=a[i]){
                    x -= a[i];
                    count ++;
                } else {
                    break;
                }
            }
            System.out.println(count);
        }
    }
}