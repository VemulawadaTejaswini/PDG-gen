import java.util.Scanner;

public class Main {

	public static void main (String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
		
		int[] list = new int [N];
		
		for (int index=0; index<N; index++){
		    list[index]=sc.nextInt();
		}

        int count = 0;
        
		for (int index=1; index<N-1; index++){
		    if (list[index]<list[index+1]&&list[index]>list[index-1]){
		        count++;
		    } else if (list[index]>list[index+1]&&list[index]<list[index-1]){
		        count ++;
		    }
		}
		
		System.out.println(count);

		sc.close();
	}
}