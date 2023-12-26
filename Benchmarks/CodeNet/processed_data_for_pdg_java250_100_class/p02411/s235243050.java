public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
	while(a<49){
		int m = sc.nextInt();
		int f = sc.nextInt();
		int r = sc.nextInt();
		int mf = 0;
		if(m == -1){
			mf = f;
		}
		else if(f == -1){
			mf = m;
		}
		else{
			mf = m + f;
		}
			if(m==-1&&f==-1&&r==-1)break;
			if((m!=-1&&f!=-1)&&80<=mf){
				System.out.println("A");
			}
			else if((m!=-1&&f!=-1)&&65<=mf){
				System.out.println("B");
			}
			else if((m!=-1&&f!=-1)&&50<=mf){
				System.out.println("C");
			}
			else if((m!=-1&&f!=-1)&&30<=mf){
				if(r<50){
					System.out.println("D");
				}
				else {
					System.out.println("C");
				}
			}
			else{
				System.out.println("F");
			}
			a++;
		}
	}
}
