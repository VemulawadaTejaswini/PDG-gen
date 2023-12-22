import java.util.*;
	public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            //入力
            int n = Integer.parseInt(sc.next());

            int[][] red = new int [n][2];
            int[][] blue = new int [n][2];
            
            for(int i=0; i<n; i++){
            	red[i][0] = Integer.parseInt(sc.next());
            	red[i][1] = Integer.parseInt(sc.next());
            }
            for(int i=0; i<n; i++){
            	blue[i][0] = Integer.parseInt(sc.next());
            	blue[i][1] = Integer.parseInt(sc.next());
            }
            
            //出力
            System.out.println(calc(red, blue, n));
            sc.close();
        }
        
        public static int calc(int[][] red, int[][] blue, int n){
        	int ret = 0;
        	int temp0 = 0, temp1=0;
        	
        	if(n==0){
        		return 0;
        	}
        	
        	for(int i=0; i<n; i++){
        		for(int j=0; j<n; j++){
        			if(red[i][0] < blue[j][0] && red[i][1] < blue[j][1]){
        				temp0 = red[n-1][0];
        				temp1 = red[n-1][1];
        				red[n-1][0] = red[i][0];
        				red[n-1][1] = red[i][1];
        				red[i][0] = temp0;
        				red[i][1] = temp1;
        				
        				temp0 = blue[n-1][0];
        				temp1 = blue[n-1][1];
        				blue[n-1][0] = blue[j][0];
        				blue[n-1][1] = blue[j][1];
        				blue[j][0] = temp0;
        				blue[j][1] = temp1;
        				
        				if(ret < 1 + calc(red, blue, n-1)){
        					ret = 1 + calc(red, blue, n-1);
        				}
        			}
        		}
        	}
        	
            return ret;
        }
    }
	