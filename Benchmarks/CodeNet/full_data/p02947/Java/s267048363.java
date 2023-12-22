import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] s = new String[N];
        
        //sに格納
        String a = "";
        for(int i = 0; i < N; i++) {
            a = sc.next();
            String[] sp = a.split("");
            Arrays.sort(sp);
            for(int j = 0; j < 10; j++) {
                s[i] += sp[j];
            }
        }
        
        //ソート
       Arrays.sort(s);
       
       long ans = 0;
       for(int i = 0; i < N; i++) {
           for(int j = i + 1; j < N; j++) {
                if(s[i].equals(s[j])) {
                    ans++;
                }
           }
           
       }
       
       System.out.println(ans);
    }
}