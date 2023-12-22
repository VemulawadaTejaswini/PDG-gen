import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        char[] a = s.toCharArray();
        int ans =0;
        int tmp = 0;
        for(int i =0;i<n;i++){
            if(a[i]=='I'){
                tmp ++;
            }
            if(a[i]=='D'){
                tmp --;
            }
            ans =Math.max(ans,tmp);
        }
        System.out.println(ans);
    }
}