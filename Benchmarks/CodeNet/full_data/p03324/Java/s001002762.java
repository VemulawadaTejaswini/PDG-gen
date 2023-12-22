import java.util.*;
public class Main{
  public static void main(String arg[]){
  Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
	int c=0;
	int arr[]={1,100,10000,1000000};
	for(int i=1;;i++){
		if((i%arr[a]==0)&&(i%arr[a+1]!=0))
			c++;
		if(c==b){
			System.out.println(i);
			break;
		}
	}
	
  }
}