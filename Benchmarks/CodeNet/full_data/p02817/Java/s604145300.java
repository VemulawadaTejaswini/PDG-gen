import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        StringBuilder sb = new StringBuilder();
        String[] input = br.readLine().split(" ");

        sb.append(input[0]);
        sb.append(input[1]);

        System.out.println(sb);
      }
    }
}