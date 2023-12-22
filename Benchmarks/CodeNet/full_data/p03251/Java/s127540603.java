import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int N = Integer.parseInt(input.split(" ")[0]);
        int M = Integer.parseInt(input.split(" ")[1]);
        int X = Integer.parseInt(input.split(" ")[2]);
        int Y = Integer.parseInt(input.split(" ")[3]);
        int x[] = new int[N];
        input = sc.nextLine();
        for(int i = 0; i < N; i++){
            x[i] = Integer.parseInt(input.split(" ")[i]);
        }
        int y[] = new int[M];
        input = sc.nextLine();
        for(int i = 0; i < M; i++){
            y[i] = Integer.parseInt(input.split(" ")[i]);
        }

        boolean war = false;

        for(int i = X+1; i <= Y; i++){
            boolean xT = true;
            for(int j = 0; j < N; j++)if(xT && x[j] >= i)xT = false;
            boolean yT = true;
            for(int j = 0; j < M; j++)if(yT && y[j] < i)yT = false;
            if(xT && yT)war = true;
        }
        if(war){
            System.out.println("No War");
        }else{
            System.out.println("War");
        }

    }
}