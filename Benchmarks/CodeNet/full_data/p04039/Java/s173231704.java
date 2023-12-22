

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int knum = scan.nextInt();
		int[] hateNums = new int[knum];
		for(int i = 0; i < knum; i++){
			hateNums[i] = scan.nextInt();
		}
		
		char[] likeNums = new char[10];
		int count = 0;
		for(int i=0; i<knum; i++){
			if(i != hateNums[i]){
				likeNums[count] = (char)i;
				count++;
			}
		}
		
//		count = 0;
//		int result = 0;
//		while(true){
//			for(int i=0; i<count; i++){
//				for(int t=0; t<likeNums.length; t++){
//					result = likeNums[t];
//					if(n < result){
//						System.out.println(result);
//						break;
//					}
//				}
//			}
//		}
		
		int result = n;
		String pu = "";
		for(int i=0; i<10000; i++){
			
			String price = String.valueOf(n);
			String res = String.valueOf(result);
			
			int co = 0;
			for(int t=0; t<hateNums.length; t++){
				String s = String.valueOf(hateNums[t]);
				if(!res.contains(s)){
					co++;
				}
				if(co == hateNums.length){
					pu = res;
				}
			}
			if(pu != ""){
				break;
			}
			result++;
		}
		System.out.println(pu);
		
	}

}
