import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    String s = sc.next();
    char[] array = new char[n];
    array = s.toCharArray();
    boolean flag = true;

    if(n%2==0){
      int fs = n/2;
      for(int i=0; i<fs; i++){
        if(array[i]!=array[i+fs]){
          flag = false;
          break;
        }
      }
      if(flag){
        System.out.println("Yes");
      }else{
        System.out.println("No");    
      }
    }else{
      System.out.println("No");
    }

  }
}