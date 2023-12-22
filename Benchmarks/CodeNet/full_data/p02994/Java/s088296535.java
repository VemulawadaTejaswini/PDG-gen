import java.util.*;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int l = sc.nextInt();

        Integer taste[] = new Integer[n];
        for (int i=0; i<n; i++){
            taste[i] = l+i;
        }

        int origin=0;
        for (int i=0; i<n; i++){
            origin += taste[i];
        }

        if (Arrays.asList(taste).contains(0)){
            System.out.println(origin);
        }else if (0<taste[0]){
            System.out.println(origin-taste[0]);
        }else{
            System.out.println(origin-taste[n-1]);
        }

    }
}

