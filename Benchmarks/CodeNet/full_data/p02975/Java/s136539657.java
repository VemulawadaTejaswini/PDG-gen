import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        int N = Integer.valueOf(line).intValue();
        line = sc.nextLine();
        String[] input = line.split(" ", 0);

        int i = 0;
        int[] num = new int[N+2];

        while(i != N){
            num[i] = Integer.valueOf(input[i]).intValue();
            i++;
        }

        num[N] = num[0];
        num[N+1] = num[1];

        boolean flag = true;

        i = 0;
        while(i != N){
            int temp = num[i]^num[i+2];
            if(temp != num[i+1]){
                flag = false;
                break;
            }
            i++;
        }

        if(flag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}

