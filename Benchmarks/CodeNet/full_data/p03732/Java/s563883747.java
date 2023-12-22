import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Main{


	static	ArrayList<Integer> one ;
	static	ArrayList<Integer> two ;
	static	ArrayList<Integer> three ;
	static	ArrayList<Integer> four ;

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);			//文字の入力
		int N = sc.nextInt();
		long W = sc.nextLong();
		
		one =new  ArrayList<Integer>();
		two =new  ArrayList<Integer>();
		three =new  ArrayList<Integer>();
		four =new  ArrayList<Integer>();

		one.add(0);
		two.add(0);
		three.add(0);
		four.add(0);



		long w0 = 0;

		
		for(int i = 0;i < N;i++){

			long w = sc.nextLong();
			int v = sc.nextInt();

			if(i == 0){
				w0  = w;
				one.add(v);
			}else{
				if(w == w0){
					one.add(v);
				}else if(w == w0+1){
					two.add(v);
				}else if(w == w0+2){
					three.add(v);
				}else{
					four.add(v);
				}

			}
		}
		Collections.sort(one);
		Collections.sort(two);
		Collections.sort(three);
		Collections.sort(four);

//		for(int i = 0;i < two.size();i++){
//			System.out.println(two.get(i));
//		}
		
		long ans = 0;
		long count = 0;


		for(int i = 0;i < one.size();i++){
			for(int j = 0;j < two.size();j++){
				for(int m = 0;m < three.size();m++){
					for(int f = 0;f < four.size();f++){
						
						if(i*w0 + j*(w0+1) +m*(w0+2)+f*(w0+3) <= W){
						count = sum(i,j,m,f);
						ans = Math.max(ans, count);
						}
					}
				}
			}


		}
		System.out.println(ans);


	}



	static long sum(int onenum,int twonum,int threenum,int fournum){

		long c = 0;
		for(int i = 0;i < onenum;i++){
			c += one.get(one.size()-i-1);
		}
		for(int i = 0;i < twonum;i++){
			c += two.get(two.size()-i-1);
		}
		for(int i = 0;i < threenum;i++){
			c += three.get(three.size()-i-1);
		}
		for(int i = 0;i < fournum;i++){
			c += four.get(four.size()-i-1);
		}

		return c;

	}









}







class MyComparator implements Comparator {

	public int compare(Object obj1, Object obj2) {

		int num1 = (int)obj1;
		int num2 = (int)obj2;

		if(num1 < num2) {
			return 1;
		} else if(num1 > num2) {
			return -1;
		} else{
			return 0;
		}
	}
}


