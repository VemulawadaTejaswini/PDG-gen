import java.util.*;
public class Main {
        static Scanner sc = new Scanner(System.in);
        static void myout(Object t){System.out.println(t);}
        static String getStr(){return sc.next();}
        static int getInt(){return sc.nextInt();}
        static Long getLong(){return sc.nextLong();}
        static boolean isNext(){return sc.hasNext();}
        static treeNode[] tree;
  		public static void main(String[] args){
          int N = getInt();
          int Q = getInt();
          tree = new treeNode[N];
          for(int i = 0; i < N; i++){
           	 tree[i] = new treeNode();
          }
          for(int i = 0; i < N-1; i++){
            tree[getInt()-1].addNode(getInt()-1);
          }
          for(int i = 0; i < Q; i++){
           	 tree[getInt()-1].addCount(getInt());
          }
          
          String[] output = new String[N];
          for(int i = 0; i < N; i++){
            //myout(tree[i].nodes + " " + tree[i].counter);
          }
          //myout("");
          dfs(0,0);
          for(int i = 0; i < N; i++){
            //myout(tree[i].nodes + " " + tree[i].counter);
            output[i] = String.valueOf(tree[i].counter);
          }
          myout(String.join(" ",output));
          
        }
        //便利メソッド追加枠ここから
  		static void dfs(int index,int add){
          tree[index].addCount(add);
          ArrayList<Integer> childNodes = tree[index].nodes;
          for(int i = 0; i < childNodes.size(); i++){
            dfs(childNodes.get(i), tree[index].counter);
          }
        }
		public static class treeNode{
          ArrayList<Integer> nodes = new ArrayList<Integer>();
          int counter = 0;
          treeNode(){
           	
          }
          void addNode(int node){
            nodes.add(node);
          }
          void addCount(int count){
            counter += count;
          }
        }
        //便利メソッド追加枠ここまで
}
