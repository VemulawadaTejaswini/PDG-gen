/*
 * Click `Run` to execute the snippet below!
 */
 
import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

public class Main {
  
  static long numPatties[] = new long[100];
  static long length[] = new long [100];
  
  //Finds the number of patties for the first X letters
  //And for the level L patty.
  static long solve(int L, long X){
    if(X == 0){
      return 0;
    }
    if(L == 0){
      return 1; 
    }
    //Case 1 When X == 1
    if(X == 1){
      return 0;
    }
    //Case 2
    else if(X > 1 && X <= 1 + length[L-1]){
      return solve(L-1, X-1);
    }
    //Case 3
    else if(X == 2 + length[L-1]){
      return numPatties[L-1] + 1;
    }
    //Case 4
    else if(X > 2 + length[L-1] && X <= 2 + 2*length[L-1]){
      return numPatties[L-1] + 1 + solve(L-1, X - 2 - length[L-1]);
    }
    //Case 5
    else{
      return numPatties[L];
    }
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long X = sc.nextLong();
    for(int i = 0; i<=N; i++){
      numPatties[i] = 1;
      //2^(L+1)
      for(int j = 1; j<=i+1; j++){
        numPatties[i] *= 2L; 
      }
      numPatties[i]--;
      length[i] = 1;
      //2^(L+2)
      for(int j = 1; j<=i+2; j++){
        length[i] *= 2L; 
      }
      length[i] -= 3;
    }
    System.out.println(solve(N, X));
  }
}
