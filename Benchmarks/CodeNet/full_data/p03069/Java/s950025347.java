import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String S = sc.next();

        int count = 0;
        char setchar = '0';
        for (int i=0; i<N-1; i++) {
            setchar = S.charAt(i);
            // case : black
            if (setchar == '#') {
                setchar = S.charAt(i+1);
                if (setchar == '.') {
                    S.replace('.', '#');
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}