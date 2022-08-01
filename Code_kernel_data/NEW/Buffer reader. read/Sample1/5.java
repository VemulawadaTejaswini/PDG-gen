//4
public class func{
	public void rewriteHeader(){
        while ((line = br.readLine()) != null) {
            if (descriptionLinePattern.matcher(line).matches()) {
                wr.write("DESCRIPTION \"");
                wr.write(description);
                wr.write("\"\n");
                descriptionWritten = true;
            } else if(platformLinePattern.matcher(line).matches()) {
                wr.write("PLATFORM ");
                wr.write(platform);
                wr.write("\n");
                platformWritten = true;
            } else if(line.startsWith("(")) {
                if(!descriptionWritten) {
                    wr.write("DESCRIPTION \"");
                    wr.write(description);
                    wr.write("\"\n");
                }

                if(!platformWritten) {
                    wr.write("PLATFORM ");
                    wr.write(platform);
                    wr.write("\n");
                }

                wr.write(line);
                wr.append('\n');
                break;
            /* Write all other lines */
            } else {
                wr.write(line);
                wr.append('\n');
            }
        }
        while ((len = br.read(buff, 0, 4096)) > 0) {
            wr.write(buff, 0, len);
        }
        wr.close();
}
}
