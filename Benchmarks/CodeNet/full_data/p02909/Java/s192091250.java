 import java.io.InputStreamReader;
 import java.io.IOException;
 import java.io.BufferedReader;
 import java.io.InputStream;

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
     String[]array={"Sunny","Cloudy","Rainy"};
     String[]array2={"Cloudy","Rainy","Sunny"};
     for(int i=0;i<array.length;){
      if(str.equals(array[i])){
          System.out.println(array2[i]);
          i++;
     }
     }
   }
  }
       
      
    