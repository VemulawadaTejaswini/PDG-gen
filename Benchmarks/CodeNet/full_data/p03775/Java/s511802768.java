import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //char[] S = sc.next().toCharArray();
        int count=0;
        String B;
        for(int i=1; i<=Math.sqrt(N); i++){
            if(N%i==0){
                B = String.valueOf(N/i);
                count = B.length();

            }

        }

          System.out.println(count);
        }
    }