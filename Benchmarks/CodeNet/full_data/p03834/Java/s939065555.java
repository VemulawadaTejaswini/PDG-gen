import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String result = "";
 		while(sc.hasNext()){
			String str = sc.next();
            result = sc.next().replaceAll(","," ");
    		System.out.println(result);			
 		}	

	}
}