import java.util.*;
 
public class Main {
 	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		String A = sc.next();
		
		int count = 0;
		for(int i=0; i<A.length(); i++){
			String a1 = String.valueOf(A.charAt(i));
			if(count==0){
				a1.equals("k");
				count++;
			}else if(count==1){
				a1.equals("e");
				count++;
			}else if(count==2){
				a1.equals("y");
				count++;
			}else if(count==3){
				a1.equals("e");
				count++;
			}else if(count==4){
				a1.equals("n");
				count++;
			}else if(count==5){
				a1.equals("c");
				count++;
			}else if(count==6){
				a1.equals("e");
				count++;
			}
		}
		
		if(count==7){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}
