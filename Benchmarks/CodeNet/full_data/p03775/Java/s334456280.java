import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		long num = Long.parseLong(scanner.nextLine());
		scanner.close();

		long numsPiv = (long)Math.sqrt(num);
      
      	int min = 100;
      
		for (long i = 1; i <= numsPiv; i++) {
          	int aLen = 0;
          	int bLen = 0;
          	long a = 0;
           long b = 0;
			if (num % i == 0) {
              a = i;
              b = num / i;
              while(a > 0){
                a = a / 10;
				aLen++;
              }
              
              while(b > 0){
                b = b / 10;
				bLen++;
              }
              if(aLen >= bLen && min > aLen){
                min = aLen;
			}else if(aLen < bLen && min > bLen){
                min = bLen;
              }
		}
	}
      System.out.println(min);
    }
}