import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
      	int A = sc.nextInt();
      	int B = sc.nextInt();
      	int anser;

		if(B%A == 0){
          	anser = B/A;
        }else{
          	anser = B/A + 1;
        }
      	System.out.println(anser);
	}
}