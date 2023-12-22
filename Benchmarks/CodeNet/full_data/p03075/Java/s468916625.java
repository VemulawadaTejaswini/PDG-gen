import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int[] array = new int[5];
    for(int i=0; i<5; i++){
      array[i] = sc.nextInt();
    }

    int k = sc.nextInt();

    int sub = array[4] - array[0];

    if(sub>k){
      System.out.println(":(");
    }else{
      System.out.println("Yay!");
    }
  }
}