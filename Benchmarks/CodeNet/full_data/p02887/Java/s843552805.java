import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        String S = input.next();

        int count = 1;
        for(int i = 0; i < N - 1; i++){
            if (!S.substring(i,i+1).equals(S.substring(i+1,i+2))){
                count++;
            }
        }

        System.out.println(count);

    }
}