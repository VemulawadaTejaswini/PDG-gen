import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int l = stdIn.nextInt();
        int r = stdIn.nextInt();
    
        int min = 2018;
        for(int i = l;i < l + 2019 && i < r;i++) {
            for(int j = r;j > r - 2019 && j > i;j--) {
                if((i%2019)*(j%2019) < min){
                    min = (i%2019)*(j%2019);
                }
            }
        }

        System.out.println(min);
        
        
    }
}

