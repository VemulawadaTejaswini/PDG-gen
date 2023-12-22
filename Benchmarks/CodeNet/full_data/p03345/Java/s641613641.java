import java.io.*;
import java.util.*;
import java.lang.*;

class Main{
  public static void main(String[] args) throws IOException{
    Scanner scan=new Scanner(System.in);
    int A=Integer.parseInt(scan.next());
    int B=Integer.parseInt(scan.next());
    int C=Integer.parseInt(scan.next());
    long K=Long.parseLong(scan.next());

    for(long i=K;i>0;i--){
      int aBuf=A;
      int bBuf=B;
      int cBuf=C;
      A=bBuf+cBuf;
      B=aBuf+cBuf;
      C=aBuf+bBuf;
      if(String.valueOf(Math.abs(A-B)).length()>18){
        System.out.println("Unfair");
        return;
      }
    }
    System.out.println(A-B);
  }
}