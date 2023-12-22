import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int road[] = new int[6];
        int count = 0;
        for(int i = 0; i < 6; i++){
        	road[i] = sc.nextInt();
            for(int j = 0; j < i; j++){
            	if(road[i] == road[j]){
                	count++;
                }
            }
        }
        if(count == 2){
        	System.out.println("YES");
        }else{
        	System.out.println("NO");
        }
    }
}