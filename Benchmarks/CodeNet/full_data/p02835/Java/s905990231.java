import java.util.Scanner;
public class Main{
    public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	int sum = 0;
	for(int i = 0;i < 3;i++){
	    int k = scanner.nextInt();
	    sum += k;
	}
	if(sum > 21)
	    System.out.println("bust");
	else
	    System.out.println("win");
    }
}
