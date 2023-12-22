import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
  private static final int IROHA = 17;
  public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
      String input = scan.nextLine();
      String[] arr = input.split("\\s");
      
      List<String> list = new ArrayList<>();
      for (int i = 0; i < Integer.parseInt(arr[0]); i++) {
      	input = scan.nextLine();
        list.add(input);
      }
                                               
      String result = list.stream().sorted().collect(Collectors.mapping(s -> s, Collectors.joining()));
      System.out.println(result);
        
    }
  }
}