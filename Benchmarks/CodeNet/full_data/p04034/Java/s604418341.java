import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		class Box{
			boolean red = false;
			int cnt =1;
		}
		
		
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int x[] = new int[M];
		int y[] = new int[M];
		Box box[] = new Box[N];
		
		for(int i=0; i<N; i++ ){
			box[i] = new Box();
		}
		box[0].red = true;
//		System.out.println("size "+box.length);

		for(int i=0; i<M; i++ ){
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			
		}
		
		
		for(int i=0; i<M; i++){
			
			if(box[x[i]-1].red == true){
				box[y[i]-1].red = true;
			}
//			System.out.println("y[i] "+y[i]);
			box[y[i]-1].cnt++;
			box[x[i]-1].cnt--;
		}
		
		int j=0;
		for(int i=0; i<M; i++){
			if(box[i].cnt !=0 && box[i].red == true){
				j++;
			}
		}
		
		
		
		System.out.println(j-1);




//		System.out.println(z);


	}
}
