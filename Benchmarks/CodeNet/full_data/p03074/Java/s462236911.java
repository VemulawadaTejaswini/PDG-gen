import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int times = sc.nextInt();
		String s = sc.next();
		int counter=0;
		String st[] = s.split("");
		int flag =0;
		if(st[0].equals("1") )
			flag=1;
		
		for(int i=0;i<length-1;i++){
			if(!(st[i].equals(st[i+1]))){
				counter++;
			}
		}
		
		int counter2=0;
		int point[] = new int[counter+1];
		int j=0;
		
		for(int i=0;i<length-1;i++){
			if(!(st[i].equals(st[i+1]))){
				point[j] = i-counter2+1;
				counter2 =i+1;
				j++;
			}
		}
		if(j-1 != counter){
			point[j]=length-1-counter2+1;
		}

		int[] cumulativesum = new int[counter+2];
		cumulativesum[0]=0;
		for(int i=1;i<=counter+1;i++)
			cumulativesum[i]=cumulativesum[i-1]+point[i-1];
		
		int max1=-1;
		int max2=-1;
		int k=0;

		if(counter+1>2*times){
			k=2*times;
		}else
			k=counter+1;

		for(int i=0;i+k<counter+2;i++){
			if( (cumulativesum[i+k]-cumulativesum[i]) >max1){
				max1=cumulativesum[i+k]-cumulativesum[i];
			}else {
			}
		}
		
		k=0;

		if(counter+1>2*k+1){
			k=2*times+1;
		}else
			k=counter+1;

		if(flag ==1) {
			for(int i=0;i+k<counter+2;i=i+2){
				if( (cumulativesum[i+k]-cumulativesum[i]) >max2) {
					max2=cumulativesum[i+k]-cumulativesum[i];
				}
			}
		}else {
			for(int i=1;i+k<counter+2;i=i+2){
				if( (cumulativesum[i+k]-cumulativesum[i]) >max2) {
					max2=cumulativesum[i+k]-cumulativesum[i];
				}
			}
		}

		System.out.println(Math.max(max1,max2));
	}
}