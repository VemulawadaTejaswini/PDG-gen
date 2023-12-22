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
            H = 100*x;
        }
        System.out.println(H);
    }
}
