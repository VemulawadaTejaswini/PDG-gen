import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.split("");
        Arrays.sort(s1);
        String t = sc.nextLine();
        String[] t0 = t.split("");
        List<String> list = Arrays.asList(t0);
        Collections.reverse(list);
        String[] t1 = (String[])list.toArray(new String[t0.length]);

        int min = Math.min(s.length(),t.length());
        int flag = 0;
        int flag2 = 0;
        for(int i = 0;i<min;i++){
            if(s1[i].compareTo(t1[i]) < 0){
                flag++;
                break;
            }
            if(s1[i].compareTo(t1[i]) == 0){
                flag2++;
            }
        }
        if(flag > 0){
            System.out.println("Yes");
        }else if(flag2 == s.length() && s.length() < t.length()){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}