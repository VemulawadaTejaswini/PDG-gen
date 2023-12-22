import java.util.Scanner;

class Rp1ABC097A{
    public static void main(String args[]){
        int a_point , b_point , c_point , dis , a_b , b_c , c_a;
        Scanner sc = new Scanner(System.in);

        a_point = sc.nextInt();
        b_point = sc.nextInt();
        c_point = sc.nextInt();
        dis = sc.nextInt();

        a_b = a_point - b_point;
        b_c = b_point - c_point;
        c_a = c_point - a_point;

        if(Math.abs(c_a) <= dis || (Math.abs(a_b) <= dis && Math.abs(b_c) <= dis)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}