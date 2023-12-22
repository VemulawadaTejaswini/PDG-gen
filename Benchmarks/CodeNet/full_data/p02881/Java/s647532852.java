import java.util.Scanner;

class Main {

    public static void main(String[] args)  {
	Scanner sc = new Scanner(System.in);

	long N = sc.nextLong();
	long x = 0;
	long y = 0;
	for (long i = N / 2 - 1; i > 1; i = i *  2/3) {
	    if (N % i == 0) {
		x = i;
		y = N / i;
		break;
	    }
	}

	if (x == 0)
	    System.out.println(N - 1);
	else
	    System.out.println(x + y - 2);
    }
}