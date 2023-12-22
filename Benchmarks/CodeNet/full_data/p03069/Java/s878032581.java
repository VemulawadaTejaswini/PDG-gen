import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] s_array = sc.next().split("");
    int output = 0;
    boolean border = false;
    for(int i=0; i<n; i++){
      if(s_array[i].equals("#")){
        border = true;
      }else if(s_array[i].equals(".")){
        if(border){
          border = false;
          output++;
        }
      }
    }
    System.out.println(output);
  }
}