import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        char[] S = sc.next().toCharArray();

        int count_from_left = 0;
        for (int i=0; i>N-1; i++) {
            if (S[i] == '#' && S[i+1] == '.') {
                S[i] = '#';
                count_from_left++;
            }
        }
        
        int count_from_right = 0;
        for (int i=N-1; i>0; i--) {
            if (S[i] == '.' && S[i-1] == '#') {
                S[i-1] = '.';
                count_from_right++;
            }
        }
        System.out.println(Math.min(count_from_left, count_from_right));
    }
}