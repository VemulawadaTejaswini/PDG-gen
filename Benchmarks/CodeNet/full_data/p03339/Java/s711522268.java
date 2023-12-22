import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    String s = sc.nextLine();
    
    int min = N;
    for(int i = 0; i < N; i++){
      int count = 0;
      for(int j = 0; j < N; j++){
        if(j > i && s.charAt(j) == 'E'){
          count++;
        }
        else if(j < i && s.charAt(j) == 'W'){
          count++;
        }
      }
      if(min > count){
        min = count;
      }
    }
    System.out.println(min);
  }
}