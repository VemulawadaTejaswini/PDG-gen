import java.util.Scanner;

class Main{
    public static void main(String args[]){
        int count = 0;
        String[] a = new String[2];
        int[] b = new int[2];
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i < 2;i++){
        a[i] = sc.next();
        }
        for(int i = 0;i<2;i++){
        b[i]=Integer.parseInt(a[i]);    
        }
        if(b[0]>b[1]){
            count += 10;
        }
        System.out.println(count);

    }
}