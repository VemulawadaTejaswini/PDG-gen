import java.util.*;

class Main {
	public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int tapCount = sc.nextInt();
    int needCount = sc.nextInt();
    float result = (float)(needCount - tapCount) / (float)(tapCount - 1) + 1;
    System.out.println((int)Math.ceil(result));
	}
}
