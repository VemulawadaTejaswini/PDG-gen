import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.lang.Math;

class Main{

    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            int input = scanner.nextInt();
            list.add(input);
        }
        scanner.close();
        double sum = 0;
        for (int i : list) {
            sum += i;
        }
        double p1 = Math.floor(sum/n);
        double p2 = Math.ceil(sum/n);
        double result1 = 0;
        double result2 = 0;
        for(int i : list){
            result1 += Math.pow(i-p1, 2);
            result2 += Math.pow(i-p2, 2);
        }
        if(result1 > result2){
            System.out.println((int)result2);
        }else{
            System.out.println((int)result1);
        }
        
    }
}