import java.util.*;
public class Main{
	public static void main(String [] args){
    	Scanner scan = new Scanner(System.in);
      	int x = scan.nextInt();
 		int [] arr = new int[(int)1e5+10];
      	int size = arr.length;
      arr[1]=1;
      arr[2]=1;
      arr[3]=1;
      	for(int i=4;i<size;i++){
          boolean isPrime=true;
        	for(int j=2;j<=Math.sqrt(i);j++){
            	if(i%j==0){
                  isPrime=false;
                  break;
                }
            }
          if(isPrime){
          arr[i]=1;
          }
        }
      	for(int i = x;i<size;i++){
        	if(arr[i]==1){
            System.out.println(i);
              break;
            }
        }
      	
    }
}
