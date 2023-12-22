import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double count = ;
        for(int i = 1; i <= a; i++){
            if(i % 2 != 0){
                count++;
            }
        }
        double sum = count / a;
        System.out.println(sum);
    }
}