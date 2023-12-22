import java.util.Scanner;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int paperNum = scanner.nextInt();
        boolean duplicationFlag = false;
        LinkedList<String[]> inputDataList = new LinkedList<>();
        StringBuilder checkString = new StringBuilder();

        for (int index = 0; index < paperNum; index++) {
            checkString.append(scanner.next());
            for (int count = 0; count < inputDataList.size(); count++) {
                if (inputDataList.get(count)[0].equals(checkString.toString())) {
                    String[] duplicationString = inputDataList.get(count);
                    int countNum = Integer.parseInt(duplicationString[1]);
                    countNum++;
                    duplicationString[1] = String.valueOf(countNum);
                    duplicationFlag = true;
                    break;
                }
            }
            if (!duplicationFlag) {
                String[] newWord = new String[2];
                newWord[0] = checkString.toString();
                newWord[1] = "1";
                inputDataList.add(newWord);
            }
            duplicationFlag = false;
            checkString.setLength(0);
        }
        scanner.close();

        int maxCountNum = 0;
        boolean insertFlag = false;
        LinkedList<String> maxCountWordList = new LinkedList<>();
        for (int index = 0; index < inputDataList.size(); index++) {
            String[] checkWord = inputDataList.get(index);
            int wordCount = Integer.parseInt(checkWord[1]);
            if (wordCount < maxCountNum) {
                inputDataList.remove(index);
                index--;
            } else if (wordCount > maxCountNum) {
                if (!maxCountWordList.isEmpty()) {
                    maxCountWordList.clear();
                }
                maxCountWordList.add(checkWord[0]);
                maxCountNum = wordCount;
            } else {
                for (int count = 0; count < maxCountWordList.size(); count++) {
                    if (maxCountWordList.get(count).compareTo(checkWord[0]) > 0) {
                        maxCountWordList.add(count, checkWord[0]);
                        insertFlag = true;
                        break;
                    }
                }
                if (!insertFlag) {
                    maxCountWordList.add(checkWord[0]);
                    insertFlag = false;
                }
            }
        }

        if (inputDataList.size() == 1) {
            System.out.println(inputDataList.get(0)[0]);
        } else {
            for (String displayWord : maxCountWordList) {
                System.out.println(displayWord);
            }
        }


    }

}