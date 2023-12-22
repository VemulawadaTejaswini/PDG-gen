import java.util.*;


class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] x = new int[n];
        String[] u = new String[n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            x[i] = Integer.parseInt(sc.next());
            u[i] = sc.next();
            if(u[i].equals("JPY")){
                sum = sum + x[i];
            }else{
                sum = sum + x[i] * 380000;
            }
             
        }
        System.out.println(sum);
    }
}