import java.util.*;
public class Main {
  public static void main(String[] args){

    int[] array = new int[101];

    for(int i = 1 ;i <=9 ; i++ ){
      for(int j = 1 ;i <=9 ; i++ ){
        array[i*j] = 1;
      }
    }


    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    if(array[a] == 1 ){
      System.out.println("Yes");
    } else {    	
      System.out.println("No");
    }
  }
}