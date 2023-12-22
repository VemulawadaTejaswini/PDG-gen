import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        int[] ar = new int[n];
        int max=0;
        int semiMax=0;
        for(int i=0;i<n;i++){
            ar[i]=scn.nextInt();
            if(max<ar[i]){
                max=ar[i];
                continue;
            }
            if(semiMax<ar[i]){
                semiMax=ar[i];
            }
        }
        for(int i=0;i<n;i++){
            if(max==ar[i]){
                System.out.println(semiMax);
            }else{
                System.out.println(max);
            }
        }
    }
}