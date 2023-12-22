import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
 
        List<String> list = new ArrayList<>();
 
        for (int i = 0; i < count; ++i)
            list.add(scanner.next());
 
        if (list.stream().distinct().count() < list.size()) {
            System.out.println("No");
            return;
        }
 
        boolean isSuccess = true;
        for (int i = 1; i < list.size(); ++i) {
            if (!list.get(i).startsWith("" + list.get(i - 1).toCharArray()[list.get(i - 1).length() - 1])) {
                isSuccess = false;
                break;
            }
        }
 
        if (isSuccess)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}