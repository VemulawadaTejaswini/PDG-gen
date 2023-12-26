public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt()+1;
		int m = sc.nextInt();
		int x = sc.nextInt();
		int evalu[] = new int[m];
		int a[] = new int[m];
		int light = 0;
		int left = 0;
		for(int i = 0;i < m;i++){
			a[i] = sc.nextInt();
			if(a[i]>x){
				light++;
			}else if(a[i]<x){
				left++;
			}
		}
		if (light == left){
			System.out.println(left);	
		}else if(light > left){
			System.out.println(left);
		}else if(light < left){
			System.out.println(light);
		}
	}
}
