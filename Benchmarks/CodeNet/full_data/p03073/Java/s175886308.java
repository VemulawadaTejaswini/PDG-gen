import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] line = scanner.nextLine().split("");
    
    int curr = Integer.parseInt(line[0]);
    int change = 0;
    for(int i = 1; i < line.length; i++) {
      if (curr == Integer.parseInt(line[i]) && i != line.length - 1) {
        change++;
        curr = Integer.parseInt(line[i]) == 0 ? 1 : 0;
      }
    }
    System.out.println(change);
  }
}