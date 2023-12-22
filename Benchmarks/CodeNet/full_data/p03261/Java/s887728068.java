import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

class Main{
  public static void main(String args[]){
    Set<String> used_words = new HashSet<String>();
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    
    boolean flag = true;
    String previous = scan.next();
    used_words.add(previous);
    for(int i=1;i<n;i++){
      String current = scan.next();
      if(!used_words.add(current)||previous.charAt(previous.length()-1)!=current.charAt(0)){
        flag=false;
        break;
      }else{
        previous=current;
      }
    }
    scan.close();
    System.out.println(flag?"Yes":"No");
    return;
  }//main
}//Main