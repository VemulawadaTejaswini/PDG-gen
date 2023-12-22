import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        int count = 0;
        int max = 0;


        for(int i = 0; i<S.length(); i++) {
            switch(S.charAt(i)) {
                case 'A':
                case 'T':
                case 'C':
                case 'G':
                    count++;
                    break;
                default:
                    if (count > max){
                        max = count;
                    }
                    count = 0;
                    break;
            }
        }
        System.out.println(max);
    }
}