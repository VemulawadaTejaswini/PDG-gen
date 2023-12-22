import java.io.*;
import java.util.*;
class Pair{
    int cost, time;
    Pair(int cost, int time){
        this.cost = cost;
        this.time = time;
    }
}
class Program implements Comparator<Pair>{
    public int compare(Pair a, Pair b){
        if(a.time!=b.time) return a.time-b.time;
        else return a.cost-b.cost;
    }    
}
class Main{
    public static void main(String[] args) {
        //Program obj = new Program();
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); int T = in.nextInt();
        ArrayList<Pair> arr = new ArrayList<>();
        while(N-->0){
            arr.add(new Pair(in.nextInt(),in.nextInt()));
        }
        in.close();
        Collections.sort(arr, new Program());
        if (arr.get(0).time<=T) System.out.println(arr.get(0).cost);
    }
}