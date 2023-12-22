import java.util.*;


public class Main{
  
  public static void main(String[] args){
    ArrayList<String> array = new ArrayList<String>();
      
    Scanner scan = new Scanner(System.in);
    while(scan.hasNext()){
      array.add(scan.next());
    }
    
    Collections.sort(array);
    
    String val=""; 
    for(int i=0; i<array.size(); i++){
      val = val + array.get(i);
    }
    
    System.out.print(val);
  }
   
}