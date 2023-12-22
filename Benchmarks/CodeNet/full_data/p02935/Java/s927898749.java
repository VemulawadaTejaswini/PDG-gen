import java.util.*;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int elements = sc.nextInt();
        int[] value = new int[elements];
        for (int i = 0; i < elements; i++) {
            value[i] = sc.nextInt();
        }
        solve(value);
    }

    public static void solve(int[] ingredients){
        ingredients = insertionSort(ingredients);
        double result = 0;
        for(int i=0; i<ingredients.length-1; i++){
            result += ingredients[i]/Math.pow(2,i+1);
        }
        result += ingredients[ingredients.length-1]/Math.pow(2,ingredients.length-1);
        System.out.println(result);
    }

    public static int[] insertionSort(int[] a){
        int temp, ins, cmp; //temporary, insert, compare
        for(ins=1; ins<a.length; ins++){
            temp = a[ins];
            for(cmp = ins-1; cmp>=0; cmp--){
                if(temp < a[cmp]){
                    break;
                }
                a[cmp+1] = a[cmp];
            }
            a[cmp+1] = temp;
        }
        return a;
    }
}