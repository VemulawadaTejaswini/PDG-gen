import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < a.length; i++){
			a[i] = sc.nextInt();
		}
		int length = a.length;
		while(length > 1){
			int at = (int)(Math.random()*length);
			int pro;
			do{
				pro = (int)(Math.random()*length);
			}while(at != pro);
			a[pro] = a[pro] - a[at];
			for(int i = 0; i < length; i++){
				if(a[i]<=0){
					a[i] = a[length-1];
				}
				if(a[i]<=0){
					length--;
				}
			}
		}
		System.out.println(a[0]);
	}
}