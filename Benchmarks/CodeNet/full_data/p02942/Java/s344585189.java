import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
 
public class Main{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int N = s.nextInt();
    int M = s.nextInt();
    ArrayList<Integer> Temp1 = new ArrayList<Integer>();
    ArrayList<Integer> Temp2 = new ArrayList<Integer>();
    int[] u = new int[N*M];
    int da = 0;
    int temp = 0;
    for (int i = 0; i < N*M; i++){
      Temp1.add(Integer.parseInt(s.next()));
    }
    for(int i = 1; i < N; i++){
      for(int j = 0;j<M;j++){
        da = 0;
        while(da == 0){
          da = 1;
          for (int w=0;w<i;w++){
            if ( (Temp1.get(M*w + j)-1) /M == (Temp1.get(M*i + j)-1) /M){
              da = 0;
            }
          }
          if (da==0){
            Temp1.add(M*i + M,Temp1.get(M*i + j));
            Temp1.remove(M*i + j);
          }
        }
      }
    }
    for (int q = 0;q<N;q++){
      for(int z = 0;z<M; z++){
        System.out.print(Temp1.get(M*q + z) + " ");
      }
      System.out.println();
    }
    for (int i = 0;i<M;i++){
      for (int j = 0;j<N;j++){
        Temp2.add(Temp1.get(M*j + i));
      }
      Collections.sort(Temp2);
      for (int j =0; j<N;j++){
        u[j*M + i] = Temp2.get(j);
      }
      Temp2.clear();
    }
    for (int q = 0;q<N;q++){
      for(int z = 0;z<M; z++){
        System.out.print(u[M*q + z] + " ");
      }
      System.out.println();
    }
  }
}