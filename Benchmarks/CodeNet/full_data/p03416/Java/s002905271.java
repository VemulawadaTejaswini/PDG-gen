import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int A = sc.nextInt();
    int B = sc.nextInt();

    sc.close();

    int count = 0;

    for (int i = A; i <=B; i++){
      String s = String.valueOf(i);
      String[] arr = s.split("");
      if (arr[0].equals(arr[4]) && arr[1].equals(arr[3])){
        count++;
      }
    }

    System.out.println(count);
 
  }

}