import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int socket = sc.nextInt();
        int goal = sc.nextInt();

        int layer = 1;
        int nowPlugs = 1;
        int usedSockets = 0;
        for(int i=0; goal > nowPlugs; i++){
           if(socket*layer==i){
               i=0;
               layer++;
           }
           nowPlugs += socket-1;
           usedSockets++;
        }
        System.out.println(usedSockets);
    }
}