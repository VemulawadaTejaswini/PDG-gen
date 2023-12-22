import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int array[] = new int[num];
    int array_min[] = new int[num];
    int min = num + 1;
    for(int i = 0;i < num;i++){
      array[i] = sc.nextInt();
      if(min > array[i]){
        min = array[i];
      }
      array_min[i] = min;
    }
    int count = 0;
    for(int i = 0;i < num;i++){
      if(array_min[i] >= array[i]){
        count++;
      }
    }
    System.out.println(count);
  }
}