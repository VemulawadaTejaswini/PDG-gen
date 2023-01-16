//0
public class func{
	public void getLabelBounds(FemLabel referenceLabel,FarragoRepos repos){
        for (FemLabel label : labels) {
            // Ignore label aliases since they are "pointers" to base
            // labels.  So, only the timestamps of base labels are
            // meaningful in determining which label is the oldest.
            if (label.getParentLabel() != null) {
                continue;
            }
            String timestamp = label.getCreationTimestamp();

            // Ignore new labels that haven't been created yet
            if (timestamp == null) {
                continue;
            }
            Timestamp labelTimestamp = Timestamp.valueOf(timestamp);
            int rc = referenceTimestamp.compareTo(labelTimestamp);

            // Find the newest label older than the reference label
            if ((rc > 0)
                && ((lowerBound == null)
                    || (labelTimestamp.compareTo(lowerBound) > 0)))
            {
                lowerBound = labelTimestamp;

                // Find the oldest label newer than the reference label
            } else if (
                (rc < 0)
                && ((upperBound == null)
                    || (labelTimestamp.compareTo(upperBound) < 0)))
            {
                upperBound = labelTimestamp;
            }
        }
}
}
