import java.io.*;
class Main{
  public static void main(String[]args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int r = Integer.parseInt(br.readLine());
    int g = Integer.parseInt(br.readLine());
    int b = Integer.parseInt(br.readLine());
    int sum = r*100+g*10+b;
    if(sum%4==0)System.out.println("YES");
    else System.out.println("NO");
  }
}