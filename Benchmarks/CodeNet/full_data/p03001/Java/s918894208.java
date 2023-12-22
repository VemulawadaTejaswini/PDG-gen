import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int W, H, x, y;
	W = sc.nextInt();
	H = sc.nextInt();
	x = sc.nextInt();
	y = sc.nextInt();

	int judge;
	if (W % 2 == 1 || H % 2 == 1) {
	    judge = 0;
	} else {
	    if (x == W / 2 && y == H / 2) {
		judge = 1;
	    } else {
		judge = 0;
	    }
	}

	System.out.println((double)(W * H / 2) + " " + judge);
    }
}