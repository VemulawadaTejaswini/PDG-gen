import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        long[] a = new long[n];
        for(int i=0; i<n; i++){
            a[i] = stdIn.nextLong();
        }

        Integer[] seed = new Integer[n];
        for(int i=0; i<n; i++){
            seed[i] = i;
        }
        Permutation<Integer> p = new Permutation(seed);

        long max = 0;
        do{
            Integer[] perm = p.getTarget();
            long temp = 0;
            for(int i=0; i<perm.length; i++){
                temp += (Math.abs(perm[i] - i) * a[i]);
            }
            if(temp > max){
                max = temp;
            }
        }while(p.next());

        System.out.println(max);
    }
}

class Permutation<T> extends Serializable {

    private int baseIndex;
    private int index;
    private T[] objs;
  
    private Permutation<T> subPermutation;
  
    public Permutation(T[] objs) {
      this(0, 0, objs.clone());
    }
  
    private Permutation(int baseIndex, int index, T[] objs) {
      if (objs == null || objs.length == 0) {
        throw new IllegalArgumentException();
      }
  
      this.baseIndex = baseIndex;
      this.index = index;
      this.objs = objs;
  
      if (this.index < this.objs.length - 1) {
        this.subPermutation =
          new Permutation<T>(this.baseIndex + 1, this.index + 1, this.objs);
      }
    }
  
    public T[] getTarget() {
      return this.objs;
    }
  
    public boolean next() {
      if (this.subPermutation == null) {
        return false;
      }
  
      boolean result = this.subPermutation.next();
      if (result == true) {
        return true;
      }
  
      this.swap(this.baseIndex, this.index);
  
      ++this.index;
      if (this.objs.length <= this.index) {
        this.index = this.baseIndex;
        return false;
      }
  
      this.swap(this.index, this.baseIndex);
      return true;
    }
  
    @Override
    public String toString() {
      // snip.
    }
  
    private void swap(int index1, int index2) {
      T tmp = this.objs[index1];
      this.objs[index1] = this.objs[index2];
      this.objs[index2] = tmp;
    }
  }