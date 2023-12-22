import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

		public static void main(String[] args){
			 int sam = 0;
			
			Scanner sc = new Scanner(System.in);
			// 整数の入力
			// スペース区切りの整数の入力
			int a = sc.nextInt();

			ArrayList<Integer> stateList = new ArrayList<Integer>();
					
			for (int i = 0; i < a;i ++ ){
				stateList.add(sc.nextInt());
			}
			 
			 Collections.sort(stateList);
			 
			 for(int i=0;i<stateList.size();i++){
				 sam = 0;
				 for(int j=i;j<stateList.size();j++){
					 sam = sam + stateList.get(j);
				 }
				 int check = sam % 10 ;
				 if(check == 0 ){
					 continue;
				 }else{
						// 出力
						System.out.println(sam);
						return;
				 }
			 }

			// 出力
			System.out.println("0");
			

		}
}
