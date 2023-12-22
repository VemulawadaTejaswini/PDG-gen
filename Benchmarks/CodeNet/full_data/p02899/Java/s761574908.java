import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int count = scanner.nextInt();
      
      Map<Integer, Integer> students = new HashMap();
      for (int i = 0 ; i < count; i++) {
      	int num = scanner.nextInt();
        students.put(num, i + 1);
      }

      for (int i = 0 ; i < count; i++) {
        System.out.print(students.get(i + 1) + " ");
      }
    }
}