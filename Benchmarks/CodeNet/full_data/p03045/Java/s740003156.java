import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] line1 = br.readLine().split(" ");
    int numOfCards = Integer.parseInt(line1[0]);
    int numOfHints = Integer.parseInt(line1[1]);
    
    UnionFind tree = new UnionFind(numOfCards);
    
    int x;
    int y;
    
    for(int i=0; i<numOfHints; i++){
      String[] hint = br.readLine().split(" ");
      x = Integer.parseInt(hint[0])-1;
      y = Integer.parseInt(hint[1])-1;
      
      if(!tree.whetherSameRoot(x, y)){
        tree.uniteNode(x, y);
      }
    }
    System.out.println(tree.getNumOfRoot());
  }
}

class UnionFind{
  int[] par;
  UnionFind(int numNode){
    par = new int[numNode];
    for(int i=0; i<numNode; i++){
      par[i] = i;
    }
  }
  
  int getRoot(int nodeIndex){
    if(par[nodeIndex] == nodeIndex){
      return nodeIndex;
    }else{
      return par[nodeIndex] = getRoot(par[nodeIndex]);
    }
  }
  
  void uniteNode(int nodeA, int nodeB){
    if(!whetherSameRoot(nodeA, nodeB)){
      par[getRoot(nodeA)] = getRoot(nodeB);
    }
  }
  
  boolean whetherSameRoot(int nodeA, int nodeB){
    return getRoot(nodeA) == getRoot(nodeB);
  }
  
  int getNumOfRoot(){
    int result = 0;
    for(int i=0; i<par.length; i++){
      if(par[i] == i){
        result++;
      }
    }
    return result;
  }
}