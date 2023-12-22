import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        StringBuilder OPT = new StringBuilder();
        OPT.append(S.charAt(0));
        int num =0;
        for(int i=1;i<S.length();i++) {
            if(OPT.charAt(num)!=S.charAt(i)){
                OPT.append(S.charAt(i));
                num++;
            }
        }
        System.out.println(OPT.length());
    }
}
