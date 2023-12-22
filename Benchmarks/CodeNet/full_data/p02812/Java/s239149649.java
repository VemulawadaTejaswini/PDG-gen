import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String str = sc.next();
        int ans = 0;
        char[] c = new char[N];
        String s = "ABC";
        char a = s.charAt(0);
        char b = s.charAt(1);
        char d = s.charAt(2);

        for(int i=0; i<=N-3; i++){
            c[i] = str.charAt(i);
            if(a==(c[i])){
                c[i+1] = str.charAt(i+1);
                if(b==(c[i+1])){
                    c[i+2] = str.charAt(i+2);
                    if(d==(c[i+2])){
                        ans += 1;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}