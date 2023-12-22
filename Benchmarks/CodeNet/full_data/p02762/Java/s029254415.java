    ////////////////////////////////////////////////////
    //                                                //
    //  For her who keeps the fire kindling in me...  //
    //                                                //
    ////////////////////////////////////////////////////


    import java.io.BufferedReader;
    import java.io.BufferedWriter;
    import java.io.FileOutputStream;
    import java.io.IOException; 
    import java.io.InputStreamReader;
    import java.io.OutputStream;
    import java.io.OutputStreamWriter;
    import java.io.PrintWriter;
    // import java.util.Scanner;
    // import java.util.Arrays;
    // import java.util.ArrayList;
    // import java.util.Collections; 
    // import java.util.StringTokenizer;
    import java.util.*;
    import java.lang.Math;
    import java.awt.Point;                            
    
    import java.awt.geom.*;
    
    public class Main{
    
        // static class Pair{
        //     int x;
        //     int y;
        // }

        static class DisjointUnionSets { 
            int[] rank, parent, ele_count; 
            int n; 
          
            // Constructor 
            public DisjointUnionSets(int n) 
            { 
                rank = new int[n]; 
                parent = new int[n];
                ele_count = new int[n];
                this.n = n; 
                makeSet(); 
            } 
          
            // Creates n sets with single item in each 
            void makeSet() 
            { 
                for (int i = 0; i < n; i++) { 
                    // Initially, all elements are in 
                    // their own set. 
                    parent[i] = i; 
                    ele_count[i] = 1;
                } 
            } 
          
            // Returns representative of x's set 
            int find(int x) 
            { 
                // Finds the representative of the set 
                // that x is an element of 
                if (parent[x] != x) { 
                    // if x is not the parent of itself 
                    // Then x is not the representative of 
                    // his set,

                    parent[x] = find(parent[x]); 
                    
                    // so we recursively call Find on its parent 
                    // and move i's node directly under the 
                    // representative of this set 
                } 
          
                return parent[x]; 
            }



            int setSize(int x){
                int par = find(x);
                return ele_count[par];
            }
          


            // Unites the set that includes x and the set 
            // that includes x 
            void union(int x, int y) 
            { 
                // Find representatives of two sets 
                int xRoot = find(x), yRoot = find(y); 
          
                // Elements are in the same set, no need 
                // to unite anything. 
                if (xRoot == yRoot) 
                    return; 
          
                // If x's rank is less than y's rank 
                if (rank[xRoot] < rank[yRoot]){ 
          
                    // Then move x under y  so that depth 
                    // of tree remains less 
                    parent[xRoot] = yRoot;
                
                    ele_count[yRoot] = ele_count[yRoot] + ele_count[xRoot];
          
                // Else if y's rank is less than x's rank 
                }else if (rank[yRoot] < rank[xRoot]) {
          
                    // Then move y under x so that depth of 
                    // tree remains less 
                    parent[yRoot] = xRoot; 
                    ele_count[xRoot] = ele_count[yRoot] + ele_count[xRoot];
                
                } else // if ranks are the same 
                { 
                    // Then move y under x (doesn't matter 
                    // which one goes where) 
                    parent[yRoot] = xRoot; 
          
                    ele_count[xRoot] = ele_count[yRoot] + ele_count[xRoot];

                    // And increment the result tree's 
                    // rank by 1 
                    rank[xRoot] = rank[xRoot] + 1; 
                } 
            } 
        } 

        public static void main(String args[]){
            try{
                FastReader s = new FastReader();
                BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
                int i, j, k, x, y, t, n, m, count, key, size, Pairer, minglob, minloc, beg, end, begl, endr, ld, up, down, maxele, minele;
                long ans, sqrt, q, r, sum, maxup, maxdown, X, Y, Q, MOD;//, sum2;
                boolean flag, flag2;
    
                double avg;
    
                // t = s.nextInt();
    
                // for(; t>0; t--){
    
                    //n = s.nextInt();
                    //Y = s.nextLong();
    
                    n = s.nextInt();
                    m = s.nextInt();
                    k = s.nextInt();
    

                    DisjointUnionSets dsu = new DisjointUnionSets(n);

                    ArrayList<Integer> frnd_lst[] = new ArrayList[n];
                    ArrayList<Integer> block_lst[] = new ArrayList[n];


                    for(i=0; i<n; i++)
                        frnd_lst[i] = new ArrayList<Integer>();
                    
                    for(i=0; i<m; i++){
                        x = s.nextInt();
                        y = s.nextInt();

                        x--;    y--;
                        //if(frnd_lst[x].size() == 0)
                            frnd_lst[x].add(y);
                            frnd_lst[y].add(x);

                        dsu.union(x, y);
                        
                    }
    

                    for(i=0; i<n; i++)
                        block_lst[i] = new ArrayList<Integer>();
                    
                    for(i=0; i<k; i++){
                        x = s.nextInt();
                        y = s.nextInt();

                        x--;    y--;
                        //if(frnd_lst[x].size() == 0)
                            block_lst[x].add(y);
                            block_lst[y].add(x);
                        
                    }
    

                    ArrayList<Integer> fl, bl;
                    for(i=0; i<n; i++){
                        size = dsu.setSize(i);

                        size--;

                        fl = frnd_lst[i];
                        bl = block_lst[i];

                        for(j=0; j<fl.size(); j++)
                            if(dsu.find(i)  ==  dsu.find(fl.get(j)))
                                size--;

                        for(j=0; j<bl.size(); j++)
                            if(dsu.find(i)  ==  dsu.find(bl.get(j)))
                                size--;

                        if(i==0)
                            w.write(size+"");
                        else
                            w.write(" "+size);

                    }

                    



                    

    
    
                
                // }
                w.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
                    
                    
    //========================================### FAST IO ###=========================================//
    class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
    
        public FastReader() 
        { 
            br = new BufferedReader(new
                        InputStreamReader(System.in)); 
        } 
    
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
    
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
    
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
    
        Double nextDouble() 
        { 
            return Double.parseDouble(next());
        } 
    
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str;
        } 
    }
        //====================================================================================================//