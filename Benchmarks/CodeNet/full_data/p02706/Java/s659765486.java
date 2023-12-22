import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();
        int homework = scan.nextInt();
        int sum = 0;
        int suji[] = new int[homework];
        for(int j = 0; j < suji.length; j++){
            suji[j] = scan.nextInt();
        }
        for(int i = 0; i < suji.length; i++){
            sum += suji[i];
        }
        int canPlay;
        canPlay = day - sum; 
        if(canPlay >=0){
            System.out.println(canPlay);
        }else{
            System.out.println(-1);
        }
    }
}