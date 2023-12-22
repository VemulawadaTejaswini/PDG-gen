import java.util.*;

public class Main{

	public static void main(String[] args){
      
      Scanner scan = new Scanner(System.in);
      String Input = scan.next();
      String[] lists = Input.split("");
      
      
      
      ArrayList<String> Array = new ArrayList<String>();  
      
     
      
      
      for (int i=0; i<lists.length; i++){
        
        if(lists[i].equals("B") && Array.size()>0 ){
         Array.remove(i-1);
        }
        else{
          //System.out.println(lists[i]);
          Array.add(lists[i]);
        }
      }
     //System.out.println(Array);
      
     for (int j=0; j<Array.size(); j++)
       if (Array.get(j).equals("B")){
       }else{
         System.out.print(Array.get(j));
       }
      
    }
}