import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String sp = sc.next();
        String T = sc.next();
        String ans = solve(sp,T);
        System.out.println(ans);
    }
    private static String solve(String sp, String T){
        String error = "UNRESTORABLE";
        int len1 = sp.length();
        int len2 = T.length();
        if(len1<len2) return error;
        for(int i=len1-len2; i>=0; i--){
            boolean flag = true;
            for(int j=0;j<len2;j++){
                if(sp.charAt(j+i)=='?'||T.charAt(j)==sp.charAt(j+i)) continue;
                else{
                    flag = false;
                    break;
                }
            }
            if(flag){
                StringBuilder sb = new StringBuilder();
                for(int j=0;j<i;j++){
                    if(sp.charAt(j)=='?') sb.append("a");
                    else sb.append(sp.charAt(j));
                }
                sb.append(T);
                for(int j=i+len2;j<len1;j++){
                    if(sp.charAt(j)=='?') sb.append("a");
                    else sb.append(sp.charAt(j));
                }
                return sb.toString();
            }
        }
        return error;
    }
}