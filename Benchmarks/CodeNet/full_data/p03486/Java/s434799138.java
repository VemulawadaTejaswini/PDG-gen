import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next(),
        t = sc.next();
        sc.close();
        char[] schar = s.toCharArray(),
        tchar = t.toCharArray();
        Arrays.sort(schar);
        Arrays.sort(tchar);
        String sLast = String.valueOf(schar[schar.length-1]),
        tFirst = String.valueOf(tchar[tchar.length-1]);
        switch(sLast.compareTo(tFirst)){
            case 1:
            System.out.println("No");
            break;
            case -1:
            System.out.println("Yes");
            break;
            case 0:
            if(schar.length>=tchar.length){
                if(schar[0] == schar[schar.length-1] && tchar[0] == tchar[tchar.length-1]){
                    System.out.println("No");
                }
                else{
                    System.out.println("Yes");
                }
            }
            else {
                System.out.println("Yes");
            }
        }
    }
}