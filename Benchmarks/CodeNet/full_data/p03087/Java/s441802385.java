import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		String str = sc.next();
		int a[] = new int[n];
		boolean hantei = false;
		
		for(int i = 0; i < n; i++){
			char c = str.charAt(i);
			if(c == 'A'){
				hantei = true;
			}else if(hantei && (c == 'C')){
				a[i] = 1;
				hantei = false;
			}else{
				hantei = false;
			}
		}
		
		for(int i = 0; i < q; i++){
			int l = sc.nextInt();
			int r = sc.nextInt();
			int kekka = sousa(l,r,a);
			System.out.println(kekka);
		}
	}
	
	private static int sousa(int l, int r, int a[]){
		int kekka = 0;
		for(int i = l; i < r; i++){
			kekka += a[i];
		}
		return kekka;
	}
}