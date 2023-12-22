import java.util.*;

class Main{
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.next().split("");
        long result = 0;
        int pos = 0;
        while(true){
            pos = where_ABC(str, pos);
            if(pos<0)break;
            int a_num = check_continuous_A(str, pos);
            int bc_num = check_continuous_BC(str, pos+1);
            result += bc_num*a_num;

            str[pos + 2*bc_num - a_num] = "C";
            for(int i=0;i<a_num;i++){
                str[pos + 2*bc_num - i] = "A";
            }

            pos += 2*bc_num;
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
        for(int i=start;i<str.length-2;i++){
            if(str[i].equals("A") && str[i+1].equals("B") && str[i+2].equals("C")){
                return i;
            }
        }
        return -1;
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