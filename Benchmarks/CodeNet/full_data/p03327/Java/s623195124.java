import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	n = n%1000+1;
	System.out.printf("ABD%03d",n);
	System.out.println();
    }
}