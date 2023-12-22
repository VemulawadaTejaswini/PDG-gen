import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int N = sc.nextInt();
		int[][] aiXY = new int[N][2];
      	for(int i=0; i< N;  i++){
        	aiXY[i][0] = sc.nextInt();
            aiXY[i][1] = sc.nextInt();
        }
      
      	double[][] aiD = new double[N][N];
      	int M = 0;
      	for(int i=0; i< N;  i++){
          	for(int j=M; j< N;  j++){
              	if(i==j){
                  aiD[i][j] = 0;
                  continue;
                }
              	double db0 = Math.pow(((double)aiXY[i][0]-(double)aiXY[j][0]),2);
              	double db1 = Math.pow(((double)aiXY[i][1]-(double)aiXY[j][1]),2);
            	double dst = Math.sqrt(db0+db1);
              	aiD[i][j] = dst;
              	aiD[j][i] = dst;
            }
          	M++;
        }
      
		double sum_db = 0.0;
      
      	for(int i=0; i< N;  i++){
          	for(int j=0; j< N;  j++){
              sum_db += aiD[i][j];
            }
        }
        System.out.println(sum_db/N); 
        return;
	}
}
