import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        String S1 = scan.next();
        char[] S = S1.toCharArray();

        String w;
        int num = 0;
        for(int i=0; i<1000; i++){
            int c=0;
            w = String.valueOf(i);
            for(int k=0; k<3; k++) {
                if (w.length() <= 2) {
                    w = "0" + w;
                }
            }
            char[] n = w.toCharArray();
            for(int j=0; j<N; j++){
                if(n[c] == S[j]){
                    c++;
                    if(c==3){
                        num++;
                        break;
                    }
                }
            }
        }
        System.out.println(num);
    }
}