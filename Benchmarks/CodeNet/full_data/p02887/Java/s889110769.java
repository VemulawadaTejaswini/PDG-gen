import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      int N = sc.nextInt();
      String S = sc.next();
      char data[]= new char[N];

      char c;

      int count = N;

        for(int i = 0;i<N;i++){
          c = S.charAt(i);
          data[i]=c;
        }

        for(int i = 0;i<N-1;i++){
          if(data[i]==data[i+1]){
            count = count-1;
          }
        }
        System.out.println(count);
  }
}