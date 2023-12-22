import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        String ans = "Yes";
        for(int i = 0 ;i<a.length;i++){
            a[i] = sc.nextLong();
        }
        Arrays.sort(a);
        for(int i = 0;i<a.length-1;i++){
            if(a[i]==a[i+1]){
                ans = "No";
                break;
            }
        }
        System.out.println(ans);
    }
}