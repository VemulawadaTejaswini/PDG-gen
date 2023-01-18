//6
public class func{
	public void getRowCounts(FemAbstractColumnSet table,Timestamp labelTimestamp,Long[] rowCounts){
            rowCounts[0] = table.getRowCount();
            rowCounts[1] = table.getDeletedRowCount();
            table.getRowCountStats();
        if (rowCountStatsList.isEmpty()) {
            rowCounts[0] = table.getRowCount();
            rowCounts[1] = table.getDeletedRowCount();
            return;
        } else {
            // Work backwards through the list until we find the first set
            // of row counts that are older than the label timestamp passed
            // in.
            for (int i = rowCountStatsList.size() - 1; i >= 0; i--) {
                FemRowCountStatistics stats = rowCountStatsList.get(i);
                Timestamp statTime = getMaxTimestamp(table, stats);
                if ((statTime == null)
                    || (statTime.compareTo(labelTimestamp) < 0))
                {
                    rowCounts[0] = stats.getRowCount();
                    rowCounts[1] = stats.getDeletedRowCount();
                    return;
                }
            }
        }
}
}
