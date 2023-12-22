import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    long[][] points = new long[n][2];
    for(int i = 0; i < n; i++) {
      points[i][0] = sc.nextLong();
      points[i][1] = sc.nextLong();
    }
    long min = 1000000000;
    for(int i = 0; i < n; i++) {
      for(int j = 0; j < n; j++) {
        for(int k = 0; k < n; k++) {
          if(i != j && i != k && j != k) {
            long recX1 = points[i][0];
            long recY1 = points[i][1];
            long recX2, recY2;
            if(points[j][0] >= points[k][0]) {
              if(points[j][0] >= recX1) {
                recX2 = points[j][0];
              } else {
                recX2 = points[k][0];
              }
            } else {
              if(points[k][0] >= recX1) {
                recX2 = points[k][0];
              } else {
                recX2 = points[j][0];
              }
            }
            if(points[j][1] <= points[k][1]) {
              if(points[j][1] <= recY1) {
                recY2 = points[j][1];
              } else {
                recY2 = points[k][1];
              }
            } else {
              if(points[k][1] >= recY1) {
                recY2 = points[k][1];
              } else {
                recY2 = points[j][1];
              }
            }
            int countA = 0;
            int countB = 0;
            for(int s = 0; s < points.length; s++) {
              if(checkIfInside(recX1, recY1, recX2, recY2, points[s][0], points[s][1])) {
                countA++;
              }
              if(checkIfInside(recX1, recY1, points[j][0], points[j][1], points[s][0], points[s][1])) {
                countB++;
              }
            }
            if(countA >= m) {
              min = Math.min(min, (long)(Math.abs(recX2-recX1)*Math.abs(recY2-recY1)));
            }
            if(countB >= m) {
              min = Math.min(min, (long)(Math.abs(points[j][0]-recX1)*Math.abs(points[j][1]-recY1)));
            }
          }
        }
      }
    }
    System.out.println(min);
  }
  
  private static boolean checkIfInside(long recX1, long recY1, long recX2, long recY2, long x, long y) {
    return ((x >= recX1 && x <= recX2) || (x >= recX2 && x <= recX1)  && 
      ((y >= recY1 && y <= recY2) || y >= recY2 && y <= recY1));
  }
}
