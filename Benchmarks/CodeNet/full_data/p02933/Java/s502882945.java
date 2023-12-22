import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		String b = s.nextLine();
      
      if(a >= 3200){
        System.out.println(s);
      }else{
        System.out.println("red");
      }
    }
}