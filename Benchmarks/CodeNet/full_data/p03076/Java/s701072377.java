import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int[] time = new int[5];
      	for(int i = 0; i < 5; i++){
        	time[i] = sc.nextInt();
		}
      	int[] dt = new int[5];
        for(int i = 0; i < 5; i++){
        	if(time[i] % 10 == 0){
            	dt[i] = time[i];
            }else{
            	dt[i] = (time[i] / 10) * 10 + 10;
            }
        }
        
        int max = 0;
        int total = 0;
        for(int i = 0; i < 5; i++){
        	if(dt[i] - time[i] > max){
            	max = dt[i] - time[i];
            }
            total += dt[i];
        }
        System.out.println(total - max);
     }
}