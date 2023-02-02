//48
public class func{
public void parseFeedUri(String catalogTableUri){
        if (table == null || table.length() == 0) {
            throw new URISyntaxException(tableUri.toString(), "Table name is missing");
        }
        String partRaw = tableUri.getFragment();
        if (partRaw == null || partRaw.length() == 0) {
            throw new URISyntaxException(tableUri.toString(), "Partition details are missing");
        }
        final String rawPartition = partRaw.replaceAll(DOLLAR_EXPR_START_NORMALIZED, DOLLAR_EXPR_START_REGEX)
                                           .replaceAll(EXPR_CLOSE_NORMALIZED, EXPR_CLOSE_REGEX);
}
}
