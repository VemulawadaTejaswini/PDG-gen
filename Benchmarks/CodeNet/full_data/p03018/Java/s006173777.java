import java.util.*;

class Main{
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.next().split("");
        int result = 0;
        int pos = 0;
        while(true){
            int pos_ABC = where_ABC(str, pos);
            if(pos_ABC<0)break;
            int bc_num = check_continuous_BC(str, pos_ABC+3);
            result += bc_num;
            int a_num = check_continuous_A(str, pos_ABC-1);
            result += a_num;
            result++;

            str[pos_ABC + 2 + bc_num*2] = "A";

            // System.out.println(pos_ABC + " " + a_num + " " + bc_num);
            // System.out.println(str[11]);

            pos = pos_ABC + 2*(bc_num+1) + 1;
        }
        System.out.println(result);
    }

    public static int check_continuous_A(String[] str, int a) {
        int count =0;
        for(int i=a; i>=0; i--){
            if(str[i].equals("A")){
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }

    public static int check_continuous_BC(String[] str, int a) {
        int result=0;
        for(int i=a;i+1<str.length;i+=2){
            if(str[i].equals("B") && str[i+1].equals("C")){
                result++;
            }
            else{
                break;
            }
        }
        return result;
    }

    public static int where_ABC(String[] str, int start) {
        int result = -1;
        for(int i=start;i<str.length-2;i++){
            if(str[i].equals("A") && str[i+1].equals("B") && str[i+2].equals("C")){
                result = i;
                break;
            }
        }
        return result;
    }

    public static String[] change_ABC(String[] str, int i) {
        str[i] = "B";
        str[i+1] = "C";
        str[i+2] = "A";
        return str;
    }

    public static void dump(int[] a) {
        for(int i : a){
            System.out.print(i + " ");
        }
        System.out.println();
        return;
    }
}