import java.io.*;
import java.util.StringJoiner;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] line1 = br.readLine().split(" ");
    int n = Integer.parseInt(line1[0]);
    int m = Integer.parseInt(line1[1]);
    int k = Integer.parseInt(line1[2]);
    
    UnionFind unionFind = new UnionFind(n);
    String[] data;
    int[][] friendList = new int[m][2];
    int[][] blockList = new int[k][2];
    
    for(int i=0; i<m; i++){
      data = br.readLine().split(" ");
      unionFind.union(Integer.parseInt(data[0])-1, Integer.parseInt(data[1])-1);
      friendList[i][0] = Integer.parseInt(data[0])-1;
      friendList[i][1] = Integer.parseInt(data[1])-1;
    }
    
    for (int i=0; i<k; i++){
      data = br.readLine().split(" ");
      blockList[i][0] = Integer.parseInt(data[0])-1;
      blockList[i][1] = Integer.parseInt(data[1])-1;
    }
    
    int result;
    boolean candidateFriend = true;
    StringJoiner sj = new StringJoiner(" ");
    for (int i=0; i<n; i++){
      result = 0;
      for (int j=0; j<n; j++){
        candidateFriend = true;
        if(i != j && unionFind.find(i) == unionFind.find(j)){
          for (int l=0; l<k; l++) {
            if (((blockList[l][0] == i && blockList[l][1] == j) || (blockList[l][0] == j && blockList[l][1] == i))) {
              candidateFriend = false;
              break;
            }
          }
          for (int o=0; o<m; o++){
            if(((friendList[o][0] == i && friendList[o][1] == j) || (friendList[o][0] == j && friendList[o][1] == i))){
              candidateFriend = false;
              break;
            }
          }
          if (candidateFriend){
            result++;
          }
        }
      }
      sj.add(String.valueOf(result));
    }
    System.out.println(sj);
  }
}
class UnionFind {
  int[] tree;
  
  UnionFind(int size){
    tree = new int[size];
    for (int i=0; i<size; i++){
      tree[i] = i;
    }
  }
  
  public int find(int idx) {
    if(tree[idx]==idx) return idx;
    else return tree[idx] = find(tree[idx]);
  }
  
  public void union(int idx1,int idx2) {
    int root1 = find(idx1);
    int root2 = find(idx2);
    tree[root2] = root1;
  }
}
