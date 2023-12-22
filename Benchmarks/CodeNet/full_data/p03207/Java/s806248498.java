import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int sum = 0;
        int max = 0;
        int number;
        for(int i =0;i<n;++i){
            number = reader.nextInt();
            sum+=number;
            if(number>max)
                max=number;
        }
        System.out.println(sum - max + max/2);
        reader.close();
    }
}