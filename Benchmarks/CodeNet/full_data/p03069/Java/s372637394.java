import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        char[] S = sc.next().toCharArray();

        int firstEmerge = 0;
        for (int i=0; i<N; i++) {
            if (S[i] == '#') {
                firstEmerge = i;
                break;
            }
        }

        int countSharp = 0;
        int countDot = 0;
        for (int i=firstEmerge; i<N; i++) {
            if (S[i] == '#') {
                countSharp++;
            } else {
                countDot++;
            }
        }
        System.out.println(Math.min(countSharp, countDot));
    }
}