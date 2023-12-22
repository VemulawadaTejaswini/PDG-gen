import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        int N  = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        double tmp = 0;
        double road = 0;
      
        for(int i = 0; i < N ; i++){
          x[i] = sc.nextInt();
          y[i] = sc.nextInt();
        }
      
        for(int i = 0; i < N; i++){
          for(int j = i + 1; j < N; j++){
            tmp = Math.pow(x[i]-x[j],2) + Math.pow(y[i]-y[j],2);
            road += Math.sqrt(tmp);
          }
        }
      
        if(N == 2){
          System.out.println(road*2/2);
        }else if(N == 3){
          System.out.println(road*4/6);
        }else if(N == 4){
          System.out.println(road*12/24);
        }else if(N == 5){
          System.out.println(road*48/120);
        }else if(N == 6){
          System.out.println(road*240/720);
        }else if(N == 7){
          System.out.println(road*1440/5040);
        }else if(N == 8){
          System.out.println(road*10080/40320);
        }
        
	}
}