import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main{
    
    public static void main (String[ ]args){
        
        Main main = new Main ();
        main.solve();
    }
    
    private void solve (){
        Scanner sc = new Scanner (System.in);
        
        int N = sc.nextInt();
        int K = sc.nextInt();
        String s = sc.next();
        
        char[] list = new char[N];
        
        for (int index=0; index<N; index++){
            list[index]=s.charAt(index);
        }
        int count = 0;
        int start = 0;
        boolean flag = false;
        int[] startList = new int [N];
        int[] lengthList = new int[N];
        
        
        for (int index=0; index<N; index++){
            char temp = s.charAt(index);
            if (temp=='0'){
                if (flag){
                    count++;
                } else {
                    start = index;
                    flag=true;
                    count++;
                }
            } else {
                if (flag){
                    startList[start]=count;
                    lengthList[index]=count;
                    count=0;
                    flag=false;
                }
            }
        }
        
        Arrays.sort(lengthList);
        int number = N;
        int lastBasho=0;
        boolean flag5=true;
        for (int index=K; index>0; index--){
            int length = lengthList[number-1];
            if (length==0){
                break;
            } else {
                if (flag5){
                    int basho = find1 (length,startList,N);
                    lastBasho = basho;
                    for (int index2=basho; index2<basho+length; index2++){
                        list[index2]='1';
                    }
                } else {
                  int basho = find2 (length,startList,N,lastBasho);
                    lastBasho = basho;
                    for (int index2=basho; index2<basho+length; index2++){
                        list[index2]='1';
                    }  
                }
            }
            number--;
        }
        
        int ninzu = 0;
        int maximum=0;
        
        for (int index=0; index<N; index++){
                if (list[index]=='1'){
                    ninzu++;
                } else {
                    if (maximum<ninzu){
                        maximum=ninzu;
                    }
                    ninzu=0;
                }
        }
        if (ninzu>maximum){
            maximum=ninzu;
        }
        System.out.println(maximum);
        
        
    }
    
    private int find2 (int length, int[] startList, int N, int lastBasho){
        int useful=0;
        boolean flag=true;
        for (int index=0; index<N; index++){
            if (startList[index]==length){
                if (flag){
                    useful=index;
                    flag=false;
                } else {
                    if (Math.abs(lastBasho-useful)>Math.abs(lastBasho-index)){
                        useful=index;
                    }
                }
                
            }
        }
        
        return useful;
    }
    
     private int find1 (int length, int[] startList, int N){
        int useful=0;
        boolean flag=true;
        for (int index=0; index<N; index++){
            if (startList[index]==length){
                useful=index;
                break;
                
            }
        }
        
        return useful;
    }
}