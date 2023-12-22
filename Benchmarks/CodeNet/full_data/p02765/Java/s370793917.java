import java.util.Scanner;

class Main {
    public static void main(String[] args) {
      	Scanner sc = new Scanner(System.in);
		var N = sc.nextInt();
		var R = sc.nextInt();
        int H;
        if (N >= 10) {
            H = R;
        } else {
            var x = 10-N;
            var y = 100*x;
            H = N-y;
        }
        System.out.println(H);
    }
}
