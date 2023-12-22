import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		String b = s.nextLine();
      
      if(a >= 5000 || a < 2800){
        return;
      }
      
      if(b.length() > 10 || b.length() < 1){
        return;
      }
      
      if(a >= 3200){
        System.out.println(s);
      }else{
        System.out.println("red");
      }
    }
}