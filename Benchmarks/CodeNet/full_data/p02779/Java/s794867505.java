import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[100000001];
        String ans = "Yes";
        for(int i = 0 ;i<a.length;i++){
            a[i] = sc.nextInt();
            b[a[i]] ++;
        }
        for(int i = 0; i<100000001;i++){
            if(b[i]>1){
                ans = "No";
                break;
            }
        }
        System.out.println(ans);
    }
}