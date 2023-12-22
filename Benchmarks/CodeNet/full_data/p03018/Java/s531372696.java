import java.util.*;

class Main{
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.next().split("");
        int result = 0;
        int check = 0;
        while(true){
            int tmp = where_ABC(str);
            if(tmp<0)break;
            str = change_ABC(str, tmp);
            result++;
        }
        System.out.println(result);
    }

    public static int where_ABC(String[] str) {
        int result = -1;
        for(int i=0;i<str.length-2;i++){
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