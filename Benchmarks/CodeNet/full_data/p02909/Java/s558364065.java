import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	String w[] = {"Sunny", "Cloudy", "Rainy"};
	String S = sc.next();

	int i;
	for (i = 0; i < 3; i++) {
	    if (S.equals(w[i])) {
		i++;
		break;
	    }
	}
	if (i == 3)
	    i = 0;

	System.out.println(w[i]);
    }
}