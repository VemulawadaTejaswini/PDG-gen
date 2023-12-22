import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String S = scanner.next();
        int count = 0;
        int min = N;

        char c[] = new char[N];
        for(int i = 0; i < N; i++){
            c[i] = S.charAt(i);
        }
        for(int i = 0; i < N; i++){
            for(int j = i + 1; j < N; j++){
                if(c[j] == 'E'){
                    count++;
                }
            }
            for(int j = 0; j < i; j++){
                if(c[j] == 'W'){
                    count++;
                }
            }
            //System.out.println(count);
            if(min > count){
                min = count;
            }
            count = 0;
        }
        System.out.println(min);
    }
}