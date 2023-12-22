import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main { 

	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int inputNumber = Integer.parseInt(sc.nextLine());
    	String[] lineNumber = sc.nextLine().split(" ");
    	List<Integer> allNumber = new ArrayList();
    	for(int i = 0;i<lineNumber.length;i++) {
    		allNumber.add(Integer.parseInt(lineNumber[i]));
    	}
    	
    	int preNumber = allNumber.get(0);
    	int canMove = 0;
    	List<Integer> resultList = new ArrayList();
    	for(int i = 1;i<allNumber.size();i++) {
    		
    		int tmp = allNumber.get(i);
    		if(preNumber >= tmp) {
    			canMove++;
    		}else {
    			canMove = 0;
    		}
    		
    		resultList.add(canMove);
    		preNumber = tmp;
    	}
    		Collections.sort(resultList,Collections.reverseOrder());
    	
    	System.out.println(resultList.get(0));
    }
}