
import java.util.*;


class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        HashMap<String ,Integer> m=new HashMap<>();
        int max=-1;
        for (int i = 0; i <n ; i++) {
            String key=s.next();
            int now=m.getOrDefault(key,0)+1;
            if(max<now){
                max=now;
            }
            m.put(key,now);
        }
        Set<String > set=new TreeSet();
        for(Map.Entry<String,Integer> p: m.entrySet()){
            if(p.getValue()==max){
                set.add(p.getKey());
            }
        }
        for (String jj:set){
            System.out.println(jj);
        }

    }
    public static void main2(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a=new int[n];
        for (int i = 0; i <n ; i++) {
            a[i]=s.nextInt();
        }
        String ret="APPROVED";
        for (int i = 0; i < n; i++) {
            if(a[i]%2==0&&(a[i]%3!=0&&a[i]%5!=0)){
                ret="DENIED";
                break;
            }

        }

        System.out.println(ret);

    }
}