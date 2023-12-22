import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(saiki(n,k));


    }

    private static int saiki(int n,int k){
        if(n<k)return 1;
        else return saiki(n/k,k)+1;
    }

}


