import java.util.Scanner;

class Main{

    private static int L;

    private static String Lstring(String s,String t){
        int Lt = L % s.length();
        while(Lt % t.length() != 0)Lt += s.length();
        int Ls = L - Lt;
        String ans = "";
        for(int i=0;i<Ls/s.length();++i)ans += s;
        for(int i=0;i<Lt/t.length();++i)ans += t;
        return ans;
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        L = scan.nextInt();
        String s = scan.next();
        String t = scan.next();

        String S = Lstring(s,t);
        String T = Lstring(t,s);

        if(S.compareTo(T)<0){
            System.out.println(S);
        }else{
            System.out.println(T);
        }

    }
}