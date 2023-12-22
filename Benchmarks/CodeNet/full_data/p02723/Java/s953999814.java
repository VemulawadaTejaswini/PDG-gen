import java.io.*;

class Main{
 
  public static void main(String args[])throws IOException{
  	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    
    if(str.length() != 6)
      System.out.println("No");
    else{
      if((str.charAt(2) == str.charAt(3)) && (str.charAt(4) == str.charAt(5))){
      	System.out.println("Yes");
      }
      else{
        System.out.println("No");
      }
    }
  }
}