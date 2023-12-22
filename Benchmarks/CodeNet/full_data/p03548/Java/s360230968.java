import java.util.*;

class Main{
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int retint = 0;
		x -= z;
		for(;x>=0;){
			retint++;
			x = x - y - z;
		}
		retint--;
		System.out.println(retint);
    }
}
