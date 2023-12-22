import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str = scan.next();

        int min = 0;

        for(int i = 1; i < n; i++)
            if(str.charAt(i) == 'E')
                    min++;

        int memo = min;
        for(int i = 1; i < n; i++){
            if(str.charAt(i - 1) == 'E' && str.charAt(i) == 'E')
                    memo--;
            if(str.charAt(i - 1) == 'W' && str.charAt(i) == 'W')
                    memo++;
            if(memo < min)
                min = memo;
        }

        System.out.println(min);
    }
}