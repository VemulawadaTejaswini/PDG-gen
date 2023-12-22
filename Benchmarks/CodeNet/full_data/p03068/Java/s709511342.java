import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String S = scan.next();
        int K = scan.nextInt() - 1;
        char c = S.charAt(K);
        String str = "";
        char tmp = S.charAt(0);
        for(int i = 0; i < N; i++){
            tmp = S.charAt(i);
            if(c == tmp){
                str += tmp;
            }else{
                str += "*";
            }
        }
        System.out.println(str);
    }
}
