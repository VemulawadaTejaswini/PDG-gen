import java.util.*;
public class Main{
public static void main(String arg[]){
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int count=0;
	int arr[]=new int[a];
	for(int i=0;i<a;i++)
		arr[i]=sc.nextInt();
	for(int i=0;i<a;i++){
		while(true){
			if(arr[i]%2==0){
				count++;
				arr[i]=arr[i]/2;
		}
		else break;
	}
	}
	System.out.println(count);
}
}