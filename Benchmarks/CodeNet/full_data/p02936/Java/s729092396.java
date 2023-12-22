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
        static String toKaigyo(String[] list){return String.join("\n",list);}
        static String toHanSp(String[] list){return String.join(" ",list);}
        static treeNode[] tree;
  		public static void main(String[] args){
          int N = getInt();
          int Q = getInt();
          tree = new treeNode[N];
          for(int i = 0; i < N; i++){
           	 tree[i] = new treeNode();
          }
          for(int i = 0; i < N-1; i++){
            int mae = getInt() - 1;
            int ato = getInt() - 1;
            tree[mae].addNode(ato);
            tree[ato].addNode(mae);
          }
          for(int i = 0; i < Q; i++){
           	 tree[getInt()-1].setCount(getInt());
          }
          
          String[] output = new String[N];
          bfs();
          //myout("");
          
          for(int i = 0; i < N; i++){
            //myout(tree[i].nodes + " " + tree[i].counter);
            output[i] = String.valueOf(tree[i].sum);
          }
          myout(String.join(" ",output));
          
        }
        //便利メソッド追加枠ここから
  		static void bfs(){
          ArrayDeque<Integer[]> queue = new ArrayDeque<Integer[]>(1000);
          Integer[] first = new Integer[2];
          first[0] = 0;
          first[1] = tree[0].counter;
          queue.addFirst(first);
          tree[0].access = true;
          while(queue.size() > 0){
            Integer[] tmp = queue.pollFirst();
            tree[tmp[0]].addCount(tmp[1]);
            ArrayList<Integer> children = tree[tmp[0]].nodes;
            for(int i = 0; i < children.size(); i++){
              if(!tree[children.get(i)].access){
                tree[children.get(i)].access = true;
                Integer[] addQueue = new Integer[2];
                addQueue[0] = children.get(i);
                addQueue[1] = tmp[1] + tree[children.get(i)].counter;
                queue.addLast(addQueue);
              }
            }
          }
        }
		public static class treeNode{
          ArrayList<Integer> nodes = new ArrayList<Integer>();
          int counter = 0;
          int sum = 0;
          boolean access = false;
          treeNode(){}
          void addNode(int node){
            nodes.add(node);
          }
          void addCount(int count){
            sum += count;
          }
          void setCount(int count){
            this.counter += count;
          }
        }
        //便利メソッド追加枠ここまで
}
