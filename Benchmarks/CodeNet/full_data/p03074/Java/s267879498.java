import java.util.*;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.io.*;

class SegmentTree{
    int maxElmNum = 131072;//this must be power of 2
    Integer[] tree;
    //edit here to solve different problems
    Integer initial = 0;
    private Integer op(Integer e1, Integer e2){
        return e1+e2;
    }

    private static int parent(int i){
        return (i-1)/2;
    }
    private static int leftchild(int i){
        return 2*i+1;
    }
    private static int rightchild(int i){
        return 2*i+2;
    }
    //make the empty tree
    public SegmentTree(){
        tree = new Integer[maxElmNum*4];
        for(int i=0;i<tree.length;i++) tree[i]=initial;
    }
    //fix tree[i] and the ancestors
    private void reflesh(int i){
        tree[i] = op(tree[leftchild(i)], tree[rightchild(i)]);
        if(i>0) reflesh(parent(i));
    }
    //
    private void setTree(int i, Integer elm){
        tree[i] = elm;
        reflesh(parent(i));
    }
    //replace array[i] with elm and reflesh the tree
    public void set(int i, Integer elm){
        setTree(maxElmNum+i-1,elm);
    }
    //make new tree which contains the given array
    public void make(Integer[] elements){
        for(int i=0;i<elements.length;i++) tree[i+maxElmNum-1]=elements[i];
        for(int i=maxElmNum-2;i>=0;i--) tree[i]=op(tree[2*i+1],tree[2*i+2]);
    }
    private Integer get(int left, int right, int nodeNum, int nodeStart, int nodeEnd){
        if(nodeEnd<=left || right<=nodeStart) return initial;
        if(left<=nodeStart && nodeEnd<=right) return tree[nodeNum];

        Integer leftValue  = get(left,right,2*nodeNum+1,nodeStart,(nodeStart+nodeEnd)/2);
        Integer rightValue = get(left,right,2*nodeNum+2,(nodeStart+nodeEnd)/2,nodeEnd);
        return op(leftValue,rightValue);
    }
    //calculate the answer in [l,r)
    public Integer get(int left, int right){
        return get(left,right,0,0,maxElmNum);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        String S = sc.next();

        ArrayList<Integer> s = new ArrayList<>();

        {
            char cur = S.charAt(0);
            if(cur=='0') s.add(0);
            int cont = 0;
            for(int n=0; n<N; n++){
                if(S.charAt(n)==cur) cont++;
                else {
                    s.add(cont);
                    cont=1;
                    cur = S.charAt(n);
                }
            }
            s.add(cont);
            if(S.charAt(N-1)=='0') s.add(0);
        }


        SegmentTree sTree = new SegmentTree(); sTree.make(s.toArray(new Integer[s.size()]));



        int range = 2*K+1;
        int ans=sTree.get(0,range);
        for(int i=0; i<=s.size()-range; i+=2){
            ans = Math.max(ans, sTree.get(i,i+range));
        }

        System.out.println(ans);



    }
}
