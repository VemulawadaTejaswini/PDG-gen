import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String[] wt={"Sunny", "Cloudy", "Rainy"};
        String s=in.nextLine();
        if(s.contains(wt[0])){
            System.out.println(wt[1]);
        }else if(s.contains(wt[1])){
            System.out.println(wt[2]);
        }else{
            System.out.println(wt[0]);
        }
    }
}