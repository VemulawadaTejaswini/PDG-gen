import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		//String t = sc.next();
		//char[] c = t.toCharArray();
		//c[0] = (char) (c[0]+1);
		int m = Integer.parseInt(sc.next());
		//int m = Integer.parseInt(sc.next());
		//int n = Integer.parseInt(sc.next());
		//long res=n;
		//int l = Integer.parseInt(sc.next());
		//int sum=0;
		//String s = sc.next();
		//String t = sc.next();
		//String w = sc.next();
		//int a = Integer.parseInt(sc.next());
		//String t = sc.next();
		int[] arrayp = new int[Math.max(n,m)];
		String[] arrays = new String[Math.max(n,m)];
		int[] arrayA = new int[Math.max(n,m)];
		int[] arrayW = new int[Math.max(n,m)];
		for(int i=0;i<m;i++) {
			arrayp[i] = sc.nextInt();
			arrays[i] = sc.next();
		}
		for(int i=0;i<m;i++) {
			if(arrays[i].equals("AC")){
				arrayA[arrayp[i]]=1;
			}else if(arrayA[arrayp[i]]!=1){
				arrayW[arrayp[i]]+=1;
			}
		}
		int counta=0,countw=0;

	/*	if(res>=0&&res<=k) {//a、e、i、o、u
			System.out.println(res);
		}else if(res<0){
			System.out.println(0);
		}else {
			System.out.println(-1);
		}*/
		for(int i=0;i<m;i++) {
			if(arrayA[i]>0) {
				counta+=1;
				if(arrayW[i]>0) {
					countw+=arrayW[i];
				}
			}
		}
		System.out.println(counta+" "+countw);

	}
}


