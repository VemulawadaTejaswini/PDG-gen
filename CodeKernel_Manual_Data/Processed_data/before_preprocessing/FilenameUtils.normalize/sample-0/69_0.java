public class dummy {

public static String rewritePath(String oldValue, String newValue) {

        String path = newValue;
        String filename;

        if ("".equals(FilenameUtils.getExtension(newValue))) {
            filename = FilenameUtils.getName(oldValue);
        } else {
            path = FilenameUtils.getPath(newValue);
            filename = FilenameUtils.getName(newValue);
        }

        Pattern p = Pattern.compile("(.*?)#(.*?)(?:$|(/.*))");
        Matcher m = p.matcher(path);

        if (m.find()) {

            String prefix = m.group(1);
            String dir = m.group(2);
            String suffix = m.group(3);

            int index = oldValue.indexOf(dir);
            int length = dir.length();

            String remainder = FilenameUtils.getPath(oldValue.substring(index + length));

            if (prefix != null && !prefix.equals("")) {
                path = prefix + remainder;
            } else {
                path = remainder;
            }

            if (suffix != null && !suffix.equals("")) {
                path += suffix;
            }
        }

        return FilenameUtils.normalize(path + "/" + filename);
    }

}