import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

	Scanner std = new Scanner(System.in);


	//List<Integer> list = new ArrayList<>();
	int W = std.nextInt();
	int H = std.nextInt();
	int x = std.nextInt();
	int y = std.nextInt();

	//四角形の中心の場合 1
	int full = W*H;
    double half = (double)full/2;
	System.out.println(half);




	if(x == W/2 && y == H/2) {
		System.out.println('1');
	}
	else {
	System.out.println('0');
	}

	}


	}


