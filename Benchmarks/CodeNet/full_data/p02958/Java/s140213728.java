import java.util.Scanner;

public class Oor1Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int numberOfInput = input.nextInt();
		
		int[] array = new int[numberOfInput];
		
			for(int i=0;i<numberOfInput;i++) {
				
				array[i]=input.nextInt();
				
			}
			        
			        if (((array[0]+array[numberOfInput-1])%2)==0){
			            System.out.println("Yes");
			        } else {
			            System.out.println("No");
			        }
	      
		input.close();

	}

}
