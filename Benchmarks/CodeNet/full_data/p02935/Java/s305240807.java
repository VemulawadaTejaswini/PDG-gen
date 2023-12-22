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
      
      	for(int i = 0; i < n; i++){
          	double tmp = num[i];
          	
        	for(int j = n - 1; j >= 0; j--){
              	if(i == j){
                	continue;
                }
            	tmp = (tmp + num[j]) / 2;
            }
          	sum.add(tmp);
          
        	for(int j = 0; j < n; j++){
              	if(i == j){
                	continue;
                }
            	tmp = (tmp + num[j]) / 2;
            }
          	sum.add(tmp);
        }

      	double max = 0.0;
      	for(double tmp : sum){
        	if(max < tmp){
              max = tmp;
            }
        }
      	System.out.println(max);
	}
}