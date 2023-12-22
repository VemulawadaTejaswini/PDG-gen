
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://qiita.com/drken/items/fd4e5e3630d0f5859067
 *
 * @author YukihiroLocal
 *
 */
public class Main {
  public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    // get a integer

    int N = sc.nextInt();
    // System.out.println(" integer is " + N);

    List<Coordinate> coordinateList = new ArrayList<>();
    coordinateList.add(new Coordinate(0, 0, 0));
    for (int i = 0; i < N; i++) {
      int t = sc.nextInt();
      int x = sc.nextInt();
      int y = sc.nextInt();

      coordinateList.add(new Coordinate(t, x, y));
    } ;
    boolean continueFlag = true;
//    //N=1
//    int diffT =Math.abs( coordinateList.get(0).getT());
//    int diffX =Math.abs( coordinateList.get(0).getX());
//    int diffY =Math.abs( coordinateList.get(0).getY());
//    if(diffT >= diffX + diffY && (diffT - diffX - diffY ) % 2 == 0){
//      continueFlag = true;
//    }else {
//      continueFlag = false;
//    }

    //N>1
    for(int i = 0 ; i < N ; i++){
      int diffT =Math.abs( coordinateList.get(i).getT() - coordinateList.get(i+1).getT());
      int diffX =Math.abs( coordinateList.get(i).getX() - coordinateList.get(i+1).getX());
      int diffY =Math.abs( coordinateList.get(i).getY() - coordinateList.get(i+1).getY());
      if(diffT >= diffX + diffY && (diffT - diffX - diffY ) % 2 == 0){
        continueFlag = true;
      }else {
        continueFlag = false;
        break;
      }
    }
    if(continueFlag){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }

  };
}


class Coordinate {
  int t, x, y;

  Coordinate(int t, int x, int y) {
    this.t = t;
    this.x = x;
    this.y = y;
  }

  int getX() {
    return this.x;
  };

  int getT() {
    return this.t;
  };

  int getY() {
    return this.y;
  };
}
