import java.util.*;

class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int count = 0, ncount = 0;
    	String str = sc.nextLine();

    	for(char x: str.toCharArray()){
    		if(x == 'o'){
    			count++;
    		}else {
    			ncount++;
    		}
    	}
    	
    	int nokori = 15 - str.length();
    	
      	if(nokori+count >= 8) System.out.println("YES");
      	else System.out.println("NO");
    }
}
