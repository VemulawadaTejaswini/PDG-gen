
/*
9 2
        1 1 1 1 1 0 0 0 0
        1 2
        1 5
        5 6
        5 7
        2 3
        2 4
        3 8
        3 9
*/


import java.io.*;
import java.util.*;

class Main {
    static int[][] arr;
    static int[][] dp;
    static int n;

    public static void main (String[] args) throws IOException {
        Reader.init(System.in);
        String s = Reader.next();
        String t = Reader.next();
        int max = Math.max(s.length() , t.length());
        int dp[][] = new int[s.length()+1][t.length()+1];
        String ss = "";
        for (int i =  0 ;  i < s.length()+1 ; i++){
            for (int j = 0 ; j < t.length() + 1 ; j++){
                if (i==0 || j==0){
                    dp[i][j] = 0;
                }
                else if (s.charAt(i-1) == t.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                    ss+=s.charAt(i-1);
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        //System.out.println(Arrays.deepToString(dp));
        int i = s.length() ;;
        int j = t.length();
        String ans = "";
        while (i> 0 && j > 0){
            if (s.charAt(i-1)==t.charAt(j-1)){
                ans = s.charAt(i-1) + ans;
                i--;
                j--;
            }
            else if (dp[i-1][j]>dp[i][j-1]){
                i--;
            }
            else{
                j--;
            }
        }
        System.out.println(ans);

    }
}



class Reader {
    static BufferedReader reader;
    static StringTokenizer tokenizer;

    /** call this method to initialize reader for InputStream */
    static void init(InputStream input) {
        reader = new BufferedReader(
                new InputStreamReader(input) );
        tokenizer = new StringTokenizer("");
    }

    /** get next word */
    static String next() throws IOException {
        while ( ! tokenizer.hasMoreTokens() ) {
            //TODO add check for eof if necessary
            tokenizer = new StringTokenizer(
                    reader.readLine() );
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt( next() );
    }
    static long nextLong() throws IOException {
        return Long.parseLong( next() );
    }

    static double nextDouble() throws IOException {
        return Double.parseDouble( next() );
    }
}

/*class MergeSort
{
    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        *//* Create temp arrays *//*
        int L[] = new int [n1];
        int R[] = new int [n2];

        *//*Copy data to temp arrays*//*
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];


        *//* Merge the temp arrays *//*

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        *//* Copy remaining elements of L[] if any *//*
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        *//* Copy remaining elements of R[] if any *//*
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    void sort(int arr[], int l, int r)
    {
        if (l < r)
        {
            // Find the middle point
            int m = (l+r)/2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr , m+1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    *//* A utility function to print array of size n *//*
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver method
}

class Node{
    int data;
    int freq;

    public Node(int data, int freq) {
        this.data = data;
        this.freq = freq;
    }

}
class GFG {

    // limit for array size
    static int N = 1000000;

    static int n; // array size

    // Max size of tree
    static int []tree = new int[2 * N];

    // function to build the tree
    static void build( char []arr,int n)
    {

        // insert leaf nodes in tree
        for (int i = 0; i < n-1; i++) {
            if (arr[i]!=arr[i+1]) {
                System.out.println(i);
                tree[n + i] = 1;
            }
        }

        // build the tree by calculating
        // parents
        for (int i = n - 1; i > 0; --i)
            tree[i] = tree[i << 1] +
                    tree[i << 1 | 1];
    }

    static int query(int l, int r)
    {
        int res = 0;

        // loop to find the sum in the range
        for (l += n, r += n; l < r;
             l >>= 1, r >>= 1)
        {
            if ((l & 1) > 0)
                res += tree[l++];

            if ((r & 1) > 0)
                res += tree[--r];
        }

        return res;
    }

    // driver program to test the
    // above function

}

class SegmentTree{
    int[] arr ;
    int[] tree;

    SegmentTree(int[] arr ,int  n){
        this.arr = arr;
        tree = new int[2*n];
    }

    void updateRangeUtil(int si, int ss, int se, int us,
                         int ue, int val)
    {

        if (ss>se || ss>ue || se<us)
            return ;


        if (ss==se)
        {
            tree[si] |= val;
            return;
        }

        int mid = (ss+se)/2;
        updateRangeUtil(si*2+1, ss, mid, us, ue, val);
        updateRangeUtil(si*2+2, mid+1, se, us, ue, val);

        tree[si] = tree[si*2+1] + tree[si*2+2];
    }

    void constructSTUtil(int ss, int se, int si)
    {
        // out of range as ss can never be greater than se
        if (ss > se)
            return ;

        // If there is one element in array, store it in
        // current node of segment tree and return
        if (ss == se)
        {
            //tree[si] = arr[ss];
            System.out.println(tree[si]);
            return;
        }

        // If there are more than one elements, then recur
        // for left and right subtrees and store the sum
        // of values in this node
        int mid = (ss + se)/2;
        constructSTUtil(ss, mid, si*2+1);
        constructSTUtil(mid+1, se, si*2+2);

        //tree[si] = tree[si*2 + 1] + tree[si*2 + 2];
    }

}

class Heap{
    int[] Heap;
    int size;
    int maxSize;

    public Heap(int maxSize){
        this.maxSize = maxSize;
        this.size = 0;
        Heap = new int[maxSize + 1];
        Heap[0] = Integer.MIN_VALUE;

    }

    int parent(int pos){
        return pos/2;
    }
    int left(int pos){
        return 2*pos;
    }
    int right(int pos){
        return 2*pos + 1;
    }

    boolean isLeaf(int pos){
        if (pos>=size/2 && pos<=size){
            return true;
        }
        return false;
    }

    void swap(int i , int j){
        int temp = Heap[i];
        Heap[i] = Heap[j];
        Heap[j]= temp;
    }

    void minHeapify(int pos){
        if (!isLeaf(pos)){
            if (Heap[pos]>Heap[left(pos)] || Heap[pos] > Heap[right(pos)]){
                if (Heap[left(pos)] < Heap[right(pos)]) {
                    swap(pos, left(pos));
                    minHeapify(left(pos));
                }

                // Swap with the right child and heapify
                // the right child
                else {
                    swap(pos, right(pos));
                    minHeapify(right(pos));
                }
            }
        }
    }

}

class Graph{



}
class DijkstraNode implements  Comparator<DijkstraNode>{
    public int node;
    public int cost;
    public int[] visited;
    public boolean[] settled;

    public DijkstraNode(int node, int cost,int vertices) {
        this.node = node;
        this.cost = cost;
        visited = new int[vertices];
        settled = new boolean[vertices];
    }

    @Override
    public int compare(DijkstraNode node1 , DijkstraNode node2){
        if (node1.cost < node2.cost){
            return -1;
        }
        if (node1.cost > node2.cost){
            return 1;
        }
        return 0;
    }


    ArrayList<Integer> list = new ArrayList<>(10000);


}*/
/*
public class DPQ {
    private int dist[];
    private Set<Integer> settled;
    private PriorityQueue<Node> pq;
    private int V; // Number of vertices
    List<List<Node> > adj;

    public DPQ(int V)
    {
        this.V = V;
        dist = new int[V];
        settled = new HashSet<Integer>();
        pq = new PriorityQueue<Node>(V, new Node());
    }

    // Function for Dijkstra's Algorithm
    public void dijkstra(List<List<Node> > adj, int src)
    {
        this.adj = adj;

        for (int i = 0; i < V; i++)
            dist[i] = Integer.MAX_VALUE;

        // Add source node to the priority queue
        pq.add(new Node(src, 0));

        // Distance to the source is 0
        dist[src] = 0;
        while (settled.size() != V) {

            // remove the minimum distance node
            // from the priority queue
            int u = pq.remove().node;

            // adding the node whose distance is
            // finalized
            settled.add(u);

            e_Neighbours(u);
        }
    }

    // Function to process all the neighbours
    // of the passed node
    private void e_Neighbours(int u)
    {
        int edgeDistance = -1;
        int newDistance = -1;

        // All the neighbors of v
        for (int i = 0; i < adj.get(u).size(); i++) {
            Node v = adj.get(u).get(i);

            // If current node hasn't already been processed
            if (!settled.contains(v.node)) {
                edgeDistance = v.cost;
                newDistance = dist[u] + edgeDistance;

                // If new distance is cheaper in cost
                if (newDistance < dist[v.node])
                    dist[v.node] = newDistance;

                // Add the current node to the queue
                pq.add(new Node(v.node, dist[v.node]));
            }
        }
    }

    // Driver code
    public static void main(String arg[])
    {
        int V = 5;
        int source = 0;

        // Adjacency list representation of the
        // connected edges
        List<List<Node> > adj = new ArrayList<List<Node> >();

        // Initialize list for every node
        for (int i = 0; i < V; i++) {
            List<Node> item = new ArrayList<Node>();
            adj.add(item);
        }

        // Inputs for the DPQ graph
        adj.get(0).add(new Node(1, 9));
        adj.get(0).add(new Node(2, 6));
        adj.get(0).add(new Node(3, 5));
        adj.get(0).add(new Node(4, 3));

        adj.get(2).add(new Node(1, 2));
        adj.get(2).add(new Node(3, 4));

        // Calculate the single source shortest path
        DPQ dpq = new DPQ(V);
        dpq.dijkstra(adj, source);

        // Print the shortest path to all the nodes
        // from the source node
        System.out.println("The shorted path from node :");
        for (int i = 0; i < dpq.dist.length; i++)
            System.out.println(source + " to " + i + " is "
                    + dpq.dist[i]);
    }
}
*/

// Class to represent a node in the graph

/*class BinarySearchTree {

*//* Class containing left and right child of current node and key value*//*
class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

    // Root of BST
    Node root;

    // Constructor
    BinarySearchTree() {
        root = null;
    }

    // This method mainly calls insertRec()
    void insert(int key) {
        root = insertRec(root, key);
    }

    *//* A recursive function to insert a new key in BST *//*
    Node insertRec(Node root, int key) {

        *//* If the tree is empty, return a new node *//*
        if (root == null) {
            root = new Node(key);
            return root;
        }

        *//* Otherwise, recur down the tree *//*
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        *//* return the (unchanged) node pointer *//*
        return root;
    }

    // This method mainly calls InorderRec()
    void inorder()  {
        inorderRec(root);
    }

    // A utility function to do inorder traversal of BST
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }

    // Driver Program to test above functions
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        *//* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 *//*
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // print inorder traversal of the BST
        tree.inorder();
    }
} */


        /*int maxPathSumUtil(Node node, Res res) {

        // Base cases
        if (node == null)
        return 0;
        if (node.left == null && node.right == null)
        return node.data;

        // Find maximum sum in left and right subtree. Also
        // find maximum root to leaf sums in left and right
        // subtrees and store them in ls and rs
        int ls = maxPathSumUtil(node.left, res);
        int rs = maxPathSumUtil(node.right, res);

        // If both left and right children exist
        if (node.left != null && node.right != null) {

        // Update result if needed
        res.val = Math.max(res.val, ls + rs + node.data);

        // Return maxium possible value for root being
        // on one side
        return Math.max(ls, rs) + node.data;
        }

        // If any of the two children is empty, return
        // root sum for root being on one side
        return (node.left == null) ? rs + node.data
        : ls + node.data;
        } */



