import java.io.*;
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(reader.readLine());
    String[] l = reader.readLine().split(" ");
    long[] list = new long[n];
    int t = 0;
    for(String s:l){
      list[t] = Long.parseLong(s);
      t++;}
    long res = 0;
    for(int i = 0;i<list.length;i++){
      for(int j = i+1;j<list.length;j++){
        res+= list[i]^list[j];
        if(res>1000000007) res-=1000000007;
      }}
    System.out.println(res);}}