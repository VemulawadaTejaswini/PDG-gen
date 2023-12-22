import java.util.*;
import java.io.*;

class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    int[][] c = new int[10][10];
    for(int i = 0; i < 10; i++) {
      for(int j = 0; j < 10; j++) {
        c[i][j] = sc.nextInt();
      } 
    }
    int[][] paths = new int[10][10];
    for(int i = 0; i < 10; i++) {
      for(int j = 0; j < 10; j++) {
        paths[i][j] = c[i][j];
      }
    }
    for(int k = 0; k < 10; k++) {
      for(int i = 0; i < 10; i++) {
        for(int j = 0; j < 10; j++) {
          paths[i][j] = Math.min(paths[i][j], paths[i][k]+paths[k][j]);
        }
      }
    }
    
    int sum = 0;
    for(int i = 0; i < h; i++) {
      for(int j = 0; j < w; j++) {
        int curr = sc.nextInt();
        if(curr != -1 && curr != 1){
          sum += paths[curr][1];
        }
      }
    }
    System.out.println(sum);
  }
}
