import java.util.*;
public class Main{
  	public static int[] array = new int[100000];
  public static int count = 1;
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int s = sc.nextInt();
      array[0] = s;
      System.out.println(run(s));
      
    }
  	public static int run(int s){
      	if(count > 1)
        for(int i = 0;i<count-1;i++){
        	if(array[count-1] == array[i]){
            	return count;
            }
        }
    	if(s%2==0){
          array[count] = s/2;
          count++;
          return run(s/2);
        }
        else{
          array[count] = s*3+1;
          count++;
          return run(s*3+1);
        }
    }
}