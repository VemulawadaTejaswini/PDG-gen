import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

		public static void main(String[] args){
			int iro = 0 ;
			int sum = 0;
			int kasan = 0 ;
			 
			Scanner sc = new Scanner(System.in);
			// 整数の入力
			// スペース区切りの整数の入力
			int a = sc.nextInt();

			ArrayList<Integer> stateList = new ArrayList<Integer>();
					
			for (int i = 0; i < a;i ++ ){
				stateList.add(sc.nextInt());
			}
			 
			int stArray[] = new int[8];
			for(int i=0;i<stateList.size();i++){
				if ((stateList.get(i) >= 0 ) & (stateList.get(i) <= 399)) {
					iro = 0;
					stArray[iro] = 1;
				}else if((stateList.get(i) >= 400 ) & (stateList.get(i) <= 799) ){
					iro = 1;
					stArray[iro] = 1;
				}else if((stateList.get(i) >= 800 ) & (stateList.get(i) <= 1199) ){
					iro = 2;
					stArray[iro] = 1;
				}else if((stateList.get(i) >= 1200 ) & (stateList.get(i) <= 1599) ){
					iro = 3;
					stArray[iro] = 1;
				}else if((stateList.get(i) >= 1600 ) & (stateList.get(i) <= 1999) ){
					iro = 4;
					stArray[iro] = 1;
				}else if((stateList.get(i) >= 2000 ) & (stateList.get(i) <= 2399) ){
					iro = 5;
					stArray[iro] = 1;
				}else if((stateList.get(i) >= 2400 ) & (stateList.get(i) <= 2799) ){
					iro = 6;
					stArray[iro] = 1;
				}else if((stateList.get(i) >= 2800 ) & (stateList.get(i) <= 3199)) {
					iro = 7;
					stArray[iro] = 1;
				}else{
					kasan = kasan + 1;
				}
    		 }

    		 for(int j=0;j<8;j++){
    			 if (stArray[j] == 1){
    				 sum = sum + 1;
    			 }
	    	 }
    		 kasan = kasan + sum;
    		 if (kasan > 8){
    			 kasan = 8;
    		 }
    		 // 出力
			System.out.println(sum + " " +  kasan );
		}
}
