
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int N = sc.nextInt();
                boolean ok = false;
                String stringN = String.valueOf(N);
                
                for(int i= 0; i< 3; i++){
                        if('7' == stringN.charAt(i)){
                        ok = true;
                        }
                }

                if(ok){
                        System.out.println("Yes");
                } else {
                        System.out.println("No");

                }
        }
}

        
        