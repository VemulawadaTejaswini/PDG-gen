import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      String S = sc.next();
      int min = N;
      for(int i=0;i<N;i++){
        int count = 0;
        for(int j=0;j<N;j++){
          if(i<j && !(S.charAt(j)=='W')){
            count++;
          }else if(j<i && !(S.charAt(j)=='E')){
            count++;
          }
        }
        min = Math.min(min,count);
      }
      System.out.println(min);
    }
}