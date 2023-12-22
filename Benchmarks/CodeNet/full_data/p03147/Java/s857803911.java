import java.util.Scanner;

public class Main{
  public static void main(String[] args){
  	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int array[] = new int[n];
    for(int i = 0; i < n; i++)
      array[i] = sc.nextInt();
    
    
    int count = 0;
    while(true){
      if(maxArray(array) == 0) break;
      int i = 0;
      while (i < n) {
        if (array[i] == 0) i++;
        else{
          count++;
          while (i < n && array[i] > 0){
            array[i]--;
            i++;
          }
        }
      }
    }
    System.out.println(count);
  }
  
  static int maxArray(int array[]){
    int max = 0;
    for(int i = 0; i < array.length; i++)
      if(max < array[i]) max = array[i];
    return max;
  }
}