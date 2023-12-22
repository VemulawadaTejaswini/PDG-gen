import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner s = new Scanner(System.in);
        Set<Integer> m = new HashSet<>();
        for(int i = s.nextInt(); i > 0; i--){
            int t = s.nextInt();
            if(!m.remove(t)) m.add(t);
        }
        System.out.println(m.size());
    }
}