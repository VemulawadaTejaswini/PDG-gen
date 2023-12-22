import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner s =new Scanner(System.in);
    
    int n = s.nextInt();
    
    Box b = new Box (n);
    
    b.job();
    System.out.println(n);
    b.print();
  }
}

class Box{
  int n;
  int[][] box;
  Box(int n){
    box = new int[n][n];
    this.n = n;
  }
  
  void job (){
    for(int i = 0;i<n; i++){
      for(int j = 0; j<n; j++){
        box[i][j]=i+1;
      }
    }
  }
  void print (){
    for(int i = 0;i<n; i++){
      for(int j = 0; j<n; j++){
        System.out.print(box[i][j]);
      }
      System.out.println();
    }
  }
}

