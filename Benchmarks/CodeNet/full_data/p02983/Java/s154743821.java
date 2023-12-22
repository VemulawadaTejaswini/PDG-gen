import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // input L R
        Scanner sc = new Scanner(System.in);
        int numL = sc.nextInt();
        int numR = sc.nextInt();
        int retNum = 2018;
        for(int i = numL; i < numR; i++){
            for(int j = i + 1; j <= numR; j++){
                int testNum = (i * j) % 2019;
                if(testNum < retNum){
                    retNum = testNum;
                }
            }
        }
        System.out.println(retNum);
    }
}
