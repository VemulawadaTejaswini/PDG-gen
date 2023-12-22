import java.util.*;
public class Main {
  	static int[] balls;
  
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int total = Integer.parseInt(sc.next());
      	balls=new int[total];
      	for(int i=0;i<total;i++){
        	balls[i]=Integer.parseInt(sc.next());
        }
      	
      	for(int i=0;i<total;i++){
        	System.out.println(calcSameNum(i));
        }
    }
  	public static int calcSameNum(int index){
      	int count=0;
    	for(int i=0;i<balls.length;i++){
          	if(i==index){
            	continue;
            }
        	for(int j=0;j<balls.length;j++){
              	if(j==index||i==j){
                  continue;
                }
              	if(balls[i]==balls[j]){
                	count++;
                }
            }
        }
      	return count/2;
    }

}