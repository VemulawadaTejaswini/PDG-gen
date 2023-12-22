import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String data=sc.next();
		
		
		int count=0;
		for(int i=1;i<data.length();i++) {
			if(i!=data.length()) {
				int a=Integer.valueOf(data.substring(i-1,i));
				int b=Integer.valueOf(data.substring(i,i+1));
				if(a==b) {
					if(a==1) {
						data=data.substring(0,i)+"0"+data.substring(i+1);
					}else if(a==0){
						data=data.substring(0,i)+"1"+data.substring(i+1);
					}
					count++;
				}else {
				}
			}
		}
		
 
		System.out.println(count);
	}
}
