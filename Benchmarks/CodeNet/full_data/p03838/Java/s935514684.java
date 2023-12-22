import java.util.Scanner;
public class renshu{
 
public static void main(String[] args){
	Scanner kbs=new Scanner(System.in);
	int x=kbs.nextInt();
	int y=kbs.nextInt();
	int a=0,b=0;
	 if(y<0&&x>0){
		y*=-1;
		a++;
	 }else if(y>0&&x<0){
		x*=-1;
		a++;
	}
	else if(y<0&&x<0){
		a+=2;
		x*=-1;
		y*=-1;
	}
		
	
	
	b=x-y;
	if(b<0){b*=-1;}
	System.out.println(a+b);
	
	}
}