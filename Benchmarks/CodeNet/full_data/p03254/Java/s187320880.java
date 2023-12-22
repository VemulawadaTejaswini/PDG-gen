import java.util.Scanner;
class Main{ 	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int x = sc.nextInt();
		int a[]=new int[N];
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		for(int j=0;j<a.length-1;j++){
			for(int i=1;i<a.length;i++){
				if(a[i-1]>a[i]){
					int tmp=a[i];
					a[i]=a[i-1];
					a[i-1]=tmp;
				}
			}
		}
		int count=0;
		for(int i=0;i<a.length;i++){
			x-=a[i];
			if(x<0){
				break;
			}
			count++;	
		}
		if(x>0){
			count--;
		}
		System.out.println(count);
	}
}
