import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a=new int[3];
		for(int i=0;i<3;i++){
			a[i]=sc.nextInt();
		}
		if(a[0]==a[1]){
			System.out.println(a[2]);
		}else if(a[0]==a[2]){
			System.out.println(a[1]);
		}else{
			System.out.println(a[3]);
		}



	}

}