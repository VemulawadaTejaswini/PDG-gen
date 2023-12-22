import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    String alpbt = scan.next();
    String[] list = {"a","b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n",
    		"o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    int  i = 0;
    String result = null;
    while(!(list[i].equals(alpbt))){
    	i++;
    };
   	if(list[i].equals(alpbt)) {
   		result = list[i+1];
   	}
    System.out.println(result);
  }
}