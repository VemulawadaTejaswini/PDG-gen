import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int count = 1;
    sc.nextLine();
    String line = sc.nextLine();
    String[] array = line.split(" ");
    int [] input = new int[a];
    for(int i = 0; i < a ; i++){
      input[i] = Integer.parseInt(array[i]);
      for(int j = 0; j < i; j++){
        if(input[j] < input[i]){
          break;
        }
        if( j == i-1){
          count++;
        }
      }
    }
    System.out.println(count);
  }
}
    
    
