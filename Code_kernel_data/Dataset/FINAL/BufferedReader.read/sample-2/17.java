public class func{
public void fromRangeReader(BufferedReader rangeFile){
            if(rangeFile.read() == 'x') {
                rangeFile.readLine();
                String line = rangeFile.readLine();
                if (line == null) {
                    line = "";
                }
                StringTokenizer st = new StringTokenizer(line);
                double scaledLowerBound = Double.parseDouble(st.nextToken());
                double scaledUpperBound = Double.parseDouble(st.nextToken());
                if(scaledLowerBound != 0 || scaledUpperBound != 1) {
                    throw new RuntimeException("Feature lower bound and upper bound must"
                            + "be set in range file to resepctively 0 and 1");
                }
                String restore_line = null;
                List<FeatureLimits> limits = new ArrayList<FeatureLimits>();
                while((restore_line = rangeFile.readLine())!=null)
                {
                    StringTokenizer st2 = new StringTokenizer(restore_line);
                    st2.nextToken();
                    feature_min = Double.parseDouble(st2.nextToken());
                    feature_max = Double.parseDouble(st2.nextToken());
                    FeatureLimits newLimit = new FeatureLimits(feature_min, feature_max);
                    limits.add(newLimit);
                }
                FeatureVectorScalerImpl scaler = new FeatureVectorScalerImpl(limits.size(), scaledLowerBound, scaledUpperBound);
                scaler.setStrategy(new LinearScaling());
                scaler.setFeatureLimits(limits);
                return scaler;
            } else {
                throw new RuntimeException("y scaling not supported");
            }
}
}
