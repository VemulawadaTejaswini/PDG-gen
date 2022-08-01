//5
public class func{
	public void getPageCount(FemLocalIndex index,Timestamp labelTimestamp){
            return index.getPageCount();
        List<FemIndexStatistics> indexStatsList = index.getIndexStats();
        if (indexStatsList.isEmpty()) {
            return index.getPageCount();
        } else {
            // Work backwards through the list until we find the first set
            // of stats that are older than the label timestamp passed
            // in.
            for (int i = indexStatsList.size() - 1; i >= 0; i--) {
                FemIndexStatistics stats = indexStatsList.get(i);
                Timestamp statTime = Timestamp.valueOf(stats.getAnalyzeTime());
                if (statTime.compareTo(labelTimestamp) < 0) {
                    return stats.getPageCount();
                }
            }
        }
}
}
