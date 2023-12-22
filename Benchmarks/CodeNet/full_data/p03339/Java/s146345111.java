import java.util.Scanner;

class Main {
    static public void main(String args[]){

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        String s = scan.next();
        int west[] = new int[n+1];
        int east[] = new int[n+1];

        west[0] = 0;
        east[n] = 0;

        for(int i = 0; i < n; i++){
            if(s.charAt(i) == 'W'){
                west[i+1] = west[i]+1;
            }
            else{
                west[i+1] = west[i];
            }

            if(s.charAt(n-1-i) == 'E'){
                east[n-1-i] = east[n-i]+1;
            }
            else{
                east[n-1-i] = east[n-i];
            }
        }

        int min = (int)1e9;
        int sum;
        for(int i = 0; i < n; i++){
            sum = west[i]+east[i+1];
            if(sum < min)min = sum;
        }
        System.out.println(min);

    }
}
