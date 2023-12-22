import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
      	int n = sc.nextInt();
        int max = sc.nextInt();
      	int count = 1;
      	int istack;
      
      	for(int i = 1;i < n;i++){
          istack = sc.nextInt();
          if(istack >= max){
            count++;
            max = istack;
          }
        }
          
      	System.out.print(count);
      
	}
}