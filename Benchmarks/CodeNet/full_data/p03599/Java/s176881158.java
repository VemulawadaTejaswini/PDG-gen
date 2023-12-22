import java.util.*;
 
public class Main{
	public static void main(String args[]){
    	
      Scanner scan = new Scanner(System.in);
      int a = nextInt();
      int b = nextInt();
      int c = nextInt();
      int d = nextInt();
      int e = nextInt();
      int f = nextInt();
      int sugerWater = 0;
      int suger = 0;
     sugerWater += 100 * a;  
      while(true){
	    if(sugerWater-100*a>e*a){
          if(e>d){
            if(sugerWater <= f){
              sugerWater += d;
              suger += d;
            }
          }else{
              if(e>c){
                  if(sugerWater <= f){
                  sugerWater += c;
                  suger += c;
                  }
              }
          
        
      }
      System.out.println(sugerWater + " " +suger);
    }
}