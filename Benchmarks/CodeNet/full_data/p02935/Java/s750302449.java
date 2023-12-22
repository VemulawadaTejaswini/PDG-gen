import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
      	int n = sc.nextInt();
      	int num[] = new int[n];
      
      	for(int i = 0; i < n; i++){
        	num[i] = sc.nextInt();
        }
      	
      	List<Double> sum = new ArrayList<>();
      
      	for(int i = 0; i < n - 1; i++){
          	double tmp = num[i];
        	for(int j = i+1; j < n; j++){
            	tmp = (tmp + num[j]) / 2;
            }
          	sum.add(tmp);
        }
      	for(int i = n - 1; i > 0; i--){
          	double tmp = num[i];
        	for(int j = i-1; j >= 0; j--){
            	tmp = (tmp + num[j]) / 2;
            }
          	sum.add(tmp);
        }

      	double max = 0.0;
      	for(int i = 0; i < n; i++){
        	if(max < sum.get(i)){
              max = sum.get(i);
            }
        }
      	System.out.println(max);
	}
}