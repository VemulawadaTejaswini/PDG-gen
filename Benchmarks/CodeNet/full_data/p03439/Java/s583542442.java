import java.util.*;import java.io.*;import java.math.*;
public class Main{
        public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          int N = sc.nextInt();
          System.out.println(0);
          sc = new Scanner(System.in);
          String mae = sc.next();
          if(last.equals("Vacant")){
            return;
          }
          int L = 0;
          int R = N - 1;
            while(true){
              if(R - L == 1){
                System.out.println(R);
                return;
              }
              int C = (R + L) / 2;
              System.out.println(C);
              sc = new Scanner(System.in);
              String ato = sc.next();
          		if(ato.equals("Vacant")){
                  return;
                }else if((C - L) % 2 == 0){
                  if(ato.equals(mae)){
                    L = C;
                    mae = ato;
                  }else{
                    R = C - 1;
                  }
                }else{
                  if(ato.equals(mae)){
                    R = C - 1;
                  }else{
                    L = C;
                    mae = ato;
                  }
                }
            }
        }
}
