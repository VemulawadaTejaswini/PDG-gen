import java.util.*;
import java.io.*;
class Program{

}
class Main{
    public static void main(String args[]) throws IOException{
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(); double val, sum = 0; String total;
    while(N-->0){
        val = sc.nextDouble(); total = sc.next();
        if (total.equals("JPY")){
            sum += val;
        }
        else{
            sum += val* 380000;
        }
    }
    System.out.println(sum);
    }
}