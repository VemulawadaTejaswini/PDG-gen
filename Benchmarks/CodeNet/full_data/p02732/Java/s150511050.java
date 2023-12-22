package lesson2;
import java.util.Scanner;
public class DBannedK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.nextLine();
		String line = sc.nextLine();
		String[] balls = line.split(" ");
		String[] temp = balls;
		
		for (int i=0; i<N; i++) {
			int count = 0;
			temp = line.split(" "); //resetting temp to balls
			temp[i] = "removed";
			for(int k =0; k<N-1; k++) {
				for (int j=k+1;j<N; j++) {
					if(temp[k].equals(temp[j])) {
						count++; //checking if every combination
					}
				}
			}
			System.out.println(count);
		}
		
	}

}
