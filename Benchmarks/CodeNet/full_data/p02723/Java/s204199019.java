
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
 
class Problem{
  public static void main(String args[]) throws IOException{
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
                              
    String s = br.readLine();
    if((((int)(s.charAt(2)))==((int)(s.charAt(3)))) && (((int)(s.charAt(4)))==((int)(s.charAt(5)))))
    System.out.println("Yes");
    else
    System.out.println("No");
}
}