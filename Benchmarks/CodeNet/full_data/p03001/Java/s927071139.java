import java.util.*;

public class Main {
  public static void main(String[] args) {
    int width, height, point_x, point_y, check = 0;
    long rectangle;
    double max_area = 0.0;
    Scanner sc = new Scanner(System.in);
    width = Integer.parseInt(sc.next());
    height = Integer.parseInt(sc.next());
    point_x = Integer.parseInt(sc.next());
    point_y = Integer.parseInt(sc.next());
    rectangle = height * width;
    max_area = rectangle / 2.0;
    if(point_x == width / 2 && point_y == height / 2) check = 1;
    System.out.println(max_area + " " + check);
  }
}
