import java.io.*;
class Main{
  public static void main(String[] args) throws Exception{
    String S=new BufferedReader(new InputStreamReader(System.in)).readLine();
    int l=S.length(),m=753,x[]=new int[l];
    for(int i=0;i<l;)x[i]=Character.getNumericValue(S.charAt(i++));
    for(int i=0;i<l-2;)m=Math.min(Math.abs(x[i]*100+x[i+1]*10+x[2+i++]-753),m);
    System.out.println(m);}}