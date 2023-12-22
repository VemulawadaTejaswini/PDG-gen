import java.util.*;
public class Main {
	public static void main(String[] args){
      	//データ取り込み
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
      	int T = sc.nextInt();
		int[][] array = new int[N][2];
      	for(int i=0;i<N;i++){
        	array[i][0] = sc.nextInt();
          	array[i][1] = sc.nextInt();
        }
      	int min = array[0][0];
      	boolean flg = false;
      	for(int i=0;i<N;i++){
        	if(array[i][1]<=T){
              	flg = true;
            	if(min > array[i][0]){
                	min = array[i][0];
                }
            }
        }
        if(flg){	
      	System.out.println(min);
        }else{
        System.out.println("TLE");
        }
    }
}