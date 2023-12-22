import java.io.*;
 
class Product
{
  public static void main(String[] args) throws IOException
  {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  	String str = br.readLine();
  	int a = Integer.parseInt(str);
  	int b = Integer.parseInt(str);
  
  	if((a * b) % 2 ==0) {
      System.out.println("even");
    } else {
      System.out.println("odd");
    }
	}
}