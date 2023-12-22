import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String sc1 = scanner.nextLine();
        String scline = scanner.nextLine();
        String array[] = sc.nextLine().split(" ");   
        double sum = 0;
        for( int i=0; i<sc1; i++ ) {
                sum += array[i];
        }
        int ave = Math.round(sum/sc1)
        double sum2 = 0;
        for( int i=0; i<sc1; i++ ) {
                sum2 += Math.pow(array[i] - ave);
        }
        System.out.println(sum2)
    }
}