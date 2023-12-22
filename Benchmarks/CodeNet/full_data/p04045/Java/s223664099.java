import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String n = sc.next();
		int k = sc.nextInt();
		char d[] = new char[k];
		StringBuffer ans = new StringBuffer();

		int flag = 0;
		for (int i = 0; i < k ;i++) {
			d[i] = sc.next().charAt(0);
			if(d[i] == '9') flag=1;
		}

		char x;
		int count =n.length();

		if(flag == 1){
		for (int i=0; i < n.length()  ;i++, count--){
			if(n.charAt(i) == '9'){
				double a = Integer.parseInt(n) + Math.pow(10, count);
				a = a - (a % Math.pow(10, count));
				n = String.valueOf((int)a);
			}
		}
		}

//		System.out.println("N=" + n);

		count = 1;
		for (int i= n.length() -1; i >= 0 ;i--, count++){
			x = n.charAt(i);
			for(int j=0; j < k ;j++) {

				if(x == d[j]){
//					if(x == '9'){
//						x = '0';
//						n = String.valueOf(Integer.parseInt(n) + Math.pow(10, count));
//					} else {
						int y =  Integer.parseInt("" + x) + 1;
						x = (char)('0' + y);

						if(j+1 == k){ans.insert(0, x);break;}
//					}
				}else{

					ans.insert(0, x);

					break;
				}

			}
		}

		System.out.println(ans);


		sc.close();
	}
}