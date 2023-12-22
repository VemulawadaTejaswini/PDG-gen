import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int Q = scanner.nextInt();

        String S = scanner.next();

        int[] array = new int[S.length()];

        for(int i=1; i<S.length(); i++){
            if(S.charAt(i) == 'C' && S.charAt(i-1) == 'A'){
                array[i] = array[i-1] + 1;
            }else{
                array[i] = array[i-1];
            }
        }

        for(int i=0; i<Q; i++){
            int l = scanner.nextInt();
            l--;
            int r = scanner.nextInt();
            r--;
            System.out.println(array[r] - array[l]);
        }

    }
}
