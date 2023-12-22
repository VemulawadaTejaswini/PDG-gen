import java.util.Scanner;

class Main {
    public static void main(String[] args) {
      	Scanner sc = new Scanner(System.in);
		var x = sc.nextInt();
		var y = sc.nextInt();
        if (x >= 10) {
            var A = y;
        } else {
            var a = 10-x;
            var b = 100*a;
            var A = y + b;
        }
        System.out.println(A);
    }
}
