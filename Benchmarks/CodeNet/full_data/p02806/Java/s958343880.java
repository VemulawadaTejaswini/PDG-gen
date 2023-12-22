import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String X = sc.next();
        // String s[];
        // int t[];
        String s[] = new String[N];
        int t[] = new int[N];

        for (int i = 0; i < N; i++) {
            s[i] = sc.next();
            t[i] = sc.nextInt();
        }

    int result = 0;
        for (int j = 0; j < N; j++) {
            if (X.equals(s[j])) {
                result = j;
                break;
            }
        }
    int sum = 0;
        for (int k = result; k <= N; k++) {
            sum += k;
        }
        System.out.println(sum);
    }
}