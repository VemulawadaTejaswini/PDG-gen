import java.util.*;
	public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            
            //入力
            int n = Integer.parseInt(sc.next());
            int count = 0;
            char[][] board = new char[n][n];
            int flag = 0;

sc.useDelimiter("");
            
            sc.next();
            
            for(int i=0; i<n; i++){
            	for(int j=0; j<n; j++){
            		board[i][j] = sc.next().charAt(0);
            	}
            	sc.next();
            }

            for(int i=0; i<n; i++){
            	flag = 0;
            	for(int j=0; j<n; j++){
            		for(int k=0; k<n; k++){
            			if(board[(j+i)%n][k] != board[(k+i)%n][j]){
            				flag = 1;
            				break;
            			}
            		}
            		if(flag == 1){
            			break;
            		}
            	}
            	if(flag == 0){
            		count++;
            	}
            }
            
            //出力
            System.out.println(n * count);
            sc.close();
        }
    }
	