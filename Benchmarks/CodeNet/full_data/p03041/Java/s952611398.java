import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int strLen = sc.nextInt();
        int index = sc.nextInt();

        String str = sc.next();
        String small;
        switch(str.charAt(index-1)){
            case 'A':
            small = "a";
            break;
            case 'B':
            small = "b";
            break;
            case 'C':
            small = "c";
            break;
            default:
            small = "error";

        }

        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, index-1));
        sb.append(small);
        sb.append(str.substring(index));

        System.out.println(sb.toString());
    }
}