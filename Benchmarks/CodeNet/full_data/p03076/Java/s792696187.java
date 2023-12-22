import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int[] menu = new int[5];
		int last = 0;
		int sum = 0;
      
		for(int i=0; i<5; i++){
			menu[i] = sc.nextInt();
			if(i>0){
				if((menu[i]%10!=0)&&((menu[i]%10)<(menu[last]%10))){
					last = i;
            	}
        	}
        }
      
		for(int i=0; i<5; i++){
			if(i!=last){
				sum += menu[i];
        	}
        }
		sum += menu[last];
		System.out.println(sum);
	}
}