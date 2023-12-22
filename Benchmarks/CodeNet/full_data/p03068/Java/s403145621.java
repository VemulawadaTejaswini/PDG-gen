import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] s_array = sc.next().split("");
    int k = sc.nextInt();
    String target = s_array[k-1];
    StringBuilder sb = new StringBuilder();
    for(int i=0; i<n; i++){
      if(s_array[i].equals(target)){
        sb.append(s_array[i]);
      }else{
        sb.append("*");
      }
    }
    System.out.println(sb.toString());
  }
}