import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] a=new int[5];
		int an=0;
		int kk=9;
		for(int i = 0; i<5; i++){
			a[i]=sc.nextInt();
			if(a[i]%10!=0 && a[i]%10<=kk){
				kk=a[i]%10;
				an=a[i];
			}
		}
		int ans=0;
		int count=0;
		for(int i = 0; i<5; i++){
			if(a[i]==an && count==0){
				count++;
				continue;
			}
			if(ans%10!=0){
				ans+=10-ans%10;
				ans+=a[i];
			}else{
				ans+=a[i];
			}
		}
		if(ans%10!=0){
				ans+=10-ans%10;
				ans+=an;
		}else{
				ans+=an;
		}
		System.out.println(ans);
	}
}
