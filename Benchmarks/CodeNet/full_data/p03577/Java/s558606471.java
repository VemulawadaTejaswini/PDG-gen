import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        String[] aarray = scanner.nextLine().split(" ");
        ArrayList<String> aList = new ArrayList<>(Arrays.asList(aarray));
//        System.out.println(aList);

        int b = Integer.parseInt(scanner.nextLine());
        String[] barray = scanner.nextLine().split(" ");
        ArrayList<String> bList = new ArrayList<>(Arrays.asList(barray));
//        System.out.println(bList);

        if (a < b) {
            System.out.println("NO");
            return;
        }

        for (String s : bList) {
            int index = aList.indexOf(s);

//            System.out.println(s);
            if (index == -1) {
                System.out.println("NO");
                return;
            }

            aList.remove(index);
        }

        System.out.println("YES");
    }

}