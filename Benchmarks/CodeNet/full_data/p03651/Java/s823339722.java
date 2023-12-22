
import java.util.Scanner;
import java.util.ArrayList;

class Main{
//      private static ArrayList<Integer> a;
        private static int[] a;
        private static int m;
        private static int sub;
        private static boolean b;
        private static int[] length=new int[3];

        public static void main(String[] args){

                Scanner scanner=new Scanner(System.in);
                int n=scanner.nextInt();
                int k=scanner.nextInt();
//              a=new ArrayList<>();
                a=new int[100000];
                for(int i=0;i<n;i++){
//                      a.add(scanner.nextInt());
                        a[i]=scanner.nextInt();
                }

                for(int i=0;i<n;i++){
//                      if(a.get(i)==k){
                        if(a[i]==k){
                                System.out.println("POSSIBLE");
                                return;
                        }
                }

                length[0]=n;
                for(int i=0;i<n-1;i++){
                        for(int j=i+1;j<n;j++){
                                sub=a[i]-a[j];
                                if(sub<0){
                                        sub=-sub;
                                }
                                b=true;
                                for(int l=0;l<n;l++){
                                        if(a[l]==sub){
                                                b=false;
                                        }
                                }
                                if(b){
//                                      a.add(sub);
                                        a[length[0]+length[2]]=sub;
                                        length[2]++;
                                }
                        }
                }
                if(length[2]>0){
                                hoge();
                }
                for(int i:a){
                        if(i==k){
                                System.out.println("POSSIBLE");
                                return;
                        }
                }
                System.out.println("IMPOSSIBLE");
        }

        private static void hoge(){
                length[0]=length[0]+length[1];
                length[1]=length[2];
                length[2]=0;
                for(int i=0;i<length[0];i++){
                        for(int j=length[0];j<length[0]+length[1];j++){
//                              sub=a.get(i)-a.get(j);
                                sub=a[i]-a[j];
                                if(sub<0){
                                        sub=-sub;
                                }
                                b=true;
                                for(int k=0;k<length[0]+length[1];k++){
//                                      if(a.get(k)==sub){
                                        if(a[k]==sub){
                                                b=false;
                                        }
                                }
                                if(b){
//                                      a.add(sub);
                                        a[length[0]+length[1]+length[2]]=sub;
                                        length[2]++;
                                }
                        }
                }
                if(length[2]>0){
                        hoge();
                }
        }
}