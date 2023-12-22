import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();
        int[] votes = new int[n];
        int total=0;
        for (int i = 0; i < n; i++) {
            int vote = input.nextInt();
            total+=vote;
            votes[i] =vote;
        }
        int counter =0;
        for (int i = 0; i < n; i++) {
            if((total/(4*m)) > votes[i] ){
                counter++;
            }else{
                break;
            }
        }
        if(counter >=m){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
