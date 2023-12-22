import java.util.Scanner;
class Main{
	public static void main(String[] aegs){
    	Scanner sc = new Scanner(System.in);
    	int sum = sc.nextInt() + sc.nextInt() + sc.nextInt();
      	if(sum >= 22)
          	System.out.println("bust");
      	else
        	System.out.println("win");
      	sc.close();
    }
}