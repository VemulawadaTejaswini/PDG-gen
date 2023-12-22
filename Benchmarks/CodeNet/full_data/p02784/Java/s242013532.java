
import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner str = new Scanner(System.in);
        int H = str.nextInt();
        int N = str.nextInt();

        for(int i = 0; i < N; i++){
            H -= str.nextInt();
        }

        if(H <= 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        str.close();


    }
}