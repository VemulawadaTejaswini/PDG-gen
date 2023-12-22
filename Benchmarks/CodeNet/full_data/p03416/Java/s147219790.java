import java.util.*;

public class Main{
  
  public static void main (String[] args){
  
  	Scanner scanner = new Scanner (System.in);
    ArrayList <String> list = new ArrayList <String> ();
    
  	int numA = scanner.nextInt();
    int numB = scanner.nextInt();
   	int count = 0;
    
    for (int i=numA; i<=numB; i++){
      list.clear();
      String phraseA = String.valueOf(i);
      String[] templist = phraseA.split("");
      for (int j=0; j<phraseA.length(); j++){
        list.add(templist[j]);
      }
      
      boolean flag = true;
      for (int j=0; j<(phraseA.length())/2; j++){
        String temp = list.get(j);;
        String temp2 = list.get(phraseA.length()-1-j);
        if (temp.equals(temp2)){
        } else {
          flag = false;
        }
      }
      if (flag == true){
        count++;
      }
    }	
   	System.out.println(count);
  }
}