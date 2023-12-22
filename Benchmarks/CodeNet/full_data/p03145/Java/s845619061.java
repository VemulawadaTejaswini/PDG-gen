import java.io.*;
class A116{
  public static void main(String[]args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(br.readLine());
    int b = Integer.parseInt(br.readLine());
    int c = Integer.parseInt(br.readLine());
    if(a>=b && a>=c)System.out.println(b*c/2);
    if(b>=a && b>=c)System.out.println(a*c/2);
    if(c>=a && c>=b)System.out.println(b*a/2);

  }
}
