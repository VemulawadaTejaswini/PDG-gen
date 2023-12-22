import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        int num = scan.nextInt();
        long[] initial = new int[5];
        for(int i = 0; i < num; i++){
            String temp = scan.next();
            switch(temp.charAt(0)){
                case 'M':
                    initial[0] += 1;
                    break;
                case 'A':
                    initial[1] += 1;
                    break;
                case 'R':
                    initial[2] += 1;
                    break;
                case 'C':
                    initial[3] += 1;
                    break;
                case 'H':
                    initial[4] += 1;
            }
        }

        // search
        long sum = 0;
        for(int a = 0; a < 3; a++){
            for(int b = a + 1; b < 4; b++){
                for(int c = b + 1; c < 5; c++){
                    if(initial[a] == 0 || initial[b] == 0 || initial[c] == 0){
                        continue;
                    }
                    sum += initial[a] * initial[b] * initial[c];
                }
            }
        }

        // answer
        System.out.println(sum);

    }
}