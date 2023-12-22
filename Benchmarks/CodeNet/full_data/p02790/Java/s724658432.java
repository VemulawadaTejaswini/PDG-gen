import java.util.Scanner;

class Main {

    public static void print_ans(int n, int m) {
	for (int i = 0; i < m; i++) {
	    System.out.print(n);
	}
	System.out.println();
    }
    
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int a = sc.nextInt();
	int b = sc.nextInt();

	if (a < b)
	    print_ans(a, b);
	else
	    print_ans(b, a);
    }

}