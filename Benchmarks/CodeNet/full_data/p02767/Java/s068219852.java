
import java.util.*;


class Main {
    public static void main2(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();


        int l= Integer.toString(n,k).length();

        System.out.println(l);


    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<Integer>x=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            x.add(s.nextInt());
        }
        List<Integer>buf=new ArrayList<>();
        buf.add(Integer.MAX_VALUE);
        for (int i = 1; i <101 ; i++) {
            buf.add(0);
        }

        for (int j = 1; j <=100 ; j++) {
            for (int i = 0; i <n ; i++) {
                int a=buf.get(j)+(int)Math.pow(x.get(i)-j,2);
                buf.set(j,a);
            }
        }

        Collections.sort(buf);
        System.out.println(buf.get(0));




    }
}