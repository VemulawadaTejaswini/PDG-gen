import java.util.Scanner;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int i = 0;
      	while(i < 3){
        	System.out.print(sc.nextLine().charAt(i));
          	i++;
        }
      	System.out.println();
    }
}