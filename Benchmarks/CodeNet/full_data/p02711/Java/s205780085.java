import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
      	int hundred=N/100;
        int ten=(N-hundred)/10;
        int one=(N-hundred-ten);
        
      	if(one==7 || ten==7 || hundred==7){
        System.out.println("YES");}
      	else{
        System.out.println("NO");}
	}
}