import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int N = scan.nextInt();
      	scan.close();
      	int counter = 0;
      	for(int i = 0; i <= N / 4; i++){
        	if((N - 4 * i) % 7 == 0){
              	counter++;
            }
        }
      	if(counter == 0){
        	System.out.print("NO");
        }
      	else{
        	System.out.print("YES");
        }
    }
}