import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length() - 1;
        long ans = 0L;
        for(int i=0; i<Math.pow(2,n); i++){
            StringBuilder str = new StringBuilder(s);
            for(int j=n-1; j>=0; j--){
                if((1&i>>j) == 1){
                    str.insert(j+1,"+");
                }
            }
            String[] a = str.toString().split("+",0);
            for(int j=0; j<a.length; j++){
                ans += Long.parseLong(a[j]);
            }
        }
        System.out.println(ans);
    }
}