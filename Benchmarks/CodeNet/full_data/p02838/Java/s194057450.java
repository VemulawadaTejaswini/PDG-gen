import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        final BigInteger devider = BigInteger.valueOf((long) (Math.pow(10,9) + 7));

        Scanner sc = new Scanner(System.in);
        int numberCount = sc.nextInt();
        List<BigInteger>numList = new ArrayList<>();
        for(int i = 1;i <= numberCount ; i++){
            BigInteger number = BigInteger.valueOf(sc.nextLong());
            numList.add(number);

        }
        BigInteger result = BigInteger.ZERO;
        XorMap xorMap = new XorMap();
        for(int i = 1;i <= numberCount ; i++){
            BigInteger  a = numList.get(i - 1);
            List<BigInteger > bList = numList.subList(i,numList.size());
            for(BigInteger  b : bList){
                result = result.add(xorMap.xor(a,b));
            }
        }
        System.out.println(result.remainder(devider));



    }

    public static class XorMap{
        Map<SwappablePair,BigInteger> noteMap;
        public XorMap(){
            noteMap = new HashMap<>();
        }

        public BigInteger xor(BigInteger a,BigInteger b){
            SwappablePair pair = new SwappablePair(a,b);
            if(noteMap.containsKey(pair)){
                return noteMap.get(pair);
            }
            BigInteger xorResult = a.xor(b);
            noteMap.put(pair,xorResult);
            return xorResult;

        }
    }

    public static class SwappablePair{
        Object a;
        Object b;
        public SwappablePair(Object a,Object b){
            this.a = a;
            this.b = b;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            SwappablePair that = (SwappablePair) o;
            boolean result = Objects.equals(a, that.a) &&
                    Objects.equals(b, that.b);
            boolean swapResult = Objects.equals(a, that.b) &&
                    Objects.equals(b, that.a);
            return result || swapResult;

        }

        @Override
        public int hashCode() {
            return Objects.hash(a, b);
        }
    }
}
