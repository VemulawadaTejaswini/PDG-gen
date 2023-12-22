import java.util.Scanner;

class Main {

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		int n;
		n = scan.nextInt();
		
		Button b[] = new Button[n];
		for(int i = 0; i < n; i++){
			b[i] =  new Button();
			b[i].next = scan.nextInt()-1; 
		}
		
		scan.close();
		int next = 0;
		int count = 0;
		
		while(true){
			b[next].flag = false;
			next = b[next].next;
			count++;
			if(next == 1){
				System.out.print(count);
				break;
			}
			if(!b[next].flag){
				System.out.print("-1");
				break;
			}
		}
	}
}
class Button{
	int next;
	Boolean flag = true;
}