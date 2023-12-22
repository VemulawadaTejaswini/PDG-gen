import java.util.*;
	public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            //入力
            int[][] list = new int[3][3];
            
            for(int i=0; i<3; i++){
            	for(int j=0; j<3; j++){
            		int a = Integer.parseInt(sc.next());
            		list[i][j] =a;
            	}
            }

            //出力
            if(list[0][0] - list[1][0] == list[0][1] - list[1][1] 
            		&& list[0][1] - list[1][1] == list[0][2] - list[1][2]
            				&& list[1][0] - list[2][0] == list[1][1] - list[2][1] 
            	            		&& list[1][1] - list[2][1] == list[1][2] - list[2][2]
            	            				&& list[0][0] - list[0][1] == list[1][0] - list[1][1] 
            	            	            		&& list[0][0] - list[0][1] == list[2][0] - list[2][1]
            	            	            				&& list[0][1] - list[0][2] == list[1][1] - list[1][2] 
            	            	            	            		&& list[0][1] - list[0][2] == list[2][1] - list[2][2]){
            	System.out.println("Yes");
            }else{
            	System.out.println("No");
            }
            sc.close();
        }
    }