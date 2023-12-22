import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s = in.readLine();
    int s_len = s.length();
    boolean flg1 = true;
    boolean flg2 = true;
    boolean flg3 = true;
    
    //Sは回文
    int[] tmp_flg = new int[s_len/2];
    for(int i=0; i<s_len/2; i++){
      if(s.charAt(i)==s.charAt(i))
        tmp_flg[i] = 1;
      if(tmp_flg[i]!=1){
        flg1 = false;
        break;
      }
    }
    
    //Sの1文字目から(n-1)/2文字目までからなる文字列は回文
    int[] tmp_flg_2 = new int[s_len/2];
    for(int i=0; i<s_len/4; i++){
      if(s.charAt(i)==s.charAt(s_len/2-i-1))
        tmp_flg_2[i] = 1;
      if(tmp_flg_2[i]!=1){
        flg2 = false;
        break;
      }
    }
    
    //(n+3)/2文字目からn文字目までからなる文字列は回文
    int[] tmp_flg_3 = new int[s_len/2];
    for(int i=0; i<s_len/4; i++){
      if(s.charAt(s_len/2+1+i)==s.charAt(s_len-1-i))
        tmp_flg_3[i] = 1;
      if(tmp_flg_3[i]!=1){
        flg3 = false;
        break;
      }
    }
    
    System.out.println(flg1==false || flg2==false || flg3 == false?
                       "No":"Yes");
  }
}