import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[3];

        for(int i=0; i<3; i++){
            a[i] = sc.nextInt();
        }

        String yon = "NO";

        if(a[0] == 5){
            if(a[1] == 5){
                if(a[2] == 7){
                    yon = "YES";
                }
            }else if(a[1] == 7){
                if(a[3] == 5){
                    yon = "NO";
                }
            }
        }else if(a[0] == 7){
            if(a[1] == 5){
                if(a[2] == 5){
                    yon = "YES";
                }
            }
        }

        System.out.println(yon);
    }
}
