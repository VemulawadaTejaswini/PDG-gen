import java.util.Scanner;

public class Main {

    Main(){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String S = scanner.next();

        int total = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N-1; j++) {
                    for (int k = j+1; k < N; k++) {
                        if(j-i != k-j){
                            if(S.charAt(i) != S.charAt(j)
                                && (S.charAt(j) != S.charAt(k)
                                && S.charAt(i) != S.charAt(k))){
                                total++;
                            }
                        }
                    }
            }
        }
        System.out.println(total);
    }

    public static void main(String[] args) {
        new Main();
    }
}
