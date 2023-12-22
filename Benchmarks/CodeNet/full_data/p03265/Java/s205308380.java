import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int[][] array = new int[4][2];

    array[0][0] = sc.nextInt();
    array[0][1] = sc.nextInt();
    array[1][0] = sc.nextInt();
    array[1][1] = sc.nextInt();

    int[][] vec = new int[2][2];

    vec[0][0] = array[1][0] - array[0][0];
    vec[0][1] = array[1][1] - array[0][1];
    vec[1][0] = -vec[0][1];
    vec[1][1] = vec[0][0];

    array[2][0] = array[1][0] + vec[1][0];
    array[2][1] = array[1][1] + vec[1][1];
    array[3][0] = array[0][0] + vec[1][0];
    array[3][1] = array[0][1] + vec[1][1];


    String x_3 = String.valueOf(array[2][0]);
    String y_3 = String.valueOf(array[2][1]);
    String x_4 = String.valueOf(array[3][0]);
    String y_4 = String.valueOf(array[3][1]);

    System.out.println(x_3+" "+y_3+" "+x_4+" "+y_4);
  }
}