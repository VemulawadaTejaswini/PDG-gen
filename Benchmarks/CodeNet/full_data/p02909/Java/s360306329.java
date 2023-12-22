import java.util.*;


public class Main{
	public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        if(n.equals("Sunny")){
            System.out.println("Cloudy");
        }
        if(n.equals("Cloudy")){
            System.out.println("Rainy");
        }
        if(n.equals("Rainy")){
            System.out.println("Sunny");
        }
    }
}