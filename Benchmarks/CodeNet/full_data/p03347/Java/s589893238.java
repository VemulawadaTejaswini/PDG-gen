
import java.util.*;
	public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            //入力
            int n = Integer.parseInt(sc.next()), ret = 0;
            int[] num = new int[n];
            int[] x = new int[n];
            
            for(int i=0; i<n; i++){
            	num[i] = Integer.parseInt(sc.next());
            	x[i] = 0;
            }
            
            for(int i=n-1; i>=0; i--){
            	if(num[i] > i){
            		ret = -1;
            		break;
            	}
            	
            	if(num[i] != x[i]){
            		if(x[i - num[i]] > 0){
            			ret = -1;
            			break;
            		}else{
            			for(int j=num[i]-1; j>=0; j--){
            				x[i+j-num[i]] = j;
            			}
            			ret += num[i];
            		}
            	}
            }
            
            System.out.println(ret);
            sc.close();
        }
    }
	