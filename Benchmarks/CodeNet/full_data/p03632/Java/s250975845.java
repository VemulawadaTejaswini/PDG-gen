import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int array[] = new int[4];
		while(in.hasNext()){
			for(int i=0;i<4;i++){
				array[i] = in.nextInt();
			}
			int a = array[0];
			int b = array[1];
			int c = array[2];
			int d = array[3];
			if(c<b&&a<d){
				if(c>=a&&d>=b){System.out.println(b-c);}
				if(a>=c&&b>=d){System.out.println(d-a);}
				if(c>=a&&b>=d){System.out.println(d-c);}
				if(a>=c&&d>=b){System.out.println(b-a);}
			}else{
				System.out.println(0);
			}
		}
	}
}
