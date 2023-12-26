public class Main {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int X = scanner.nextInt();
        int max  = X + (K - 1);
        int min = X - (K - 1);
        while (min <= max){
            System.out.println(min);
            min++;
        }
        scanner.close();
    }
} 
