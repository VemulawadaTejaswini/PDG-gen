import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int selected = scanner.nextInt();

        int[] input = new int[size];
        for (int i = 0; i < size; i++) {
            input[i] = scanner.nextInt();
        }

        double maxSum = 0;
        int maxIndex = 0;
        for(int i =0; i < selected; i++){
            maxSum+= input[i];
        }
        double currentSum = maxSum;
        int currentIndex = maxIndex;
        for (int i = currentIndex; i < size -selected && i < currentIndex + selected; i++){
            currentSum += input[i + selected];
            currentSum -= input[i];
            if(maxSum < currentSum){
                maxSum = currentSum;
                maxIndex = i + 1;
            }
        }


        double answer = 0;
        for (int i = maxIndex; i < maxIndex + selected; i++) {
            double current = input[i];
            double sum = (current * (current + 1)) / 2 / current;
            answer += sum;
        }
        System.out.println(answer);
    }
}