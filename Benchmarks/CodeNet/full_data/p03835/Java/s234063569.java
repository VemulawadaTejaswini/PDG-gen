import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int s=sc.nextInt();
		int x,y,z;
		int count=0;
		
		for(x=k;x>=0;x--){
			for(y=0;y<=k; y++){
				if(x+y>k)break;
				for(z=0;z<=k;z++){
					if((x+y+z)==s){
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}

}
