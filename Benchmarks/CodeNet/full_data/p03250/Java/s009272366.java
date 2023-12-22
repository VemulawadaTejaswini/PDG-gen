import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> al = new ArrayList<>();
		for (int i=0; i<3; i++){
			al.add(Integer.parseInt(sc.next()));
		}

		System.out.println((10*al.get(2)+al.get(0)+al.get(1)));
	}
}