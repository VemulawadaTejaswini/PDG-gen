public class Main {
	public static Scanner sc;
	public static void main(String[] args) {
		int n[]= new int[101];
		int x[]= new int[300];
		sc = new Scanner(System.in);
		int i=1;
		int s[]= new int[101];
		int sum=0;
		int count=0;
		for(;;) {
			n[i]=sc.nextInt();
			x[i]=sc.nextInt();
			if(n[i]==0 && x[i]==0) {
				break;
			}
			i++;
		}
		i=1;
		for(;;) {
			if(n[i]==0 && x[i]==0) {
				break;
			}
			for(int j=1;j<=n[i];j++) {
				s[j]=j;
			}
			i++;
		}
		i=1;
		for(;;) {
			if(n[i]==0 && x[i]==0) {
				break;
				}
			for(int l=1;l<=n[i];l++) {
				for(int m=l+1;m<=n[i];m++) {
					for(int p=m+1;p<=n[i];p++) {							
						sum=s[l]+s[m]+s[p];
						if(x[i]==sum) {
							count+=1;
						}
					}
				}
			}
			i++;
			System.out.println(count);
			count=0;
		}
	}
}
