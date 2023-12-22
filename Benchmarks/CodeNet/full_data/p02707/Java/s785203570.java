import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int number = scan.nextInt();
	        int[] people = new int[number];
	        for(int i=0;i<number-1;i++){
	        	int no = scan.nextInt();
	        	people[no-1]++;
	        }
	        for(int i=0;i<number;i++){
	        	System.out.println(people[i]);
	        }
      }
}
