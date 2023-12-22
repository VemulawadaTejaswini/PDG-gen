import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		do{
          int D=stdIn.nextInt();
        }while(D<=22||D>=26)
		if(D==25){
			System.out.println("Christmas");
		}
		else if(D==24){
			System.out.println("Christmas Eve"); 
		}
		else if(D==23){
			System.out.println("Christmas Eve Eve");
		}
         
        

	}

}
