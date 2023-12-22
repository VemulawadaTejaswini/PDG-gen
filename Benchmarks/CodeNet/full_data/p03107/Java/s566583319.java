import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        char[] S = sc.next().toCharArray();

        int countRed = 0;
        int countBlue = 0;
        for(int i = 0; i < S.length; i++){
            if('0' == S[i]){
                countRed++;
            }
        }
        for(int i = 0; i < S.length; i++){
            if('1' == S[i]){
                countBlue++;
            }
        }

        System.out.println(Math.min(countRed,countBlue)*2);

    }
}