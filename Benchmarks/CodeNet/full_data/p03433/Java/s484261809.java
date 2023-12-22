//this library has many things needed for arrays, the asterisc means we get everything is inside, the dot says where is is inside, you need the ; to tell the line has ended, like in C
import java.util.*;

//the name of the main function has to be the same name of the program
//what public class mean in java: it means that other function scan also access the class. What happens if we dont make it public? Well, it stil works, but it will be visivle to code only in the same package
public class Main {
	//this is a method, it tells that it will execute the things that are inside, it takes string as args when we execute the program, it is optional. What if instead we use int? It does not work, it has to be String[] args
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);	
      	int N = sc.nextInt();
      	int A = sc.nextInt();
        if (A > N%500){
        	System.out.println("Yes");
        }
      	else{
          	System.out.println("No");
        }
    
	}
}

