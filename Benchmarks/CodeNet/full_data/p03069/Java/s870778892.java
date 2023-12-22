import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] s_array = sc.next().split("");
    int output = 0;
    boolean border = false;
    for(int i=1; i<n; i++){
      if(s_array[i-1].equals("#") && s_array[i].equals(".")){
        if(i == n -1){
          output++;
        }else if(!s_array[i-1].equals(s_array[i+1])){
          output++;
          s_array[i-1] = s_array[i];
        } else if(s_array[i-1].equals(s_array[i+1])){
          output++;
          s_array[i] = s_array[i-1];
        }
      }
    }
    System.out.println(output);
  }
}