import java.util.*;

public class Main {
  
        static StringBuilder a = new StringBuilder();
        static StringBuilder b = new StringBuilder();
        static StringBuilder c = new StringBuilder();
	
	public static void main(String[] args) {
      
		Scanner sc = new Scanner(System.in);   
      
        a.append(sc.next());
        b.append(sc.next());
        c.append(sc.next());
      
        char tmp = a.charAt(0);
        a.deleteCharAt(0);
      
        Main.nextTurn(tmp);
        
       
	} 
  
    public static void nextTurn(char card) {
        if (card == 'a') {
           if(a.length() == 0) {
             System.out.println("A");
             return;
           }
          
           //System.out.println("Turn A"); //最後に消す
           char tmp = a.charAt(0);
           a.deleteCharAt(0);
                     
           Main.nextTurn(tmp);
          
        } else if (card == 'b') {
           if(b.length() == 0) {
             System.out.println("B");
             return;
           }
          
           //System.out.println("Turn B"); //最後に消す
           char tmp = b.charAt(0);
           b.deleteCharAt(0);
          
           Main.nextTurn(tmp);
        } else if (card == 'c') {
           if(c.length() == 0) {
             System.out.println("C");
             return;
           }
          
           //System.out.println("Turn C"); //最後に消す
           char tmp = c.charAt(0);
           c.deleteCharAt(0);
          
           Main.nextTurn(tmp);
        }
    }
}