import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n = scn.nextInt();
        int k =scn.nextInt();
        int[] x=new int[n];
        int total=0;
        for(int i=0;i<n;i++){
            x[i]=scn.nextInt();
            if(x[i]>k-x[i]){
                total+=k-x[i];
            }else{
                total+=x[i];
            }
        }

        System.out.println(total*2);
    }
}
