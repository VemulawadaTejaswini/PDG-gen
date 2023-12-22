import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] box = new int[3];
		for(int i = 0; i < 3; i++) box[i] = in.nextInt();
		swap(box, 0, 1);
	    swap(box, 0, 2);
	    System.out.println(Arrays.toString(box).replace("[", "").replace("]", "").replace(",", ""));
	}
	public static void swap(int[] box, int a, int b) {
		int temp = box[a];
		box[a] = box[b];
		box[b] = temp;
	}
}