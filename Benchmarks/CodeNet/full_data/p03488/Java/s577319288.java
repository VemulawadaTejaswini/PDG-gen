import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int x = sc.nextInt(), y = sc.nextInt();
        List<Integer> xlist = new ArrayList<>();
        List<Integer> ylist = new ArrayList<>();
        if(s[0] == 'T') xlist.add(0);
        boolean xdir = true;
        int cnt = 0;
        for (int i = 0; i < s.length; i++) {
            if(s[i] == 'F'){
                cnt++;
            }else{
                if(xdir) xlist.add(cnt);
                else ylist.add(cnt);
                xdir = !xdir;
                cnt = 0;
            }
        }
        if(0 < cnt){
            if(xdir) xlist.add(cnt);
            else ylist.add(cnt);
        }
        Set<Integer> xset = new HashSet<>();
        xset.add(0);
        xset.add(xlist.get(0));
        xlist.remove(0);
        for(int nx : xlist){
            Set<Integer> tset = new HashSet<>();
            for(int cx: xset){
                tset.add(cx + nx);
                tset.add(cx - nx);
            }
            xset.addAll(tset);
        }
        Set<Integer> yset = new HashSet<>();
        yset.add(0);
        for(int ny : ylist){
            Set<Integer> tset = new HashSet<>();
            for(int cy : yset){
                tset.add(cy + ny);
                tset.add(cy - ny);
            }
            yset.addAll(tset);
        }
        System.out.println(xset.contains(x) && yset.contains(y) ? "Yes" : "No");
        sc.close();

    }

}
