import java.io.FileInputStream;
import java.util.*;

public class Main {

    static int NN;
    static int MM;
    static String [] index;
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        long start = System.currentTimeMillis();
        NN= sc.nextInt();
        MM= sc.nextInt();
        index = new String[MM];

        List<Num> list = new ArrayList<>();
        List<Num> list1 = new ArrayList<>();
        for (int i = 0; i < MM; i++) {
            Num nu = new Main().new Num(sc.nextInt(),sc.nextInt());
            list.add(nu);
            list1.add(nu);
        }
        Collections.sort(list,new Main().new sortNum());
        List<List<Num>> kk = divider(list,new Main().new groupNum());
        System.out.println(kk);
        for (int i = 0; i < kk.size(); i++) {
            for (int j = 0; j < kk.get(i).size(); j++) {
                for (int k = 0; k <list1.size() ; k++) {
                    if (kk.get(i).get(j).equals(list1.get(k))){
                        StringBuilder str=new StringBuilder();
                        str = str.append(String.format("%06d", kk.get(i).get(j).N)).append(String.format("%06d",(j+1)));
                        index[k] = str.toString();
                    }

                }

            }
        }

        for (int i = 0; i < index.length; i++) {
            System.out.println(index[i]);
        }

    }
    class Num{
        public int N;
        public int M;

        public Num(int n, int m) {
            N = n;
            M = m;
        }

        @Override
        public String toString() {
            return "Num{" +
                    "N=" + N +
                    ", M=" + M +
                    '}';
        }
    }
    class sortNum implements Comparator<Num>{
        @Override
        public int compare(Num o1, Num o2) {
            return o1.M-o2.M;

        }
    }

    class groupNum implements Comparator<Num>{

        @Override
        public int compare(Num o1, Num o2) {
            return o1.N - o2.N;
        }
    }

    public static  <T> List<List<T>> divider(Collection<T> datas,Comparator<T> c) {
        List<List<T>> result = new ArrayList<List<T>>();
        for(T t:datas) {
            boolean bool = false;
            for(int j=0;j<result.size();j++) {
                if(c.compare(t, result.get(j).get(0))==0) {
                    bool = true;
                    result.get(j).add(t);
                    break;
                }
            }
            if (!bool) {
                List<T> li = new ArrayList<T>();
                result.add(li);
                li.add(t);
            }
        }
        return result;
    }

}
