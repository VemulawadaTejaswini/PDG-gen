import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int q = sc.nextInt();

        long[] aArr = new long[a];
        long[] bArr = new long[b];
        long[] qArr = new long[q];

        for(int i = 0; i < a;i++){
           aArr[i] = sc.nextLong();
        }
        for(int i = 0; i < b;i++){
            bArr[i] = sc.nextLong();
        }
        for(int i = 0; i < q;i++){
            qArr[i] = sc.nextLong();
        }

        List<Building> list = new ArrayList<>();
        for(int i = 0;i < a;i++){
            long dis = Long.MAX_VALUE;
            for(int j = 0;j < b;j++){
                if(dis - Math.abs(aArr[i] - bArr[j]) > 0){
                    dis = Math.abs(aArr[i] - bArr[j]);
                } else {
                    break;
                }
            }
            list.add(new Building(aArr[i], dis));
        }
        for(int i = 0;i < b;i++){
            long dis = Long.MAX_VALUE;
            for(int j = 0;j < a;j++){
                if(dis - Math.abs(bArr[i] - aArr[j]) > 0){
                    dis = Math.abs(bArr[i] - aArr[j]);
                } else {
                    break;
                }
            }
            list.add(new Building(bArr[i], dis));
        }

        Collections.sort(list);

        for(int i = 0;i < q;i++){
            long ans = Long.MAX_VALUE;
            for(int j = 0;j < a+b;j++){
                if(ans < (Math.abs(qArr[i] - list.get(j).getD())+list.get(j).getN())){
                    break;
                } else {
                    ans = Math.abs(qArr[i] - list.get(j).getD())+list.get(j).getN();
                }
            }
            System.out.println(ans);
        }
    }

    public static class Building implements Comparable{
        long d;
        long n;

        public Building(long d, long n){
            this.d = d;
            this.n = n;
        }

        public long getD() {
            return d;
        }

        public long getN() {
            return n;
        }

        @Override
        public int compareTo(Object o) {
            Building b = (Building)o;
            if(b.getD() == this.d){
                return 0;
            } else if(b.getD() > this.d){
                return -1;
            }
            return 1;
        }
    }

}