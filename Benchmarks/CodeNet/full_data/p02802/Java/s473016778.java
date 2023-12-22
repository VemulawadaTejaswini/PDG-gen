import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTasks = scanner.nextInt();
        int numberOfSubmissions = scanner.nextInt();

        int failsCounter = 0;
        int successCounter = 0;

        int currentTask = 0;
        boolean taskIsDone = false;
        int currentTaskFailsCounter = 0;
        for (int i = 0; i < numberOfSubmissions; i++) {
            int task = scanner.nextInt();
            String submissionStatus = scanner.next();

            if (currentTask != task) {
                currentTask = task;
                currentTaskFailsCounter = 0;
                taskIsDone = false;
            }
            if (!taskIsDone) {
                if (submissionStatus.equals("WA")) {
                    currentTaskFailsCounter++;
                }
                if (submissionStatus.equals("AC")) {
                    successCounter++;
                    taskIsDone = true;
                    failsCounter += currentTaskFailsCounter;
                }
            }
        }
        System.out.println(successCounter + " " + failsCounter);
    }
}