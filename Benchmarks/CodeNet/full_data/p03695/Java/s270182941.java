import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int h=1;
		int n=scan.nextInt();
		int a=0;
		int hai[]= {0,0,0,0,0,0,0,0,0};
		int count=0;
		int kai1=0;
		int kai2=0;
		
		if(n>=1 && n<=100) {
			for(int i=0;i<n;i++) {
				a=scan.nextInt();
				
				if(a>=1 && a<=399) {
				hai[1]=1;
				}else if(a>=400 && a<=799) {
					hai[2]=1;
				}else if(a>=800 && a<=1199) {
					hai[3]=1;
				}else if(a>=1200 && a<=1599) {
					hai[4]=1;
				}else if(a>=1600 && a<=1999) {
					hai[5]=1;
				}else if(a>=2000 && a<=2399) {
					hai[6]=1;
				}else if(a>=2400 && a<=2799) {
					hai[7]=1;
				}else if(a>=2800 && a<=3199) {
					hai[8]=1;
				}else if(a>=3200 && a<=4800) {
					count=count+1;
				}
				
	
			}
			
			for(int x=0;x<8;x++) {
				if(hai[x]==1) {
					kai1=kai1+1;
				}
			}
			
			if(count>=1) {
				while(count>=1) {
				
						if(hai[h]==0) {
							hai[h]=1;
							count=count-1;
						}else if(h==8) {
							count=0;
						}else {
							h=h+1;
						}
						
						
						
					
					
				}
			}else {
				
			}
			
			for(int x=0;x<8;x++) {
				if(hai[x]==1) {
					kai2=kai2+1;
				}
			}
			
		
		}
		System.out.println(kai1+" "+kai2);
		
	}
}