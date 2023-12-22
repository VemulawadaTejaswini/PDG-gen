import java.util.*;
public class Main{
	public static void main(String[] args){
		int ans = 0;
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int list[] = new int[n];
		for(int i=0; i<n; i++){
			list[i] = sc.nextInt();
		}
		
		int count1, count2;
		int max1=0, max2=0, max3=0, max4=0;
		int where1=0, where2=0, where3=0, where4=0;
		int check1=0, check2=0, check3=0, check4=0;
		for(int i=0; i<n; i+=2){
			count1 = 0;
			count2 = 0;
			for(int j=0; j<n; j+=2){
				if(list[i] == list[j]){
					count1++;
				}
				if(list[i+1] == list[j+1]){
					count2++;
				}
			}
			if(count1 >= max1 && (list[i] != list[where1] || check1 == 0)){
				max2 = max1;
				where2 = where1;
				max1 = count1;
				where1 = i;
				check1 = 1;
			}
			else if(count1 >= max2 && (list[i] != list[where1] && (list[i] != list[where2] || check2 == 0))){
				max2 = count1;
				where2 = i;
				check2 = 1;
			}
			if(count2 >= max3 && (list[i+1] != list[where3] || check3 == 0)){
				max4 = max3;
				where4 = where3;
				max3 = count2;
				where3 = i+1;
				check3 = 1;
			}
			else if(count2 >= max4 && (list[i+1] != list[where3] && (list[i+1] != list[where4] || check4 == 0))){
				max4 = count2;
				where4 = i+1;
				check4 = 1;
			}
		}
		
		if(list[where1] != list[where3]){
			ans = n - max1 - max3;
		}
		else{
			ans = n - Math.max(max1 + max4, max2 + max3);
		}
		
		System.out.println(ans);
	}
}