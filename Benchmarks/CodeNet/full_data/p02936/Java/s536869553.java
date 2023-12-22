import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        int[]depth=new int[n+1];
        long val[]=new long[n+1];
        boolean iscalc[]=new boolean[n+1];
        long calced[]=new long[n+1];
        Graph g=new Graph();
        for(int i=0;i<n;i++){
            g.add(i+1+"");
        }
        for(int i=0;i<n-1;i++){
            g.add(sc.next(),sc.next());
        }
        for(int i=0;i<q;i++){
            val[sc.nextInt()]+=sc.nextInt();
        }
        String[]oya=g.popopo(n);
        /*PriorityQueue<Po> que=new PriorityQueue<>(new Comparator<Po>(){
            public int compare(Po a,Po b){
                return a.y-b.y;
            }
        });*/
        ArrayList<Po>apo=new ArrayList<>();
        depth=g.depth(n);
        for(int i=1;i<n+1;i++){
            apo.add(new Po(i,depth[i]));
            //que.add(new Po(i,depth[i]));
        }
        Collections.sort(apo,new Comparator<Po>(){
            public int compare(Po a,Po b){
                return a.y-b.y;
            }
        });
        
        Queue<Po> que=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            que.add(apo.get(i));
        }
        
       /* while(que.size()!=0){
            System.out.println(que.poll());
        }*/
        long ans[]=new long[n+1];
        while(que.size()!=0){
            Po p=que.poll();
            long an=val[p.x];
            an+=calced[Integer.parseInt(oya[p.x])];
            iscalc[p.x]=true;
            calced[p.x]=an;
        }
        for(int i=1;i<=n;i++){
            System.out.print(calced[i]+" ");
        }
    }
}
class Po{
    int x, y;
    public Po(int a,int b){
        x=a;
        y=b;
    }
    public String toString(){
        return x+" "+y;
    }
}
class Graph {
	Map<String, ArrayList<String>> edge;
	Map<String, Integer> vertex;
	public Graph() {

		edge = new HashMap<String, ArrayList<String>>();

		vertex = new HashMap<String, Integer>();
	}

	public void add(String a) {
		if (!edge.containsKey(a)) {
			ArrayList<String> cont = new ArrayList<>();
			edge.put(a, cont);
			vertex.put(a, 1);
		}
	}

	public void add(String a, String b) {
		add(a);
		add(b);
		edge.get(a).add(b);
		vertex.put(a, vertex.get(a) + 1);
		edge.get(b).add(a);
		vertex.put(b, vertex.get(b) + 1);
		
	}

	public void print() {
		for (String key : edge.keySet()) {
			System.out.println(key + ":" + edge.get(key));
		}
	}
	public String[] popopo(int n){
	    String ans[]=new String[n+1];
	    Map<String, Boolean> check = new HashMap<String, Boolean>();
		Queue<String> queue = new ArrayDeque<>();
		check.put("1", false);
        ans[1]="0";
		queue.add("1");
		while (queue.size() != 0) {
			String quevalue=queue.poll();
			ArrayList<String> cont = new ArrayList<>(edge.get(quevalue));
			//System.out.println(cont);
			for (int i = 0; i < cont.size(); i++) {
				if (!check.containsKey(cont.get(i))) {
				    ans[Integer.parseInt(cont.get(i))]=quevalue;
					queue.add(cont.get(i));
					check.put(cont.get(i), false);
				}
			}
		}
		return ans;
	}
	public int[] depth(int n){
	    int ans[]=new int[n+1];
	    Map<String, Boolean> check = new HashMap<String, Boolean>();
		Queue<String> queue = new ArrayDeque<>();
		check.put("1", false);
        ans[1]=0;
		queue.add("1");
		queue.add("kirito");
		int index=1;
		while (queue.size() != 0) {
			String quevalue=queue.poll();
			if(quevalue.equals("kirito")){
			    if(queue.size()==0){
			        break;
			    }
			    else{
			        index++;
			       queue.add("kirito");
			    }
			}
			else{
			    ArrayList<String> cont = new ArrayList<>(edge.get(quevalue));
			    for (int i = 0; i < cont.size(); i++) {
				    if (!check.containsKey(cont.get(i))) {
				        ans[Integer.parseInt(cont.get(i))]=index;
					    queue.add(cont.get(i));
					    check.put(cont.get(i), false);
				    }
			    }
			    
			}
		}
		return ans;
	}
	

}
