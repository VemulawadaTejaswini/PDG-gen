import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] weather = {"Sunny", "Cloudy", "Rainy"};
        String choose = scanner.next();
        Black(weather, choose);

    }
    public static void Black(String[] arr, String weather){
        int size = arr.length;
        for(int i = 0; i < size; i++){

            if(weather.equals(arr[i])){
                if(i == size - 1)
                    System.out.println(arr[0]);
                else System.out.println(arr[i + 1]);
            }

        }
    }
}