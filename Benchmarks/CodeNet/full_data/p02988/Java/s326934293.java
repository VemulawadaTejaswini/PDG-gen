import java.util.*;
 
public class Main{
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
    	int num = sc.nextInt();
        int number[] =new int[num];
		for(int i = 0; i < num; i++){
			number[i] = sc.nextInt();
        }
        int count = 0;
        for(int i = 0; i < num - 2; i++){
        	if(number[i + 1] < number[i] && number[i + 1] > number[i + 2]){
            	count++;
            }else if(number[i + 1] < number[i + 2] && number[i + 1] > number[i]){
            	count++;
            }
        }
        System.out.println(count);
	}
}