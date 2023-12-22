
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String str = scn.next();
		int []arr=new int[str.length()];
		for(int i=0,j=str.length()-1;i<str.length()&&j>=0;i++,j--) {
			if( str.charAt(i)=='R') {
				if(i>0&&str.charAt(i-1)=='R') {
					arr[i]=arr[i-1]+1;
					arr[i-1]=0;
				}else {
					arr[i]=1;
				}
			}
			if(str.charAt(j)=='L') {
				if(j<str.length()-1&&str.charAt(j+1)=='L') {
					arr[j]=arr[j+1]+1;
					arr[j+1]=0;
				}else {
					arr[j]=1;
				}
			}
		}
//		for(int i=0;i<str.length();i++) {
//			System.out.print(arr[i]+" ");
//		}
		for(int i=0;i<str.length();i++) {
			if(i+1<str.length()&&str.charAt(i)=='R'&&str.charAt(i+1)=='L') {
				int x=Integer.max(arr[i], arr[i+1])-Integer.min(arr[i], arr[i+1]);
				if(arr[i]<arr[i+1]) {
					arr[i]+=x/2;
					arr[i+1]-=x/2;
				}else {
					arr[i+1]+=x/2;
					arr[i]-=x/2;
				}
				if((Integer.max(arr[i], arr[i+1])-1)%2!=0) {
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					
				}
			}
		}
		for(int i=0;i<str.length();i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
