import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String tokens[] = scanner.nextLine().split(" ");
        
        System.out.println(Arrays.asList(tokens));
		scanner.close();

    }
}