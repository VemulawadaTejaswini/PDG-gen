import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int row,ame1[],ame2[],ame1d[],ame2d[],max,one;
		String a,b;
		max = 0;
		row = Integer.parseInt(sc.nextLine());
		ame1 = new int[row];
		ame2 = new int[row];
		ame1d = new int[row];
		ame2d = new int[row];
		
		a = sc.nextLine();
		b = sc.nextLine();
		
		String[] ar1 = a.split(" ");
		String[] ar2 = b.split(" ");
		
		for(int i=0;i<row;i++){
			ame1[i] = Integer.parseInt(ar1[i]);
		}
		for(int i=0;i<row;i++){
			ame2[i] = Integer.parseInt(ar2[i]);
		}
		
		for(int m=0;m<row;m++){
			ame1d[m] = ame1[m];
		}
		for(int m=0;m<row;m++){
			ame2d[m] = ame2[m];
		}
		
		for(int i=0;i<row;i++){
			for(int m=0;m<row;m++){
				ame1[m] = ame1d[m];
			}
			for(int m=0;m<row;m++){
				ame2[m] = ame2d[m];
			}
			one = 0;
			for(int j=0;j<row;j++){
				while(j<i){
					one += ame1[j];
					ame1[j] = 0;
					
					if(j < row-1){
						one += ame2[j+1];
						ame2[j+1] = 0;
					}
					
				}
				one += ame2[j];
				ame2[j] = 0;
				
				if(i > 0){
					one += ame1[j-1];
					one = 0;
				}
				
			}
			
			if(one > max){
				max = one;
			}
		}
		System.out.println(max);
	}
}