import java.util.Scanner;

class Main {
    public static void main(String[] args) {
      	Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int n = 10;
		int m = K;
		String s = Integer.toString(Integer.parseInt(String.valueOf(N) ,n),m);



        int A = s.length();
        System.out.println(A);
    }
}
