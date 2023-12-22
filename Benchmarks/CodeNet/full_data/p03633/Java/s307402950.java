import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int length=stdIn.nextInt();
		int time[]=new int[length];
		for(int i=0;i<length;i++){
			time[i]=stdIn.nextInt();
	}
		for(int i=0;i<length;i++){
			for(int j=0;j<length-1;j++){
				int k;
				if(time[j]>time[j+1]){
					k=time[j+1];
					time[j+1]=time[j];
					time[j]=k;
				}
					
			}

	}
		 long ans=1;
		for(int i=0;i<length;i++){
			if(Judge(i,time,length))
				ans*=time[i];
			
		}
		
		 System.out.println(ans);
 


}
public static boolean Judge(int i,int time[],int length){
		for(int j=i+1;j<length;j++){
			if(time[j]%time[i]==0)
				return false;
		}
		return true;
	}
	

	 
}
