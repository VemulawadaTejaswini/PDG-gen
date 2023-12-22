import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int K=stdIn.nextInt();
		int a[]=new int[N];
		int max[]=new int[K];
		int max2=0;
		int z=0,y=0,x=0;
		while(N>z){
			a[z]=stdIn.nextInt();
			z++;
		}z=0;
		while(N>x){	
			while(N>z){
				max2+=a[z];
				z++;
			}
			while(y<K){
				if(max[y]<max2)
					if(y!=0){
						if(max[y-1]>max2)
							max[y]=max2;
					}
					else
						max[y]=max2;
				y++;
			}y=0;
			max2=0;
			x++;
			z=x;
		}z=0;
		while(K>z){
			if(z+1==K)
				break;
			max2=max[z]&max[z+1];
			z++;
		}
		System.out.println(max2);
	}

}