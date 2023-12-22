import java.util.*;
public class Main {
        static Scanner sc = new Scanner(System.in);
        static void myout(Object t){System.out.println(t);}//standard output
        static void myerr(Object t){System.err.println(t);}//standard error
        static String getStr(){return sc.next();}
        static int getInt(){return Integer.parseInt(getStr());}
        static long getLong(){return Long.parseLong(getStr());}
        static boolean hasNext(){return sc.hasNext();}
        static char[] mySplit(String str){return str.toCharArray();}
  		static ArrayList<HashSet> group = new ArrayList<HashSet>();
  		static void bfs(int index, Node[] list){
        	if(list[index].group != -1){
       			return;
  			}
    		group.add(new HashSet<Integer>());
  			ArrayDeque<Node> queue = new ArrayDeque<Node>();
          	queue.add(list[index]);
    		while(queue.size() > 0){
        		Node tmp = queue.pollFirst();
      			if(tmp.group != -1){
           			continue;
        		}
      			tmp.group = group.size() - 1;
              	HashSet<Integer> tmpSet = group.get(tmp.group);
              	tmpSet.add(tmp.index);
              	group.set(tmp.group,tmpSet);
        		for(int j = 0; j < tmp.friend.size(); j++){
          			queue.add(list[tmp.friend.get(j)]);
        		}
    		}
        }
        public static void main(String[] args){
          int N = getInt();
          int M = getInt();
          int K = getInt();
          int i;
          Node[] list = new Node[N];
          for(i = 0; i < N; i++){
            list[i] = new Node(i);
          }
          for(i = 0; i < M; i++){
            int mae = getInt() - 1;
            int ato = getInt() - 1;
            myerr(mae + " " + ato);
            list[mae].friend.add(ato);
            list[ato].friend.add(mae);
          }
          for(i = 0; i < N; i++){
            bfs(i,list);
          }
          int[] output = new int[N];
          for(i = 0; i < N; i++){
            HashSet<Integer> tmpSet = group.get(list[i].group);
            output[i] = tmpSet.size() - 1 - list[i].friend.size();
          }
          for(i = 0; i < K; i++){
            int ngMae = getInt() - 1;
            int ngAto = getInt() - 1;
            if(list[ngMae].group != list[ngAto].group){
              continue;
            }
            output[ngMae]--;
            output[ngAto]--;
          }
          for(i = 0; i < N; i++){
            myout(output[i]);
          }
        }
        //Method addition frame start
public static class Node{
  int index;
  ArrayList<Integer> friend = new ArrayList<Integer>();;
  int group = -1;
  public Node(int i){
    index = i;
  }
  int getFriendSize(){
    return friend.size();
  }
  int getGroup(){
    return group;
  }
}
        //Method addition frame end
}
