import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int a = sc.nextInt();
      	int b = sc.nextInt();
      	int min = a * b;
      	sc.close();
      	for(int i = a; i < b; i ++){
        	for(int j = i + 1; j <= b; j ++){
            	min = Math.min(min, (j % 2019) * (i % 2019));
            }
        }
      	System.out.print(min);
    }

}