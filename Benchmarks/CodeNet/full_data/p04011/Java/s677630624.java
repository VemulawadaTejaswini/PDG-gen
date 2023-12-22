import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int stay = Integer.parseInt(sc.next());
        int sale = Integer.parseInt(sc.next());
        int normalCost = Integer.parseInt(sc.next());
        int saleCost = Integer.parseInt(sc.next());
        if(stay > sale){
            System.out.println(stay * normalCost + ( sale - stay ) * saleCost);
        }else{
        System.out.println(stay * normalCost);
        }
    }
}
