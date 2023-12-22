import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
    String[] lines = getStdin();
    String a = lines[0];
    int num = Integer.parseInt(a);
    
    long total = 0;
    for (int i = 1; i <= num; i++){
        if (i % 3 == 0 && i % 5 == 0){
            String s = Integer.toString(i);
            s = "FizzBuzz";
        } else if (i % 3 == 0){
            String s = Integer.toString(i);
            s = "Fizz";
        } else if (i % 5 == 0){
            String s = Integer.toString(i);
            s = "Buzz";
        } else {
            total = total + i;
        }
    }
    System.out.println(total);
   
}
  
  private static String[] getStdin() {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> lines = new ArrayList<>();
    while (scanner.hasNext()) {
      lines.add(scanner.nextLine());
    }
    return lines.toArray(new String[lines.size()]);
  }
  
}