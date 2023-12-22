import java.util.Arrays;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] hw=new int[2];
		hw[0]=sc.nextInt();hw[1]=sc.nextInt();
		int min=hw[0]*hw[1];
		int[] a=new int[3];
		for(int i=0;i<2;i++){
			if(hw[i]%3==0){
				min=0;
				break;
			}else{
				min=(min>hw[i])?hw[i]:min;
			}
			for(int j=1;j<hw[(i+1)%2];j++){
				a[0]=hw[i]*j;
				if(hw[i]%2==0){
					a[1]=(hw[(i+1)%2]-j)*hw[i]/2;
					a[2]=a[1];
				}else{
					a[1]=(hw[(i+1)%2]-j)*(hw[i]/2);
					a[2]=(hw[(i+1)%2]-j)*(hw[i]-hw[i]/2);
				}
				Arrays.sort(a);
				min=(min>a[2]-a[0])?a[2]-a[0]:min;
			}
		}
		System.out.println(min);
	}

}
