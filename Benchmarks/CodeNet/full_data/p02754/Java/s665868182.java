import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args)throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        //input
        String[] input = br.readLine().split(" ");
        
        int N = Integer.parseInt(input[0]);
        int A = Integer.parseInt(input[1]); //blue
        int B = Integer.parseInt(input[2]); //red

        //for output
        int result = 0;

        //for algorithm
        int num = 0;
        int count = 0;

        while(true){
          if(count == 0){
            num += A;
            count++;
            if(num > N){
              result = N;
              break;
            }else{
              result += num;
            }
          }else{
            if((count % 2) != 0){
              num += B;
              count++;
              if(num > N){
                break;
              }else{
                continue;
              }
            }else if((count % 2) == 0){
              num += A;
              count++;
              if(num > N){
                result += A - (num - N);
                break;
              }else{
                result += A;
              }
            }
          }
        }
        
        System.out.println(result);
    
      }
    }
}