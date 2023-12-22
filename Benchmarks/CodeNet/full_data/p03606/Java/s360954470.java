import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n = scn.nextInt();
        int total=0;
        for(int i=0;i<n;i++){
            int l=scn.nextInt();
            int r=scn.nextInt();
            total+=r-l+1;
        }
        System.out.println(total);
    }
}