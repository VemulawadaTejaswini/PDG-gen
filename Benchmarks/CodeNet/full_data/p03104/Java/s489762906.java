import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
  
	public static void main (String[] args) throws IOException {    
    String[] first = br.readLine().split(" ");
    long L = Long.parseLong(first[0]);
    long R = Long.parseLong(first[1]);
    
    if(L != R) {
      
      String Lb = Long.toBinaryString(L);
      String Rb = Long.toBinaryString(R);
      
      int length = Rb.length();
      StringBuilder zeros = new StringBuilder();
      for(int i = 0; i < (length-Lb.length()); i++) {
        zeros.append("0");
      }
      
      Lb = zeros.toString() + Lb;
      
      // int oneIndex = Rb.indexOf("1");
      StringBuilder ans = new StringBuilder();
      
      for(int i = 0; i < length; i++) {
        if(i != length-1) {
          int exp = 1 << (length-1-i);
          long oddCtr = 0;
          if(Lb.charAt(i) == '1') {
            oddCtr += exp - (L % exp);
          }
          
          if(Rb.charAt(i) == '1') {
            oddCtr += (R % exp) + 1;
          }
          
          if(oddCtr > R - L) {
            oddCtr = R - L + 1;
          }
          
          if(oddCtr % 2 == 1) {
            ans.append("1");
          }
          else {
            ans.append("0");
          }
        }
        else {
          if(R % 2 == 0) 
            if((R - L+1) / 2 % 2 == 0) {
              ans.append("0");
            }
            else {
              ans.append("1");
            }
          else
            if((R - L) / 2 % 2 != 0) {
              ans.append("0");
            }
            else {
              ans.append("1");
            }
        }
      }
      
      // System.out.println(Lb);
      // System.out.println(Rb);
      // System.out.println(ans.toString());
      
      bw.write(new BigInteger(ans.toString(), 2).longValue() + "");
    }
    else {
      bw.write(L+"");
    }
    
    bw.close();
	}
}
