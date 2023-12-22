import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        int x = stdIn.nextInt();
        int y = stdIn.nextInt();

        for(int k=1; k<=n-1; k++){
            int counter = 0;
            int a, b, minDist;
            for(int i=1; i<=n-1; i++){
                for(int j=i+1; j<=n; j++){
                    if(i < x && j < x){
                        if(j - i == k){
                            counter++;
                        }
                    }else if(i < x && x<= j && j < y){
                        a = j - i;
                        b = (x - i) + 1 + (y - j);
                        minDist = (a < b) ? a : b;
                        if(minDist == k){
                            counter++;
                        }
                    }else if(i < x && y <= j){
                        minDist = (x - i) + 1 + (j - y);
                        if(minDist == k){
                            counter++;
                        }
                    }else if(x <= i && i < y && x <= j && j < y){
                        a = j - i;
                        b = (i - x) + 1 + (y - j);
                        minDist = (a < b) ? a : b;
                        if(minDist == k){
                            counter++;
                        }
                    }else if(x <= i && i < y && y <= j){
                        a = j - i;
                        b = (i - x) + 1 + (j - y);
                        minDist = (a < b) ? a : b;
                        if(minDist == k){
                            counter++;
                        }
                    }else{
                        if(j - i == k){
                            counter++;
                        }
                    }
                }
            }

            System.out.println(counter);
        }
    }
}