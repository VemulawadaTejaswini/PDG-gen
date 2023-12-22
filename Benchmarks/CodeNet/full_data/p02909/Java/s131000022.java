import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> W = new ArrayList<>(Arrays.asList("Sunny", "Cloudy", "Rainy"));
        System.out.println(W.get((W.indexOf(new Scanner(System.in).next()) + 1) % 3));
    }
}
