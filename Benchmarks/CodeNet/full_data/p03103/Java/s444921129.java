import java.util.*;

public class Main {
    public static void main(String[] args) {    
        Scanner sc=new Scanner(System.in);
      ArrayList<Oder<Integer>>po=new ArrayList<>(); 
      int n=sc.nextInt();
      int m=sc.nextInt();
      for(int i=0;i<n;i++)
      po.add(new Oder<Integer>(sc.nextInt(),sc.nextInt()));
      Collections.sort(po,new Comparator<Oder<Integer>>() {
			public int compare(Oder<Integer> a,Oder<Integer> b) {
				return a.cont.compareTo(b.cont);
			}
		});
		long ans=0;
		for(int i=0;i<m;i++){
		    if(po.get(0).weight==0){
		        po.remove(0);
		        ans+=po.get(0).cont;
		        po.get(0).weight--;
		    }
		    else {
		        ans+=po.get(0).cont;
		        po.get(0).weight--;
		    }
		}
      System.out.println(ans);
    }
}
class Oder<T>{
	public T cont;
	public int weight;
	public Oder(T t) {
		this.cont =t;
	}
	public Oder(T t,int w) {
		cont =t;
		weight=w;
	}
	public String toString() {
		return cont.toString()+":"+weight;
	}
}