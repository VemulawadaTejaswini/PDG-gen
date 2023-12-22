import java.util.*;
import java.lang.Math;
 
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int min = 100;
    int[] data = new int[3];
    data[0] = sc.nextInt();
    data[1] = sc.nextInt();
    data[2] = sc.nextInt();
    int[] sumData = new int[3];
    for(int i = 1; i < sumData.length;i++){
      sumData[i - 1] = data[i - 1] + data[i];
    }
 
    for(int i = 0; i < sumData.length; i++)
      min = Math.min(min,sumData[i]);
    System.out.println(min);
  }
}