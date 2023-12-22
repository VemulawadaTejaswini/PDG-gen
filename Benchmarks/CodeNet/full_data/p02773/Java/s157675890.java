import java.util.*;
 
// public class Main {
//     public static void sort(int array[], String array2[], int left, int right){
//         if(left <= right){
//             int p = array[(left + right) >>> 1];
//             int l = left;
//             int r = right;
//             while(l <= r){
//                 while (array[l] < p){
//                     l++;
//                 }
//                 while (array[r] > p){
//                     r--;
//                 }
//                 if (l <= r){
//                     int tmp = array[l];
//                     array[l] = array[r];
//                     array[r] = tmp;
                    
//                     String tmp2 = array2[l];
//                     array2[l] = array2[r];
//                     array2[r] = tmp2;
//                     l++;
//                     r--;
//                 }
//             }
//             Main.sort(array, array2, left, r);
//             Main.sort(array, array2, l, right);
//         }
//     }

//     public static void main(String args[]){
//         Scanner stdIn = new Scanner(System.in);
//         int n = stdIn.nextInt();
//         // int b = stdIn.nextInt();
//         // int c = stdIn.nextInt();
//         // String s = stdIn.next();
//         // boolean flag = true;
         
//         // if(a == b && b == c){
//         //     flag = false;
//         // } 
        
//         // if(a != b && a != c && b != c){
//         //     flag = false;
//         // }
        
//         int count = 0;
//         String word[] = new String[n];
//         int num[] = new int[n];
//         int max = 1;
        
//         for(int i = 0; i < n; i++){
//             String s = stdIn.next();
//             boolean flag = false; //なかったら flase
            
//             for(int j = 0; j < count; j++){
//                 if(word[j].equals(s)){
//                     flag = true;
//                     num[j]++;
                    
//                     if(num[j] > max){
//                         max = num[j];
//                     }
//                 }
//             }
            
//             if(!flag){
//                 word[count] = s;
//                 num[count]++;
//                 count++;
//             }
//         }
        
//         // sort(num, word, 0, n - 1);
        
//         List<String> list = new ArrayList<String>(new LinkedHashSet<>());
        
//         // for(int i = n - 1; i >= 0; i--){
//         //     System.out.println(num[i] + " " + word[i] + " " + count);
//         // }
        
//         list.add(word[n - 1]);
        
//         for(int i = n - 2; i >= 0; i--){
//             if(num[i + 1] == num[i]){
//                 list.add(word[i]);
//             }else{
//                 break;
//             }
//         }
        
//         Collections.sort(list);
        
//         for (String str : list) {
//           System.out.println(str); 
//         }
        
        
//         // for(int i = 0; i < maxcount; i++){
//         //     System.out.println(maxs[i]);
//         // }
        
        
//         // System.out.println();
//         // System.out.print();
//     }
// }