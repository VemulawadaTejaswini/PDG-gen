import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int num = scan.nextInt();
      	int[] array = new int[num];
      	for(int i = 0; i < num; i++){
        	array[i] = scan.nextInt();
        }
      	int max = array[0];
      	int min = array[1];
      	for(int i = 0; i < num; i++){
        	if(max < array[i]){
            max = array[i];
            }
        }
      	for(int i = 0; i < num; i++){
        	if(min > array[i]){
            min = array[i];
            }
        }
     	System.out.print(max - min);
    }
}