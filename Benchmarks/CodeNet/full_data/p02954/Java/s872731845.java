import java.awt.*;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        ArrayList<node> arr=new ArrayList<>(n);
        for(int i=0;i<n;i++)arr.add(new node(1,1,0));

        boolean x=true;
        int j=0;
        while(x){
            j++;
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='R' && arr.get(i).oldChild!=0){
                    int temp=arr.get(i).oldChild;
                    int p=arr.get(i).total;
                    arr.get(i).total=p-temp;
                    arr.get(i).oldChild=0;

                    p=arr.get(i+1).newChild;
                    arr.get(i+1).newChild=p+temp;
                    p=arr.get(i+1).total;
                    arr.get(i+1).total=p+temp;
                }
                else if(s.charAt(i)=='L' && arr.get(i).oldChild!=0){
                    int temp=arr.get(i).oldChild;
                    int p=arr.get(i).total;
                    arr.get(i).total=p-temp;
                    arr.get(i).oldChild=0;

                    p=arr.get(i-1).newChild;
                    arr.get(i-1).newChild=p+temp;
                    p=arr.get(i-1).total;
                    arr.get(i-1).total=p+temp;
                }
            }

            for(int i=0;i<n;i++){
                int temp=arr.get(i).newChild;
                arr.get(i).newChild=0;
                int p=arr.get(i).oldChild;
                arr.get(i).oldChild=temp+p;
            }

            if(j==1000) x=false;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr.get(i).total+" ");
        }
        System.out.println();
    }
}
class node{
    int total,oldChild,newChild;

    public node(int total,int oldChild,int newChild){
        this.total=total;
        this.oldChild=oldChild;
        this.newChild=newChild;
    }
}