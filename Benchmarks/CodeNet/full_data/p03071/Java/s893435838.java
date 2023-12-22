import java.util.*;

class Main {
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int a = sc.nextInt();
  int b = sc.nextInt();
  Integer array[] = {a,b,a-1,b-1};
  Arrays.sort(array, Comparator.reverseOrder());
  int ans = array[0]+array[1];
  System.out.println(ans);
  }
}