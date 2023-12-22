 import java.io.InputStreamReader;
 import java.io.IOException;
 import java.io.BufferedReader;
 import java.io.InputStream;

 public class Main{
  public enum whether{                          //天気を列挙
          Sunny,
          Cloudy,
          Rainy
  }
  public static void main(String[]args){
     InputStreamReader isr=new InputStreamReader(System.in);
     BufferedReader br=new BufferedReader(isr);    
          String whether=null;
     try{
          whether=br.readLine();
          br.close();
     }catch(IOException e){
          e.printStackTrace();
     }
     //天気を出力
     switch(whether){
       case Sunny:
          System.out.println("Cloudy");          //SunnyのときCloudyと表示
          break;
       case Cloudy:
          System.out.println("Rainy");           //CloudyのときRainyと表示
          break; 
       case Rainy:
          System.out.println("Sunny");           //RainyのときSunnyと表示
          break;
     }
   }
  }
       
      
    