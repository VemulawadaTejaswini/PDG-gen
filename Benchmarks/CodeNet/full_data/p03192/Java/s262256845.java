import java.util.*;
public class Main{
	public static void main(String[] args){
      	Scanner sc = new Scanner(System.in);
    	char[] n = sc.next().toCharArray();
      	int count = 0;
      	for(int i = 0; i < n.length; i++){
        	if(n[i] == '2') count++;
        }
      	System.out.println(count);
    }
}