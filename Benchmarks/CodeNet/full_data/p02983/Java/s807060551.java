import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int L, R;
	L = sc.nextInt();
	R = sc.nextInt();

	int i;
	boolean bl = false;
	for (i = L; i <= R; i++) {
	    if (i % 2019 == 0) {
		bl = true;
		break;
	    }
	}

	if (bl) {
	    System.out.println(0);
	} else {
	    System.out.println((L % 2019) * ((L + 1) % 2019));
	}
    }
}