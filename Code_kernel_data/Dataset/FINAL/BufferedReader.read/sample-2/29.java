public class func{
public void CalculatePercent(String inputFile,PrintWriter pw){
            while ((inRead = bfr.read()) != -1) {
                fRead = (char) inRead;
                if ((!(fRead == 'A' || fRead == 'T' || fRead == 'C' || fRead == 'G' || fRead == 'N'))
                        && (!(fRead == 'a' || fRead == 't' || fRead == 'c' || fRead == 'g' || fRead == 'n'))) continue;
                sequenceWindow.add(fRead);
                if (sequenceWindow.size() == windowSize) {
                    inWindow = 0;
                    for (char aSequenceWindow : sequenceWindow) {
                        if (aSequenceWindow == 'G' || aSequenceWindow == 'C') inWindow++;
                    }
                    if (inWindow == 0) {
                        pw.println("0.0");
                    } else {
                        result = ((double) inWindow / (double) windowSize) * 100;
                        pw.println(String.format("%.2f", result));
                    }
                    for (int i = 0; i < windowStep; i++)
                        sequenceWindow.remove();
                }
            }
}
}
