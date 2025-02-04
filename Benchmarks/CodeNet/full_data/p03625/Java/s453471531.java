import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		int h=0,w=0;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		ArrayList<Long> array = new ArrayList<>();
		//int[] array = new int[n];
		
		for(int i=0; i < n; i++){
			array.add(sc.nextLong());
		}
		
		array.sort(Comparator.reverseOrder());
		
		//System.out.println(array);
		
		for(int i=0; i<array.size()-1; i++){
			if(array.get(i) == array.get(i+1)){
				if(h == 0){
					h = (int)(long) array.get(i);
					i++;
				}
				else{
					w = (int)(long) array.get(i);
					System.out.println(h*w);
					return;
				}
			}
		}
		
		System.out.println("0");
		
	}

}