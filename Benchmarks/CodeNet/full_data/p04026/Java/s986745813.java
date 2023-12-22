
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        boolean f = false;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                f = true;
                arr.add(i + 1);
                arr.add(i + 2);
                break;
            } else if (s.charAt(i) == s.charAt(i + 2)) {
                f = true;
                arr.add(i + 1);
                arr.add(i + 3);
                break;
            }
        }        
        if (f == true) {
            System.out.println(arr.get(0) + " " + arr.get(arr.size()-1));
        } else {
            System.out.println("-1 -1");
        }
    }

}
