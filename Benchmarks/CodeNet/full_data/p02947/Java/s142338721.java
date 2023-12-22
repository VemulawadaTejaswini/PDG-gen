import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

class Main{
  public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
          int N = Integer.parseInt(reader.readLine());
          String s[] = new String[N];
          for(int i = 0;i < N;i++){
            s[i] = reader.readLine();
          }
          int count = 0;
          for(int i = 0;i < N;i++){
            for(int j = i+1;j < N;j++){
              if(permutation_2(s[i],s[j])){
                count++;
              }
            }
          }
          System.out.println(count);
        }catch(IOException e){
            System.out.println(e);
        }
  }

  static boolean permutation_2(String s,String t){
        
        int[] letters = new int[256]; //文字コードの仮定;
        
        char[] s_array = s.toCharArray();  
        for(char c:s_array){
            letters[c]++;
        }
        
        for(int i=0;i<t.length();i++){
            int c = (int)t.charAt(i);
            if(--letters[c] < 0){
                return false;
            }
        }
        return true;
    }
}