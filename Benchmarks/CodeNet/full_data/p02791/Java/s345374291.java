import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int array[] = new int[num];
    int array_max[] = new int[num];
    int max = 0;
    for(int i = 0;i < num;i++){
      array[i] = sc.nextInt();
      if(max < array[i]){
        max = array[i];
      }
      array_max[i] = max;
    }
    int count = 0;
    for(int i = 0;i < num;i++){
      if(array_max[i] >= array[i]){
        count++;
      }
    }
    System.out.println(count);
  }
}