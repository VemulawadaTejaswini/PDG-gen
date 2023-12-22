import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] =  new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        int cnt = 0;
        boolean check = false;

        while(true){

            //check whether there exists an odd number
            for(int j = 0; j < n; j++){
                if(a[j] % 2 == 1){
                    check = true;
                }
            }
           
            //if check = true, loop must end
            if(check) break;

            //divide each number by 2 and count that activity
            for(int i = 0; i < n; i++){
                a[i] /= 2;
            }

            //add +1 to the record of the number of division
            cnt++;
        }

        System.out.println(cnt);
    }
}