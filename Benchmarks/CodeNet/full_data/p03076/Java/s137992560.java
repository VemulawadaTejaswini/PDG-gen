import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int[] fra = {sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()};
    	int minFra = Integer.MAX_VALUE;
    	int order = 0;
    	for (int i = 0; i < fra.length; i++) {
    		if (0 < fra[i]%10 && fra[i]%10 < minFra) {
    			minFra = fra[i]%10;
    			order = i;
    		}
    	}
    	int count = 0;
    	for (int i = 0; i < fra.length; i++) {
    		if (i != order && 0 < fra[i]%10) {
    			count += fra[i] + 10 - fra[i]%10;
    		} else {
    			count += fra[i];
    		}
    	}
    	System.out.println(count);
    }
}