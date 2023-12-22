import java.util.*;
class Main{
	public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
      	String s = sc.nextLine();
      	int count = 0;
      	int i = 0, j = s.length() - 1;
      	while( i < j){
          if(s.charAt(i) != s.charAt(j)){
            count++;
          }
          i++;
          j--;
        }
      System.out.println(count);
    }
}
