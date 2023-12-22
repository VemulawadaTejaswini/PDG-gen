import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    Integer n = scan.nextInt();
    int[] a = new int[n];
    for(int i = 0 ; i < n ; i++){
      a[i] = scan.nextInt();
    }
    int sum = 0;
    for(int i = 0 ; i < n ; i++){
      sum += a[i];
    }
    Arrays.sort(a);
    if(sum % 10 == 0) {
      for(int i = 0 ; i < n ; i++) {
        if((sum - a[i]) % 10 == 0){
          continue;
        }
        System.out.println(sum - a[i]);
        return;
      }
    } else {
      System.out.println(sum);
      return;
    }
    System.out.println(0);
  }
}