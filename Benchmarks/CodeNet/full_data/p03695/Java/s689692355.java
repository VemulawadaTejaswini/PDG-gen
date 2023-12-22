import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    boolean[] color = new boolean[8];
    int over = 0;
    for(int i = 0; i < N; i++){
      int n = sc.nextInt();
      if(n <= 399){
        color[0] = true;
      }else if(n <= 799){
        color[1] = true;
      }else if(n <= 1199){
        color[2] = true;
      }else if(n <= 1599){
        color[3] = true;
      }else if(n <= 1999){
        color[4] = true;
      }else if(n <= 2399){
        color[5] = true;
      }else if(n <= 2799){
        color[6] = true;
      }else if(n <= 3199){
        color[7] = true;
      }else{
        over++;
      }
    }
    
    int min = 0;
    int max = 0;
    for(int i = 0; i < 8; i++){
      if(color[i]){
        min++;
      }
    }
    max = min + over;
    if(min == 0 && over > 0){
      min = 1;
    }
    
    System.out.println(min + " " + max);
  }
}