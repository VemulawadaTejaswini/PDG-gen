import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer num = sc.nextInt();
      	if(num % 10 == 7){
          System.out.println("Yes");
        }else{
          System.out.println("No");          
        }
	}
}