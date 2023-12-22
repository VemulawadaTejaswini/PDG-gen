import java.util.*;
class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        System.out.println(ret(n));
        sc.close();
    }
    static int ret (String n){
        int ret = 7;
        switch (n) {
            case "MON":
                ret = 6;
                break;
            case "TUE":
                ret = 5;
                break;
            case "WED":
                ret = 4;
                break;
            case "THU":
                ret = 3;
                break;
            case "FRI":
                ret = 2;
                break;
            case "SAT":
                ret = 1;
                break;
            default:
                break;
        }
        return ret;
    }
}