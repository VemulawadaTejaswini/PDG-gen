import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int H=s.nextInt();
		int W=s.nextInt();
		String c[]=new String[H+1];
		int count=0;
	
		for(int i=0;i<=H;i++){
				c[i]=s.nextLine();
		}
		

		for(int i=1;i<H;i++){
			for(int j=1;j<W-1;j++){
				if(i==1){}
				else{
				if(c[i-1].charAt(j)==c[i].charAt(j))continue;
				}
				if(c[i].charAt(j-1)==c[i].charAt(j))continue;
				if(i==H-1){}
				else{
				if(c[i+1].charAt(j)==c[i].charAt(j))continue;
				}
				if(c[i].charAt(j+1)==c[i].charAt(j))continue;
				System.out.print("No");
				count++;
				break;
				}
			if(count!=0)break;
			}
		if(count==0)System.out.print("Yes");
		
	
		}

	}