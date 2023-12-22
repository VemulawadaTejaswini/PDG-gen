import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int H=sc.nextInt();
        int N=sc.nextInt();
      //  int [] moves=new int[N];
        int sum_of_moves=0;
        for(int i=0;i<N;i++)
           // moves[i]=sc.nextInt();
            sum_of_moves+=sc.nextInt();
        String output=(sum_of_moves>=H)?"Yes":"No";
        System.out.print(output);
    }
}