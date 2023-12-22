import java.util.Scanner;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String T = sc.nextLine();

        for(int i = S.length()-T.length();i>=0;i--){
            String sub = S.substring(i, i+T.length());
            int k;
            for(k=0;k<T.length();k++){
                if(sub.charAt(k)=='?')continue;

                if(sub.charAt(k)!=T.charAt(k))break;
            }
            if(k==T.length()){
                String ans = S.substring(0,i).replace('?', 'a');
                ans+=T;
                ans+=S.substring(i+T.length());
                System.out.println(ans);
                return;
            }
        }
        System.out.println("UNRESTORABLE");
    }
}