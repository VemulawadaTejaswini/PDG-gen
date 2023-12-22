import java.util.*;
public class Main {
	public static void main(String[] args){
		string[] name;
		int[] num;
		int flag = 0;
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		for(int j = 0 ;j<i ;j++){
			flag = 0;
			int a = sc.nextInt();
			int listlen = name.length;
			if (listlen == 0){
				string[0] = a;
				num[0] = 1;
			}else{
				for(int k = 0;k<listlen;k++){
					if(string[k]==a){
						num[k] = num[k]+1;
						k = listlen;
						flag = 1;
					}
				}
				if(flag == 0){
					string[listlen] = a;
					name[listlen] = 1;
				}
			}
		}
		
		for(int i=0;i<num.length-1;i++){
			for(int j=num.length-1;j>i;j--){
				if(num[j]<num[j-1]){
					int t=num[j];
					num[j]=num[j-1];
					num[j-1]=t;
					string s=name[j];
					name[j]=name[j-1];
					name[j-1]=t;
				}
			}
		}
		for(int i=0;i<name.length;i++){
			System.out.println(name[i]);
		}	
	}
}