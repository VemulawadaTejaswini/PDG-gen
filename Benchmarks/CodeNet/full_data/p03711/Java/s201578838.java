import java.util.Scanner;

class Main{
	public static void main(String[] args){
	int[] a = {1,3,5,7,8,10,12};
	int[] b = {4,6,9,11};
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		if(MySearch(a,x)==1 && MySearch(a,y)==1){
			System.out.println("Yes");
			return;
		}
		if(MySearch(b,x)==1 && MySearch(b,y)==1){
			System.out.println("Yes");
			return;
		}
		System.out.println("No");
	}
	public static int MySearch(int[] list,int x){
		int ans = 0;
		for(int i=0;i<list.length;i++){	
if(x==list[i]){
				ans = 1;
				break;
			}
		}
		return ans;
	}
}