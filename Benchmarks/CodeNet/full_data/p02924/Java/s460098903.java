import java.io.*;
import java.util.*;
import java.lang.*;

class ArrayLib{
    static<E extends Comparable<E>> E getOrDefault(E[] array, int index, E defaultValue){
        if(index<0 || index>=array.length) return defaultValue;
        return array[index];
    }

    static<E extends Comparable<E>> int maxIndexOfArray(E[] a){
        int ans = 0;
        for(int i=1;i<a.length;i++){
            if(a[i].compareTo(a[ans])>0) ans=i;
        }
        return ans;
    }
    static<E extends Comparable<E>> int minIndexOfArray(E[] a){
        int ans = 0;
        for(int i=1;i<a.length;i++){
            if(a[i].compareTo(a[ans])<0) ans=i;
        }
        return ans;
    }

    // minimum x st. array[x] >= elm
    static<E extends Comparable<E>> int lowerBound(E[] array, E elm){
        if(array[0].compareTo(elm)>=0) return 0;
        int min = 0, max = array.length;
        // array[min] < elm
        // array[max] >= elm
        while(min+1<max){
            int mid = (min+max)/2;
            if(array[mid].compareTo(elm) < 0) min = mid;
            else max = mid;
        }
        return max;
    }
    // minimum x st. array[x] > elm
    static<E extends Comparable<E>> int upperBound(E[] array, E elm){
        if(array[0].compareTo(elm)>0) return 0;
        int min = 0, max = array.length;
        // array[min] <= elm
        // array[max] > elm
        while(min+1<max){
            int mid = (min+max)/2;
            if(array[mid].compareTo(elm) <= 0) min = mid;
            else max = mid;
        }
        return max;
    }

    static boolean nextPermutation(List<Integer> list){
        int pivotPos = -1;
        int pivot = 0;
        for (int i=list.size()-2; i>=0; i--) {
            if (list.get(i) < list.get(i+1)) {
                pivotPos = i;
                pivot = list.get(i);
                break;
            }
        }

        if (pivotPos==-1 && pivot==0) return false;

        int L = pivotPos+1, R = list.size()-1;
        int minPos = -1;
        int min = Integer.MAX_VALUE;
        for (int i=R; i>=L; i--) {
            if (pivot < list.get(i)) {
                if (list.get(i) < min) {
                    min = list.get(i);
                    minPos = i;
                }
            }
        }

        Collections.swap(list, pivotPos, minPos);
        Collections.sort(list.subList(L, R+1));

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<list.size(); i++) sb.append(list.get(i));

        return true;
    }
}


class Output extends PrintWriter {

    public Output(PrintStream io) {
        super(io);
    }

    public void printArray(int[] array, String space, String end) {
        int N = array.length;
        for(int n=0; n<N-1; n++){
            super.print(array[n]);
            super.print(space);
        }
        super.print(array[N-1]);
        super.print(end);
        super.flush();
    }
    public void printArray(int[] array){
        this.printArray(array, " ", "\n");
    }
    public void printArray(long[] array, String space, String end) {
        int N = array.length;
        for(int n=0; n<N-1; n++){
            super.print(array[n]);
            super.print(space);
        }
        super.print(array[N-1]);
        super.print(end);
        super.flush();
    }
    public void printArray(long[] array){
        this.printArray(array, " ", "\n");
    }
    public void printArray(double[] array, String space, String end) {
        int N = array.length;
        for(int n=0; n<N-1; n++){
            super.print(array[n]);
            super.print(space);
        }
        super.print(array[N-1]);
        super.print(end);
        super.flush();
    }
    public void printArray(double[] array){
        this.printArray(array, " ", "\n");
    }
    public void printArray(char[] array, String space, String end) {
        int N = array.length;
        for(int n=0; n<N-1; n++){
            super.print(array[n]);
            super.print(space);
        }
        super.print(array[N-1]);
        super.print(end);
        super.flush();
    }
    public void printArray(char[] array){
        this.printArray(array, " ", "\n");
    }
    public void printArray(Object[] array, String space, String end) {
        int N = array.length;
        for(int n=0; n<N-1; n++){
            super.print(array[n]);
            super.print(space);
        }
        super.print(array[N-1]);
        super.print(end);
        super.flush();
    }
    public void printArray(Object[] array){
        this.printArray(array, " ", "\n");
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Output out = new Output(System.out);

        int N = sc.nextInt();
        out.println(N * (N-1) / 2);


        out.flush();
    }
}
