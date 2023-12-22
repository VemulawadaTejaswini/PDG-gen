import java.util.*;
public class Main{
  static boolean sort(int[] n){
    int temp;
    Arrays.sort(n);
    int[] s = {5,5,7};
    Arrays.sort(s);
    if(Arrays.equals(n,s)){
      return true;
    }
    return false;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] n = new int[3];
    for(int i = 0;i<3;i++){
      n[i] = sc.nextInt();
    }
    if(sort(n)){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}
