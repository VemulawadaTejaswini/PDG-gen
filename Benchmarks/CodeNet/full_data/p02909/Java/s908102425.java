import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Main{
  public static void main(String[]args){
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
    String str=null;
    try{
      str=br.readLine();
      br.close();
     }catch(IOException e){
       e.printStackTrace();
     }
    if(str.equals("Sunny")){
      System.out.println("Cloudy");
    }
    if(str.equals("Cloudy")){
      System.out.println("Rainy");
    }
    if(str.equals("Rainy")){
      System.out.println("Sunny");
    }
  }
  }
       
      
    