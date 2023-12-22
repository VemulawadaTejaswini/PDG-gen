import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = Integer.parseInt(scanner.nextLine());
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    for (String element : scanner.nextLine().split(" ")) {
      numbers.add(Integer.parseInt(element));
    }
    
    Collections.sort(numbers);
    if (num == 2) {
      System.out.println(numbers.get(1));
      return;
    }
    
    int max = 0;
    int g = 0;
    for (int i = 0; i < num - 1; i++) {
      for (int j = i + 1; j < num; j++) {
        g = gcd(numbers.get(i), numbers.get(j));
        if (max < g) {
          max = g;
        }
      }
    }
    System.out.println(max);
  }
  
  public static int gcd(int a, int b) {
    if(b==0) return a;
    return gcd(b, a%b);
  }
}