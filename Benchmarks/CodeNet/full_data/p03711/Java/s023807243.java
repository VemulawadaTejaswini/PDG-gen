import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int a1[] = {2};
		int a2[] = {4,6,9,11};
		int a3[] = {1,3,5,7,8,10,12};
		String ans = "No";
		
		for(int i=0; i<4; i++){
		        for(int j=0; j<4; j++){
		            if((x == a1[0] && y == a1[0]) || (x == a2[i] && y == a2[j]) || (x == a3[i] && y == a3[j])){
		                ans = "Yes";
		            }
		        }
		    }
		
	
        System.out.println(ans);
	}
}
