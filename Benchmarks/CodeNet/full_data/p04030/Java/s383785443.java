import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    
    StringBuilder sb = new StringBuilder();
    
    int len = str.length();
    char c ;

    for(int i=0 ; i < len ; i++){
        
        c = str.charAt(i);
        
        switch(c){
            
            case '0':
            case '1':
                sb.append(c);
                break;
                
            case 'B':
                if(sb.length() == 0){
                    break;
                }else{
                    sb.setLength(sb.length()-1);
                }
                break;
        }
    }

    System.out.println(sb);
  }
}