import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String S = sc.next();

        String[] strArray = new String[S.length()];
        int count = 0;

        // 入力された文字列を配列に格納する
        for(int i = 0; i < S.length(); i++){
            strArray[i] = String.valueOf(S.charAt(i));
        }
        for(int i = 0; i < N-2; i++){
            for(int j = i+1; j < N-1; j++){
                if(strArray[i].equals(strArray[j])){
                    continue;
                }
                for(int k = j+1; k < N; k++){
                    if(!(j-i == k-j || strArray[j].equals(strArray[k]) || strArray[k].equals(strArray[i]))){
                        count += 1;
                    }
                }
            }
        }
        System.out.println(count);      
    }
}