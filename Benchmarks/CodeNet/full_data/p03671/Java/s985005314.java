import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Scanner reader  =new Scanner(System.in);	
	 int a=reader.nextInt();
	 int b=reader.nextInt();
	 int c=reader.nextInt();
	 int s1=a+b;
	 int s2=b+c;
	 int s3=a+c;
	 if(s1>2) {
		 System.out.println(s1);
		 
	 }
	 else if (s2>s1){
		 System.out.println(s2);
	 }
	 else {
		 System.out.println(s3);
	 }
	}

}