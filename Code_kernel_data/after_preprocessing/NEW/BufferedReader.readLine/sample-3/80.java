//80
public class func{
public void withReplacements(Map<String,String> replacements,BufferedReader originalConfiguration){
        while ((line = originalConfiguration.readLine()) != null) {
            result.append(doReplacement(replacements, line)).append(
                    lineSeparator);
        }
}
}
