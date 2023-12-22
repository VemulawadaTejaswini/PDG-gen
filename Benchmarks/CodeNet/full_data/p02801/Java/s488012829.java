import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    
    Scanner scanner = new Scanner(System.in);
      
    String C = scanner.next();
    
    String[] slist = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","w","X","Y","Z"};
    
    for(int i=0, i<26,i++){
      
      if(C.equals(slist[i])){
        C = slist[i+1];
        System.out.println(C);
      }
  
    }
  }
}

    
    
