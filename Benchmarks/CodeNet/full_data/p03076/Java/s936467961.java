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
      
		int i=0;
		int count=0;
		while(count<4){
			if(sum%10!=0){
				sum++;
				if(sum%10==0){
					count++;
				}
			}else if(i!=last){
				sum += menu[i];
				i++;
				if(sum%10==0){
					count++;
				}
        	}else if(i==last){
        		i++;
        	}
		}
		sum += menu[last];
		System.out.println(sum);
	}
}