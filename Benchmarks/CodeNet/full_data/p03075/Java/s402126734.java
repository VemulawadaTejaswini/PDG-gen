import java.util.*;

public class Main {

  private long criticalPath = 0; 
  private long people = 0;

  public static void main(String[] args) {
    Main m = new Main();
    m.read();
    m.exec();
  }

  private void read() {
    Scanner scan = new Scanner(System.in);
    people = scan.nextLong();
    criticalPath = people;
    for (int i = 0; i < 5; i++) {
      long path = scan.nextLong();
      if (criticalPath > path) {
        criticalPath = path;
      }
    }
  }

  private void exec() {
    long time = people / criticalPath + 4;
    if (people % criticalPath != 0) {
      time++;
    }
    System.out.println(time);
  }
}