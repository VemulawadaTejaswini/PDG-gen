import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int age;
	int charge;

	age = sc.nextInt();
	charge = sc.nextInt();
	if(0 <= age && age <= 100 && 2 <= charge && charge <= 1000){
	    if(age % 2 == 0){
		if(6 <= age && age <= 12){
		    charge = charge / 2;
		}if (age <= 5){
		    charge = 0;
		}
	    }
	}
	System.out.println(charge);
    }
}
	
	    
	
