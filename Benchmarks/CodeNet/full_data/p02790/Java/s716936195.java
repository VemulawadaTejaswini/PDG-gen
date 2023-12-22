import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    ArrayList<Integer> input = getInput();

	    String a = "";
	    String b = "";
	    for (int i = 0; i < input.get(0); i++) a += input.get(1);
        for (int i = 0; i < input.get(1); i++) b += input.get(0);

        if (a.compareTo(b) < 0) {
            Print(a);
        } else {
            Print(b);
        }
    }

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Integer> getInput() {
        String in = scanner.nextLine();

        ArrayList<Integer> result = new ArrayList<>();
        for (String t : in.split(" ")) {
            result.add(Integer.parseInt(t));
        }

        return result;
    }

    private static void Print(Object o) {
        System.out.println(o);
    }
}
