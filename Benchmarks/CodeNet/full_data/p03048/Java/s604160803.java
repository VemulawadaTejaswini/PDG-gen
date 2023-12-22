import java.util.Scanner;

public final class Main {
    public static void main(String[] args){

        Scanner stdIn = new Scanner(System.in);

        int R = stdIn.nextInt();
        int G = stdIn.nextInt();
        int B = stdIn.nextInt();
        int N = stdIn.nextInt();

        int counter = 0;

        for(int r=0; r<=N; r++){
            if(r*R>N){
                break;
            }
            for(int g=0; g<=N; g++){
                if(r*R+g*G>N){
                    break;
                }
                for(int b=0; b<=N; b++){
                    if(r*R+g*G+b*B>N){
                        break;
                    }
                    if(r*R+g*G+b*B == N){
                        counter++;
                    }
                }
            }
        }

        System.out.println(counter);
    }
}
