import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main {
    public static void main(final String[] args) throws Exception {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            List<String> inputString = Arrays.asList(br.readLine().split(" "));
            int N = Integer.parseInt(inputString.get(0));
            int M = Integer.parseInt(inputString.get(1));
            List<List<String>> nPicture = new ArrayList<>();
            List<List<String>> mPicture = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                nPicture.add(Arrays.asList(br.readLine().split("")));
            }

            for (int i = 0; i < M; i++) {
                mPicture.add(Arrays.asList(br.readLine().split("")));
            }

            List<String> ansListTmp = new ArrayList<>();
            for (int i = 0; i <= N - M; i++) {
                for (int j = 0; j < M; j++) {
                    for (int k = 0; k < M; k++) {
                        if (!nPicture.get(j).get(k + i).equals(mPicture.get(j).get(k))) {
                            ansListTmp.add("No");
                        } else {
                            ansListTmp.add("Yes");
                        }

                        if (!nPicture.get(j + i).get(k).equals(mPicture.get(j).get(k))) {
                            ansListTmp.add("No");
                        } else {
                            ansListTmp.add("Yes");
                        }
                    }
                }
            }

            int end = (M * M) * (M * M);
            int noCount = 0;
            for (int i = 0; i < end; i += M * M) {
                for (int j = 0; j < M * M; j++) {
                    if (ansListTmp.get(j + i).equals("No")) {
                        noCount++;
                        break;
                    }
                }
            }

            System.out.println(noCount < M * M ? "Yes" : "No");
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}