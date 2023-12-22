import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      char[] s = sc.next().toCharArray();
      for(char c = 'a';c <= 'z';c++){
      	if(!(Arrays.asList(s).contains(c))){
          System.out.println(c);
          break;
        }
      }
    }
}