import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<String[]> input = new ArrayList<String[]>();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String[] s = sc.nextLine().split(" ");
            input.add(s);
        }
        sc.close();

        int a = Integer.parseInt(input.get(0)[0]);
        int b = Integer.parseInt(input.get(0)[1]);

        int pa = a * 3 / 2;
        int pb = a * 3 % 2 == 1 ? (b + 1) / 2 : b / 2;

        int pi = pa + pb;
        System.out.println(pi);
    }
}
