import java.util.Scanner;
import java.util.Arrays;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int bow[] = new int[n];
    
    for(int i = 0; i < n; i++)
      bow[i] = sc.nextInt();
    Arrays.sort(bow);
      
   	int rows=0, cols=0;
    int index = bow.length-1;
    while(index > 0){
      if(rows == 0 && bow[index] == bow[index-1]){
        rows = bow[index];
        index -=2;
      	continue;
      }
      if(rows != 0 && bow[index] == bow[index-1])
        cols = bow[index];
      
      if(rows != 0 && cols != 0) break;
      index--;      
    }
    System.out.println(rows*cols);
  }
}