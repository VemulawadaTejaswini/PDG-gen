import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();

        for(int i = 0; i < n ; i++){
            a.add(sc.nextInt());
        }
        if((n - 1)%(k - 1) != 0){
            System.out.println((n - 1)/(k - 1)+1);
        }else{
            System.out.println((n - 1)/(k - 1));
        }

    }
}