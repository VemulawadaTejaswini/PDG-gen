import java.util.*;


class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        double[] x = new double[n];
        String[] u = new String[n];
        double sum = 0;
        for(int i = 0; i < n; i++){
            x[i] = sc.nextDouble();
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