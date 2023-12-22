import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean r = true;

        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            if (a % 2 == 1){continue;}
            if (a % 3 == 0 || a % 5 == 0){continue;}
            r = false;
        }

        if(r){
            System.out.println("APPROVED");
        }else{
            System.out.println("DENIED");
        }

        sc.close();
    }
}