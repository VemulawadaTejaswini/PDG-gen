import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        int Q = sc.nextInt();
        String S = sc.next();
        String[] sn = new String[Q];
        int[] l = new int[Q];
        int[] r = new int[Q];
        String AC = "AC";

        for(int i=0; i<Q; i++){
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
            if(r[i]==N){
                sn[i] = S.substring(l[i] - 1);
            }
            else{
                sn[i] = S.substring(l[i] - 1, r[i]);
            }
        }
        for(int i=0; i<Q; i++){
            int ln = sn[i].length();
            int ans = 0;
            for(int j=0; j<ln-1; j++){
                if(sn[i].charAt(j)==AC.charAt(0)){
                    if(sn[i].charAt(j + 1)==AC.charAt(1)){
                        ans += 1;
                    }
                }
            }
            System.out.println(ans);
        }

    }
}