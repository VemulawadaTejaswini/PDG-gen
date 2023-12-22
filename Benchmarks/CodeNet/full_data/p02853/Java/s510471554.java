import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
	int y=sc.nextInt();

	int sum=0;

	if(x==1){
	sum+=300000;
	}
	else if(x==2){
	sum+=200000;
	}
	else if(x==3){
	sum+=300000;
	}
	else{
	sum+=0;
	}

	if(y==1){
	sum+=300000;
	}
	else if(y==2){
	sum+=200000;
	}
	else if(y==3){
	sum+=300000;
	}
	else{
	sum+=0;
	}

	if(x==1 && x==y){
	sum+=400000;
	}
	}
}