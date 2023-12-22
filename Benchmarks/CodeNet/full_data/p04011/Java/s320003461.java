import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args){

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int stay = Integer.parseInt(input.readLine());
        int sale = Integer.parseInt(input.readLine());
        int normalCost = Integer.parseInt(input.readLine());
        int saleCost = Integer.parseInt(input.readLine());
        if(stay > sale){
            System.out.println(sale * normalCost + (( stay - sale ) * saleCost));
        }else{
        System.out.println(stay * normalCost);
        }
    }
}
