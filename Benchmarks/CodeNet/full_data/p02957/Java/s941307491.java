import java.util.*;
class Main {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
      	if((A+B)%2==0){
		int K = (A+B)/2;
		if((A-K)*(B-K)<0) {
			System.out.println(K);}else{
				System.out.println("IMPOSSIBLE");
			}
        }else{
          System.out.println("IMPOSSIBLE");
        }
	}
}