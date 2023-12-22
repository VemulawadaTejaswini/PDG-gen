import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();
        long k = scanner.nextLong();
        long x;
        long index = 1;
        while(true){
            x = scanner.nextLong();
            if(x == 1)break;
            index++;
        }

        long counter = 0;
        long index_sub = index;
        while(true){
            counter++;
            index_sub -= k-1;
            if(index_sub <= 1) break;
        }
        index_sub = index;
        while(true){
            counter++;
            index_sub += k-1;
            if(index_sub >= n)break;
        }
        System.out.println(counter);
    }
}
