import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean flag =  false;
    int num;
    int count = 0;
    int[] array = new int[n];

    for(int i=0; i<n; i++){
      num = sc.nextInt();
      array[i] = num;
    }

    for(int a : array){
      if(a%2==0){
        if((a%3==0)||(a%5==0)){
          flag = true;
        }else{
          flag = false;
          break;
        }

      }
    }

    if(flag){
      System.out.println("APPROVED");
    }else{
      System.out.println("DENIED");
    }



  }
}