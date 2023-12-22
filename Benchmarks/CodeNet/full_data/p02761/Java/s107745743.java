import java.util.*;
public class Main{
    public static void main(String[] args) throws Exception {
      
        Scanner sc = new Scanner(System.in);
        int n,m;
        n=sc.nextInt();
        m=sc.nextInt();
        int[] s=new int[m];
        int[] c=new int[m];
        for(int i=0;i<m;i++){
            s[i]=sc.nextInt();
            c[i]=sc.nextInt();
        }
      
        System.out.println(solve(n,m,s,c));
    }

    public static String solve(int n,int m,int[] s,int[] c){
        for(int i=0;i<1000;i++){
            String str=String.valueOf(i);
            if(ok(str,n,m,s,c)){
                return str;
            }
        }
        return "-1";
    }

    public static Boolean ok(String str,int n,int m,int[] s,int[] c){
        if(n!=str.length()) return false;
        for(int i=0;i<m;i++){
            if(str.charAt(s[i]-1)!=c[i]+'0') return false;
        }
        return true;
    }
}