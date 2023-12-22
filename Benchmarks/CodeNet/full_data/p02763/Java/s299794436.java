//package AtCoder.ABC157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static StringBuilder pval;

    static int[] p2 = new int[28];

    private static class SegTreeNode {
        int val;
        SegTreeNode left;
        SegTreeNode right;
        int ll;
        int ul;

        SegTreeNode(int ll, int ul) {
            this.val = p2[pval.charAt(ll)-'a'];
            this.ll = ll;
            this.ul = ul;
            this.left = null;
            this.right = null;
        }
    }

    private static SegTreeNode buildTree(int ll, int ul) {
        if(ll>ul) return null;
        if (ll==ul) {
            return new SegTreeNode(ll, ul);
        }
        int mid = (ll+ul)/2;
        SegTreeNode returnval = new SegTreeNode(ll, ul);
        returnval.left = buildTree(ll, mid);
        returnval.right = buildTree(mid+1, ul);
        returnval.val = returnval.left.val | returnval.right.val;
        return returnval;
    }

    private static void setInd(int ind, char newchar, char oldcar, SegTreeNode node) {
        if (node==null) return;
        if (node.ul < ind || node.ll > ind) return;
        if (node.ll == node.ul) {
            node.val = node.val - p2[oldcar-'a'] + p2[newchar-'a'];
            return;
        }
        setInd(ind, newchar, oldcar, node.left);
        setInd(ind, newchar, oldcar, node.right);
        node.val = node.left.val | node.right.val;
    }

    private static int uniqChar(int ll, int ul, SegTreeNode node) {
        if (node==null) {
            return 0;
        }
        if (node.ll>= ll && node.ul<=ul) return node.val;

        int left = uniqChar(ll, ul, node.left);
        int right = uniqChar(ll,ul,node.right);

        return (left|right);
    }

    static SegTreeNode root;

    public static void main(String[] args) {
        p2[0] = 1;
        for (int i=1;i<p2.length;i++) {
            p2[i] = p2[i-1]*2;
        }
        int n = in.NI();
        pval = new StringBuilder(in.next());
        root = buildTree(0, n-1);
        int m = in.NI();

        for(int i=0;i<m;i++) {
            int type = in.NI();
            if (type==1) {
                int ind = in.NI()-1; char newc = in.next().charAt(0);
                char oldc = pval.charAt(ind);
                if (oldc == newc) continue;
                setInd(ind, newc, oldc, root);
                pval.setCharAt(ind, newc);
            }
            else  if (type==2) {
                int v1=in.NI()-1; int v2 = in.NI()-1;
                int coun = uniqChar(v1, v2, root);
                int ans = 0;
                for (int j=0;j<26;j++) {
                    if ((coun&p2[j])!=0) ans++;
                }
                out.println(ans);
            }
        }

        out.close();
    }

    static InputStream inputStream = System.in;
    static OutputStream outputStream = System.out;
    static InputReader in = new InputReader(inputStream);
    static PrintWriter out = new PrintWriter(outputStream);

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int NI() {
            return Integer.parseInt(next());
        }

        public long NL() {
            return Long.parseLong(next());
        }

    }
}