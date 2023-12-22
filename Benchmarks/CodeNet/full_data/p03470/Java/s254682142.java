import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner dataScanner = new Scanner(System.in);
        int numLayers = Integer.parseInt(dataScanner.nextLine());
        HashSet<Integer> diameter = new HashSet<Integer>();
        for (int i = 0; i < numLayers; i++) {
            diameter.add(Integer.parseInt(dataScanner.nextLine()));
        }
        System.out.println(diameter.size());
    }
}
