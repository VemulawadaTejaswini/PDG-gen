import java.util.*;
  public class Main{
    public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int count = 0;
      int [] data = new int[50];

      for(int i = 0;i<N;i++){
        data[i] = sc.nextInt();
      }
      
      for(int k = 0;k<N;k++){
        if(data[k] != k+1){
          count++;
        }
      }
        if(count<=2){
          System.out.println("YES");
        }
        if(count>2){
          System.out.println("NO");
        }
    }
  }
