import java.util.*;	
public class Main {	
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();	
        String str[] = line.split(" ");	
        int x = Integer.parseInt(str[0]);	
        int y = Integer.parseInt(str[1]);
        int z = x*y;
      if(z%2==0){
        System.out.println("Even");
      }else{
        System.out.println("Odd");
      }
    }
}