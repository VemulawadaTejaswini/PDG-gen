import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str1 = br.readLine();
    String str2 = br.readLine();
    int[][] lcs = new int[str1.length()+1][str2.length()+1];
    int max = 0;
    //String res = "";
    for(int i=0;i<=str1.length();i++){
      for(int j=0;j<=str2.length();j++){
        if(i==0 || j==0)
          lcs[i][j] = 0;
        else if(str1.charAt(i-1) == str2.charAt(j-1)){
          lcs[i][j] = lcs[i-1][j-1]+1;
          //res += str1.charAt(i-1);
        }
        else
          lcs[i][j] = Math.max(lcs[i-1][j],lcs[i][j-1]);
        max = Math.max(max,lcs[i][j]);
      }
    }
    
    int i=0,j=0;
    while(i<=str1.length() && j<=str2.length()){
      char a = str1.charAt(i);
      char b = str2.charAt(j);
      if(a==b){
        System.out.printf("%c",a);
        i++;
        j++;
      }
      else{
        if(lcs[i+1][j]>=lcs[i][j+1]) i++;
        else j++;
      }
    }
   // System.out.println(res);
  }
}
