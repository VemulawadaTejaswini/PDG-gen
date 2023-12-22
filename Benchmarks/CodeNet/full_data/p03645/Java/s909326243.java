import java.util.Scanner;

class Main{
    private static int mean;
    private static Object[] result=new Object[]{0,false};

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int a=0;
        int b=0;
        int c[]=new int[200000];
        int d[]=new int[200000];
        int indexC=0;
        int indexD=0;
        boolean possible=false;
        if(m==1){
//                      for(int i=0;i<2*m;i++){
//                              scanner.nextInt();
//                      }
            scanner.close();
            System.out.println("IMPOSSIBLE");
            return;
        }
        if(m>(n-2)*(n-1)/2){
//                      for(int i=0;i<2*m;i++){
//                              scanner.nextInt();
//                      }
            scanner.close();
            System.out.println("POSSIBLE");
            return;
        }
        for(int i=0;i<m;i++){
            a=scanner.nextInt();
            b=scanner.nextInt();
            if(a==1){
                c[indexC++]=b;
            }
            if(b==n){
                d[indexD++]=a;
            }
        }
        int lengthC=0;
        int lengthD=0;
        while(c[lengthC]!=0){
            lengthC++;
        }
        while(d[lengthD]!=0){
            lengthD++;
        }
        sort(c,indexC);
        sort(d,indexD);

        for(int i=0;c[i]!=0;i++){
            result=linearSearch(c[i],d,(int)result[0],lengthD-1);
            if((boolean)result[1]){
                System.out.println("POSSIBLE");
                return;
            }
        }
        System.out.println("IMPOSSIBLE");
    }

    private static void sort(int[] a,int index){
        int tmp;
        for(int i=1;i<index;i++){
            if(a[i]==0){
                break;
            }
            for(int j=i;j>0;j--){
                if(a[j-1]>a[j]){
                    tmp=a[j-1];
                    a[j-1]=a[j];
                    a[j]=tmp;
                }else{
                    break;
                }
            }
        }
    }

    private static Object[] linearSearch(int target,int[] a,int beginning,int end){
        if(beginning==end){
            if(a[mean]==target){
                return new Object[]{mean,true};
            }else if(a[mean]>target){
                return new Object[]{mean,false};
            }else{
                return new Object[]{mean+1,false};
            }
        }
        mean=(3*beginning+end)/2;
        if(a[mean]==target){
            return new Object[]{mean+1,true};
        }else if(a[mean]>target){
            linearSearch(target,a,beginning,mean-1);
        }else{
            linearSearch(target,a,mean+1,end);
        }
        return new Object[]{null,null};
    }
}