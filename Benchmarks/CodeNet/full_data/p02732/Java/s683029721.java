

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        HashMap<Integer,Long> ans=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        HashSet<Integer> hashSet=new HashSet<>();
        for(int j=0;j<n;j++){
            arr[j]=scanner.nextInt();
            if(hashMap.get(arr[j])==null){
                hashMap.put(arr[j],1);
            }
            else{
                hashMap.put(arr[j],hashMap.get(arr[j])+1);
                if(!hashSet.contains(arr[j])) {
                    list.add(arr[j]);
                    hashSet.add(arr[j]);
                }
            }
        }
        for(int j=0;j<n;j++)
        {
            if(ans.get(arr[j])==null){
                long tot=0;
                for(int i=0;i<list.size();i++){
                    if(list.get(i)==arr[j]){
                        tot+=(long)((long)(hashMap.get(list.get(i))-1)*(long)(hashMap.get(list.get(i))-2))/(long)2;
                    }
                    else{
                        tot+=(long)((long)(hashMap.get(list.get(i))-1)*(long)(hashMap.get(list.get(i))))/(long)2;

                    }
                }
                ans.put(arr[j],tot);
                System.out.println(tot);
            }
            else{
                System.out.println(ans.get(arr[j]));
            }
        }

    }
}
