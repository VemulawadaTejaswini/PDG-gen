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
              if(isAnagram(s[i],s[j])){
                count++;
              }
            }
          }
          System.out.println(count);
        }catch(IOException e){
            System.out.println(e);
        }
  }

  static boolean isAnagram(String s1,String s2){
        int sumCode_1=0;
        int sumCode_2=0;

        if(s1.length()!=s2.length())
            return false;

        for(int i=0;i<s1.length();i++){
            sumCode_1 += s1.charAt(i);
        }
        for(int i=0;i<s2.length();i++){
            sumCode_2 += s2.charAt(i);
        }

        if(sumCode_1 == sumCode_2){
            return true;
        }
        else{
            return false;
        }

    }
}