import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Set<String> set = new HashSet<>();
        set.add(scanner.next());
        set.add(scanner.next());
        set.add(scanner.next());

        System.out.println(set.size() ==2 ? "Yes" : "No");

    }

}