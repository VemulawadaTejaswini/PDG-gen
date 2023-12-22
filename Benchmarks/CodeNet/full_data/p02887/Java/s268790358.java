import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        int N;
        String S;

        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            S = sc.next();

        }
        long result =1;
        char[] arr= S.toCharArray();
        for (int i = 0; i < arr.length -1; i++) {
            if(arr[i] != arr[i+1]){
                result++;
            }
        }
        System.out.println(result);
    }

}
