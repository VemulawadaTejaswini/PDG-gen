import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String[] str = S.split("");
		int count=0;
      
		for(int i=0; i<(S.length()/2); i++){
			if(!(str[i].equals(str[S.length()-1-i]))){
				count++;
            }
        }
		
		System.out.println(count);
    }
}
