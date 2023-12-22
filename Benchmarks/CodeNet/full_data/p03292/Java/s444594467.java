import java.util.*;
public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int i;		
	int diff1,diff2,result;

	Integer[] Input = new Integer[3];
	
	for(i=0;i<3;i++) {
		Input[i] = sc.nextInt();
	}
	
	Arrays.sort(Input);
	
	
	diff1 = Input[1] - Input[0];
	diff2 = Input[2] - Input[1];
	result = diff1 + diff2;
	
	
	System.out.println(result);
	
	}
}
