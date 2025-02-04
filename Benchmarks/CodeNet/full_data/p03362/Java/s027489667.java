import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		PrimeNumberGenerator png = new PrimeNumberGenerator();
		
		int start = 0;
		if(n % 2 == 0){
			start = 3;
		}
		else {
			start = 2;
		}
		
		int count = 0;
		for(int i = start ; i <= 55555; i++){
			if(png.isPrime(i)){
				System.out.print(i);
				count++;
				
				if(count == n){
					break;
				}
				else {
					System.out.print(" ");
				}
			}
		}
		System.out.println();
	}

}


class PrimeNumberGenerator {
    private boolean[] isPrime= new boolean[10000001];
 
    public PrimeNumberGenerator() {
        //Date from = new Date();
        Arrays.fill(isPrime, true);
 
        isPrime[0] = false;
        isPrime[1] = false;
        isPrime[2] = true;
 
        for(int i = 3; i <= Math.sqrt( isPrime.length ); i+=2){
            /*
            if(i % 2 == 0){
                isPrime[i] = false;
                continue;
            }
            */
 
            if(isPrime[i] == false){
                continue;
            }
 
            for(int j = i * 2; j <= isPrime.length - 1; j += i){
                isPrime[j] = false;
            }
        }
        //Date to = new Date();
        //System.out.println("init takes "+ (to.getTime() - from.getTime())+ "milli sec");
    }
 
    public boolean isPrime(int index){
        if(index % 2 == 0 && index != 2){
            return false;
        }
        return isPrime[index];
    }
}