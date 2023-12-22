import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        StringBuilder S = new StringBuilder();
        S.append("i");
        S.append(sc.next());
        int r =0,g=0,b=0;
        for(int i=1;i<=N;i++){
            if(S.charAt(i)=='R') r++;
            else if(S.charAt(i)=='G')g++;
            else b++;
        }
        int opt = r*g*b;
        for(int i=1;i<=N-2;i++){
            for(int j=i+1;j<=N-1;j++){
                if(2*j-i<=N){
                    if(S.charAt(i)!=S.charAt(j)&&S.charAt(j)!=S.charAt(2*j-i)&&S.charAt(i)!=S.charAt(2*j-i))opt--;
                }
            }
        }
        System.out.println(opt);
    }
}