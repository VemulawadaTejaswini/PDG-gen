
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        char[] c = S.toCharArray();
        long count = 0;
        for(int i=0;i<N;i++){
            for(int j=i;j<N;j++){
                if(c[i] == c[j]){   //c[i]==c[j]なら3文字目の判定はしない
                    continue;
                }

                for(int k=j;k<N;k++){
                    if(j-i == k-j){
                        continue;
                    }
                    if(c[i] != c[k] && c[j] != c[k]){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
