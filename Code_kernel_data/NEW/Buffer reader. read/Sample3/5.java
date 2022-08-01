//4
public class func{
	public void fileMatchesPercentage(File file){
      while ((count = reader.read(buffer, 0, buffer.length)) != -1) {
        builder.append(buffer, 0, count);
      }
      String output = builder.toString();
      if (output.startsWith("0")) {
        if (getProject() != null) {
          log(MessageFormat.format("{0} has {1}% translated", new Object[] { file.getName(), Integer.valueOf(0) }), Project.MSG_INFO);
        }
        return evaluatePercentage(0);
      }
      StringTokenizer st = new StringTokenizer(output);
      int translated = Integer.parseInt(st.nextToken());
      while (st.hasMoreTokens()) {
        st.nextToken();
        if (!st.hasMoreTokens()) {
          break;
        }
        st.nextToken();
        if (!st.hasMoreTokens()) {
          break;
        }
        total += Integer.parseInt(st.nextToken());
      }
      int translatedPercentage =  (int)(100.0 * (double)translated / (double)total);
}
}
