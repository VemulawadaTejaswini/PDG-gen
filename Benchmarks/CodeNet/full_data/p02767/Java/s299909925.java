import java.util.*;
class Main{
	public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
			int [] b = new int[a];
      //int c = sc.nextInt();



			int sum = 0;
      for(int i = 0;i < a; i++){
				b[i] = sc.nextInt();
				sum += b[i];
			}

			int pos = 0;
			if(sum%a >= (float)a/2)pos = (sum/a) + 1;
			else pos = sum/a;
			
			sum = 0;
			for(int i = 0;i < a; i++){

				sum += (b[i] - pos)*(b[i] - pos);

			}
			System.out.println(sum);

    }


    public static long factorial(long n){
      if(n == 0){
        return new Long(1);
       }
       System.out.println(n * factorial(n-1));

      return n * factorial(n-1);
    }
}
