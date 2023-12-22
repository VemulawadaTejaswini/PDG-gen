import java.util.*;

public class Main {

    public static int[] msr = new int[10];

    public static void main(String args[]) {

        msr[0] = Integer.MAX_VALUE;
        msr[1] = 2;
        msr[2] = 5;
        msr[3] = 5;
        msr[4] = 4;
        msr[5] = 5;
        msr[6] = 6;
        msr[7] = 3;
        msr[8] = 7;
        msr[9] = 8;



        Scanner sc = new Scanner(System.in);
        String input  = sc.nextLine();
        String inputs[] = input.split(" ");
        int matchSticks = Integer.valueOf(inputs[0]);
        String input2 = sc.nextLine();
        String[] inputs2 = input2.split(" ");
        List<Integer> numbersAllowed = new ArrayList<>();
        Set<Integer> allowedSticksSet = new HashSet<Integer>();

        for(String eachInput:inputs2) {
            numbersAllowed.add(Integer.valueOf(eachInput));
            allowedSticksSet.add(msr[Integer.valueOf(eachInput)]);
        }

        int[] allowedSticks = new int[allowedSticksSet.size()];
        int x = 0;

        for(Integer allowedStick:allowedSticksSet) {
            allowedSticks[x] = allowedStick;
            x++;
        }


        for( int i = 0; i<x;i++){

            int min = Integer.MAX_VALUE;
            int jThisTime = 0;

            for(int j = i; j<x;j++) {
                if(allowedSticks[j]<min)
                {
                    min = allowedSticks[j];
                    jThisTime = j;
                }
            }

            int a = allowedSticks[i];
            allowedSticks[i] = allowedSticks[jThisTime];
            allowedSticks[jThisTime] = a;

        }

        HashMap<Integer,Integer> maxOutput = getMaxOutput(matchSticks,allowedSticks,0);
        HashMap<Integer,Integer> output  = new HashMap<>();
        for( Integer k : maxOutput.keySet()) {
            int value = 0 ;
           for(int i = 0 ; i<10 ;i++) {
                if(msr[i]==k && numbersAllowed.contains(i)) {
                    value=i;
                }
           }
           output.put(value,maxOutput.get(k));
        }

        Set<Integer> finalNumbers = output.keySet();
        int[] finalNumberArray  = new int[finalNumbers.size()];
        int aa = 0;
        for(Integer finalNumber: finalNumbers )
        {
            finalNumberArray[aa] = finalNumber;
            aa++;
        }

        for( int i = 0; i<finalNumberArray.length;i++){

            int min = Integer.MAX_VALUE;
            int jThisTime = 0;

            for(int j = i; j<finalNumberArray.length;j++) {
                if(finalNumberArray[j]<min)
                {
                    min = finalNumberArray[j];
                    jThisTime = j;
                }
            }

            int a = finalNumberArray[i];
            finalNumberArray[i] = finalNumberArray[jThisTime];
            finalNumberArray[jThisTime] = a;
        }

        for(int i = finalNumberArray.length-1 ; i>=0 ;i-- )
        {
            int times = output.get(finalNumberArray[i]);
            for( int j = 0 ; j<times ;j++) {
                System.out.print(finalNumberArray[i]);
            }
        }

    }

    public static HashMap<Integer,Integer> getMaxOutput(int matchSticks,int[] allowedSticks,int n)
    {
        HashMap<Integer,Integer> answer = new HashMap<>();
        if(matchSticks==0)
            return null;

        if( (allowedSticks.length-1)==n ) {
            if(matchSticks%allowedSticks[n]==0)
            {
                answer.put(allowedSticks[n],matchSticks/allowedSticks[n]);
                return answer;
            }
            else
            {
                return null;
            }
        }

        if(matchSticks%allowedSticks[n]==0)
        {
            answer.put(allowedSticks[n],matchSticks/allowedSticks[n]);
            return answer;
        }
        else{
            //3,4,5,7
            HashMap<Integer,Integer> answerFromAbove = null;
            int maxAllowed = matchSticks/allowedSticks[n];

            int currentAllowed = maxAllowed;
            currentAllowed = currentAllowed-1;
            while( currentAllowed>=0 && answerFromAbove==null ) {

                int left = matchSticks - allowedSticks[n]*currentAllowed ;
                answerFromAbove = getMaxOutput(left,allowedSticks,n+1);
                currentAllowed--;
            }

            if(answerFromAbove ==null) {
                return null;
            }
            else {
                answerFromAbove.put(allowedSticks[n],currentAllowed+1);
                return answerFromAbove;
            }
        }
    }

}