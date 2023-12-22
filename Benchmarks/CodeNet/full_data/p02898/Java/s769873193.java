import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        String str_input = br.readLine();
        String human = br.readLine();
        int result = 0;

        String[] str_array = str_input.split(" ", 0);
        String[] human_array = human.split(" ", 0);

        int num = Integer.parseInt(str_array[0]);
        int height = Integer.parseInt(str_array[1]);

        for(int i = 0; i < num; i++){
          int tmp_height = Integer.parseInt(human_array[i]);
          if(height <= tmp_height){
            result++;
          }
        }

        System.out.println(result);
      }
    }
}