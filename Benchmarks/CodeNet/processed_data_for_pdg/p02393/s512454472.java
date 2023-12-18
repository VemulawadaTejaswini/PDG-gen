public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int[] numbers = {a, b, c};
    int nLength = numbers.length;
    int min = 0;
    int mid = 0;
    int max = 0;
    if(0 <= a && a <= 10000 && 0 <= b && b <= 10000 && 0 <= c && c <= 10000) {
        for(int i = 0; i < nLength; i++) {
            if(numbers[i] > max) {
                min = mid;
                mid = max;
                max = numbers[i];
            }else if(max > numbers[i] && numbers[i] > mid) {
                min = mid;
                mid = numbers[i];
            }else {
                min = numbers[i];
            }
        }
        System.out.println(min + " " + mid + " " + max);
    }else {
        System.out.println("Please enter a number from 0 to 10000.");
    }
  }    
}
