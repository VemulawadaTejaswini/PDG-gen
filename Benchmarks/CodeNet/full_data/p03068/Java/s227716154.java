import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String S = sc.next();
        int K = sc.nextInt()+1;
        char ans = S.charAt(K);

        for(int i = 0;i < S.length();i++){
            if(ans == S.caharAt(i)){
                System.out.print(ans);
            }else{
                System.out.print('*');
            }
        }
    }
}