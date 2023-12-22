import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int num[] = new int[5];

    for(int i=0; i<=4; i++){
      num[i] = scanner.nextInt();
    }
    int k = scanner.nextInt();


    for(int i=0; i<=4; i++){
      for(int j=4; j<0; j--){
        int temp;

        if(num[i] > num[j]){
          temp = num[i] - num[j];
        }else{
          temp = num[j] - num[i];
        }

        if(temp > k){
          System.out.println(":(");
          return;
        }
      }
    }
    System.out.println("Yay!");
    return;

  }
}