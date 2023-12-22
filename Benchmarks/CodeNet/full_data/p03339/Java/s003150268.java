import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str = scan.next();

        int min = 30000000;

        for(int i = 0; i < n; i++){
            int cnt = 0;
            for(int j = 0; j < i; j++)
                if(str.charAt(j) == 'W')
                    cnt++;
            for(int j = i + 1; j < n; j++)
                if(str.charAt(j) == 'E')
                    cnt++;
            
            if(cnt < min)
                min = cnt;
        }

        System.out.println(min);
    }
}