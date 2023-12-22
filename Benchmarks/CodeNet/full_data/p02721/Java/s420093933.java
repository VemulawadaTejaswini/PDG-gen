import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		int n=scn.nextInt();
		int k =scn.nextInt();
		int c =scn.nextInt();
		String s=scn.next();
		int [] arr1 = new int[n];
		int [] arr2 =new int[n];
		for(int i=0;i<n;i++){
			if(s.charAt(i)!='x'){
				arr1[i]=i-c-1>=0?Math.max(arr1[i-1],arr1[i-c-1]+1):Math.max(i>0?arr1[i-1]:0, 1);
			}else{
			     arr1[i]=i>0?arr1[i-1]:0;
			}
		}
		for(int i=n-1;i>=0;i--){
			if(s.charAt(i)!='x'){
				arr2[i]=i+c+1<n?Math.max(arr2[i+1],arr2[i+c+1]+1):Math.max(i+1<n?arr2[i+1]:0,1);
			}else{
			     arr2[i]=i<n?arr2[i+1]:0;
			}
		}
		
		for(int i=0;i<n;i++){
			if(s.charAt(i)!='x'){
				int val = i>0?arr1[i-1]:0;
				int val2 =i+1<n?arr2[i+1]:0;
				
				if((val+val2+1)==k){
					System.out.println(i+1);
				}
			}
		}
		
		

	}

}