import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    
    int[] array = {a,b,c};
    Arrays.sort(array);
    
    String result = "NO";
    if(array[2] == (array[0]+array[1])){
      result = "YES";
    }
	
    System.out.println(result);
  }
}