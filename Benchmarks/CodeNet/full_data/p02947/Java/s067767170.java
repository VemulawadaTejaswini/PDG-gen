import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer in=new StringTokenizer("");
        int n=Integer.parseInt(br.readLine());
        ArrayList<String> array = new ArrayList<>();
        for(int i=0;i<n;i++){
            array.add(Arrays.toString(br.readLine().chars().mapToObj(it -> (char) it).sorted().toArray()));
        }
        array.sort(String::compareTo);
        int memo=1,ans=0;
        for(int i=1;i<array.size();++i){
            if(array.get(i).equals(array.get(i - 1)))memo++;
            else{
                ans+=memo*(memo-1)/2;
                memo=1;
            }
        }
        ans+=memo*(memo-1)/2;
        System.out.println(ans);
    }
}
class Pair<T extends Comparable<T>,U extends Comparable<U>> implements Comparable<Pair<T,U>>{
    public T first;
    public U second;
    public Pair(T first,U second){
        this.first=first;
        this.second=second;
    }
    @Override
    public int compareTo(Pair<T,U> ob){
        if(first.compareTo(ob.first)!=0)return first.compareTo(ob.first);
        else return second.compareTo(ob.second);
    }
}