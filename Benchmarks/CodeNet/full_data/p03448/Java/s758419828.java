import java.util.Scanner;
public class Main {

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	// 入力
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	int c = sc.nextInt();
    	int x = sc.nextInt();

    	int ans = 0;

    	/*
    	//500円のみ
    	for(int i = 0;i <= a;i++){
    		int tmp =+ 500 * i;
        	if(tmp == x){
        		ans++;
        		break;
        	}
    	}


    	//100円のみ
    	for(int i = 0;i <= b;i++){
    		int tmp =+ 100 * i;
        	if(tmp == x){
        		ans++;
        		break;
        	}
    	}


    	//50円のみ
    	for(int i = 0;i <= c;i++){
    		int tmp =+ 50 * i;
        	if(tmp == x){
        		ans++;
        		break;
        	}
    	}


    	//500と100
    	for(int i = 0;i <= a;i++){
    		int tmp =+ 500 * i;
    		for(int j = 0;j <= b; j++){
    			tmp =+ 100 * j;
            	if(tmp == x){
            		ans++;
            	}
    		}
    	}


    	//500と50
    	for(int i = 0;i <= a;i++){
    		int tmp =+ 500 * i;
    		for(int j = 0;j <= c; j++){
    			tmp =+ 50 * j;
            	if(tmp == x){
            		ans++;
            	}
    		}
    	}


    	//100と50
    	for(int i = 0;i <= b;i++){
    		int tmp =+ 100 * i;
    		for(int j = 0;j <= c; j++){
    			tmp =+ 50 * j;
            	if(tmp == x){
            		ans++;
            	}
    		}
    	}
*/

    	//500,100,50
    	for(int i = 0;i <= b;i++){
    		int tmp =+ 500 * i;
    		for(int j = 0;j <= c; j++){
    			tmp =+ 100 * j;
    			for(int k = 0;k <= c;k++){
    				tmp =+ 50 * k;
                	if(tmp == x){
                		ans++;
                	}
    			}
    		}
    	}


    	// 出力
    	System.out.println(ans);
    }
}