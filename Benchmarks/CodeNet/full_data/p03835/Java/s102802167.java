import java.util.Scanner;

class Main{
  public static void main(String[] args) throws Exception{
	  Scanner sc = new Scanner(System.in);
	  int k = sc.nextInt();
	  int s = sc.nextInt();
	  int count = 0;
	  for(int i = 0; i < k; i++) {
		  for(int t = 0; t < k; k++ ) {
			  for(int j = 0; j < k; j++) {
				  int temp = 0;
				  temp = i + t + j;
				  if(temp == count) {
					  count++;
				  }
			  }
		  }
	  }
	  System.out.println(count);
  }
}