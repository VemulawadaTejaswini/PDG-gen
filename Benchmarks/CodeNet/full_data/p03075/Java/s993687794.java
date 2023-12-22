import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int numlist[] = new int[4];
        int k = 0;
        boolean isOk = true;
        
        for(int i=0; i<4; i++){
            numlist[i] = sc.nextInt();
        }

        k = sc.nextInt();

        loop:for(int i=0; i<4; i++){
            for(int j=i+1; j<4; j++){
                if((numlist[j]-numlist[i])>k){
                    isOk = false;
                    break loop;
                }
            }
        }
        if(isOk){
            System.out.println("Yay!");
        }
        else{
            System.out.println(":(");
        }
    }
}