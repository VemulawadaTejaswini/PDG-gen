import java.io.*;
class Main
{
  public static void main(String[] args) throws Exception
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String input = br.readLine();
    String[] param = input.split("/");
    
    int n1 = Integer.parseInt(param[0]);
    int n2 = Integer.parseInt(param[1]);
    int n3 = Integer.parseInt(param[2]);
    
    if(n1!=2018){
      n1 = 2018;
    }
    
    System.out.println(n1+"/"+n2+"/"+n3);
  }
}
    
    