import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		long H=stdIn.nextLong();
		long W=stdIn.nextLong();
		long min=2147482704;
		long z=1;
		if(H%3==0||W%3==0)
			System.out.println(0);
		else{
			while(H-1>z){
				if(W/2*z<(H-z)*W){
					if(min>((H-z)*W)-(W/2*z))
						min=((H-z)*W)-(W/2*z);
				}
				else{
					if(min>(W/2*z)-((H-z)*W))
						min=(W/2*z)-((H-z)*W);
				}
				z++;
			}z=1;
			while(W-1>z){
				if(H/2*z<(W-z)*H){
					if(min>((W-z)*H)-(H/2*z))
						min=((W-z)*H)-(H/2*z);
				}
				else{
					if(min>(H/2*z)-((W-z)*H))
						min=(H/2*z)-((W-z)*H);
				}
				z++;
			}
		}
		System.out.println(min);
	}
}