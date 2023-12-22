import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
          //input
          String[] input = br.readLine().split(" ");
          long N = Long.parseLong(input[0]);
          long A = Long.parseLong(input[1]);
          long B = Long.parseLong(input[2]);

          //for output
          long result = 0;

          //for algorithm
          long dis_A = A - 1;
          long dis_B = N - B;
          long sub = B - A;

          //algorithm
          if((sub % 2) == 0){
            result = sub / 2;
          }else if(sub < 2){
            result = Math.min(dis_A, dis_B) + 1;
          }else{
            if(dis_A == 0 || dis_B == 0){
              result = 0;
            }else{
              if(dis_A < dis_B){
                result = dis_A;
                A = A - dis_A;
                B = B - dis_A;
              }else{
                result = dis_B;
                A = A + dis_B;
                B = B + dis_B;
              }
            }

            if(A > B){
              sub = A - B;
            }else{
              sub = B - A;
            }
            result += sub/2 + 1;
          }
           
          System.out.println(result);

        }

    }
}

