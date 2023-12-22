import java.util.*;

public class Main {
  public static double areaCalc(int point_x, int point_y, int width, int height) {
    double area;
    if(height < (((double)point_y / point_x) * width)) {
      area = height * ((double)point_x / point_y) * height / 2.0;
    } else {
      area = width * ((double)point_y / point_x) * width / 2.0;
    }
    return area;
  }

  public static void main(String[] args) {
    int width, height, point_x, point_y, check = 0, rectangle;
    double area, max_area = 0.0, temp_a = 0.0, temp_b = 0.0;
    Scanner sc = new Scanner(System.in);
    width = Integer.parseInt(sc.next());
    height = Integer.parseInt(sc.next());
    point_x = Integer.parseInt(sc.next());
    point_y = Integer.parseInt(sc.next());
    rectangle = height * width;
    if((point_x == width || point_x == 0) || (point_y == height || point_y == 0)) {
      max_area = rectangle / 2.0;
      check = 0;
    } else {
      if(point_x <= width / 2) {
        temp_a = point_x * height;
      } else {
        temp_a = (width - point_x) * height;
      }
      if(point_y <= height / 2) {
        temp_b = point_y * width;
      } else {
        temp_b = (height - point_y) * width;
      }
      if(temp_a == temp_b) {
        max_area = temp_a;
        check = 1;
      } else {
        max_area = Math.max(temp_a, temp_b);
      }
      area = areaCalc(point_x, point_y, width, height);
      if(max_area < area) {
        max_area = area;
        check = 0;
      } else if(max_area == area) {
        check = 1;
      }
      area = areaCalc(width - point_x, point_y, width, height);
      if(max_area < area) {
        max_area = area;
        check = 0;
      } else if(max_area == area) {
        check = 1;
      }
      area = areaCalc(point_x, height - point_y, width, height);
      if(max_area < area) {
        max_area = area;
        check = 0;
      } else if(max_area == area) {
        check = 1;
      }
      area = areaCalc(width - point_x, height - point_y, width, height);
      if(max_area < area) {
        max_area = area;
        check = 0;
      } else if(max_area == area) {
        check = 1;
      }
    }
    if(max_area == rectangle / 2.0) check = 1;
    else check = 0;
    max_area = rectangle / 2.0;
    System.out.println(max_area + " " + check);
  }
}
