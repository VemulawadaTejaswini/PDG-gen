import java.util.Scanner;  
  
public class Q2_异或 {  
    public static void main(String[] args) {  
        trieNode root = new trieNode(-1);  
        Scanner sc = new Scanner(System.in);  
        int n = sc.nextInt();  
        int m = sc.nextInt();  
        int[] items = new int[n];  
        for(int i=0; i<n; i++){  
            items[i] = sc.nextInt();  
            insert(root, items[i]);  
        }  
        long result = 0;  
        for(int num : items){  
            result  += query(root, num, m, 31);
        }  
        System.out.println(result/2);  
    }  
  
    public static void insert(trieNode root, int number){  
        trieNode current = root;  
        for(int i=31; i>=0; i--){
            int digit = (number>>i)&1;  
            if(current.next[digit]==null){  
                current.next[digit] = new trieNode(digit);  
            }  
            current = current.next[digit];  
            current.count++;  
        }  
    }  
      
    public static int query(trieNode root, int a, int m, int k){  
        if(root == null){  
            return 0;  
        }  
        trieNode current = root;  
        for(int i=k; i>=0; i--){  
            int aDigit = (a>>i)&1;  
            int mDigit = (m>>i)&1;  
            if(aDigit == 1 && mDigit == 1){  
                if(current.next[0] == null){  
                    return 0;  
                }else{  
                    current = current.next[0];
                }  
            }else if(aDigit == 0 && mDigit ==1){  
                if(current.next[1] == null){  
                    return 0;  
                }else {  
                    current = current.next[1];  
                }  
            }else if(aDigit == 0 && mDigit == 0){  
                int p = query(current.next[0], a, m, i-1);  
                int q = (current.next[1]==null?0:current.next[1].count);  
                return p+q;  
            }else if(aDigit == 1 && mDigit == 0){  
                int p = query(current.next[1], a, m, i-1);  
                int q = (current.next[0]==null?0:current.next[0].count);  
                return p+q;  
            }  
        }         
        return 0;  
    }     
}  
  
class trieNode{  
    trieNode[] next = new trieNode[2];
    int count = 0; 
    int digit = 0;  
    public trieNode(int digit) {  
        this.digit = digit;  
    }  
}  