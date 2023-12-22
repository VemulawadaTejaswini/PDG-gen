import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		boolean rezult = true;
		Main mainClass = new Main();
		String aOfMozi = mainClass.suutiFromMozi(a);
		String bOfMozi = mainClass.suutiFromMozi(b);
		String aPlusbOfMozi = aOfMozi + bOfMozi;
		int aPlusbOfSuuti = Integer.parseInt(aPlusbOfMozi);
		for(int num = 1;num <= 100;num++){
			if(aPlusbOfSuuti == num*num){
				System.out.println("Yes");
				rezult = false;
				break;
			}
		}
		if(rezult){
		System.out.println("No");
		}

		
		
		

		
		
			
		
		
	
	}
	String suutiFromMozi(int mozi){
		String s = String.valueOf(mozi);
		return s;
	}
}
