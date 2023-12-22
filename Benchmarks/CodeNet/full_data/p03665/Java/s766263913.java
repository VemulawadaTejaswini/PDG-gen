import java.util.Scanner;

public class  Main{
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
	    int bagNumber = scan.nextInt();
	    int remainder = scan.nextInt();
	    int[] intArray = new int[bagNumber];
	    int counter = 0;
	    for (int i =0;i<bagNumber;i++){
	    	intArray[i] = scan.nextInt();
	    }
		int mc=1<<bagNumber;  // 全組み合わせ総数
		for(int i=0; i<mc; ++i){
			int ttl=0;
			for(int j=0; j<bagNumber; ++j){
				if(0<(i&1<<j)){
					ttl+=intArray[j];
				}
			}
			if(ttl%2==remainder){
				counter = counter + 1;
			}
			if(i == mc -1) {
				System.out.println(counter);
			}
		}
	}
}