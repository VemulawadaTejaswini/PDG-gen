import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner stdin =new Scanner(System.in);
		int n=stdin.nextInt();
		int a[]=new int[n];
		int i,j,k;
		int sum=0;
		int dis;
		int temp;
		int index;
		int b[]=new int[n];
		for(i=0;i<n;i++)
			a[i]=stdin.nextInt();

		for(i=0;i<n;i++){
			sum=0;
			dis=0;
			temp=a[i];
			index=i;
			k=0;
			b[0]=0;
			for(j=1;j<n;j++,k++){
				if(index==k) k++;
				b[j]=a[k];
			}
			for(j=1;j<n;j++){
				dis=Math.abs(b[j]-b[j-1]);
				sum+=dis;
			}
			if(b[n-1]!=0)
				sum+=Math.abs(b[n-1]);

			a[i]=temp;
			System.out.println(sum);
		}
	}
}
