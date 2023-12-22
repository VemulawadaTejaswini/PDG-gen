import static java.lang.Math.floor;
import java.util.Scanner;
public class Main {
        static Scanner scanner = new Scanner(System.in);
        static String S = scanner.next();
        static char[] chArray = S.toCharArray();  
        static int cnt;
        public static void main(String[] args) {
           
            cnt = 0;
            int Slen = S.length();
            for (int i=0; i < (int)floor(Slen/2); i++){
                int j=i+1;
                Boolean match = false;
                int n=0;
                while (j < S.length()){
                    if (chArray[i] == chArray[j]){
                        n= j;
                        match = true;
                    }
                    j++;
                }
                if (match){
                    int k=Slen-i-1;
                    if (j < k) bubble(j-1,k-1);
                    else bubble(k-1, j-1);
                } else {
                    cnt = -1;
                    break;
                }
            }
            System.out.println(cnt);
        };
        
    static private void bubble(int i,int j){
        if (i==j) return;
        for (int k=i; k<j; k++){
            char c;
            c=chArray[k];
            chArray[k]=chArray[k+1];
            chArray[k+1]=c;
            cnt++;
        }
    }
}