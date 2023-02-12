public class func{
public void testFetchSmallBlobs(){
        PreparedStatement ps = prepareStatement(
                "select dBlob, length from smallBlobs");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Blob Blob = rs.getBlob(1);
            int blobLength = rs.getInt(2);
            byte[] content = Blob.getBytes(1, blobLength);
        }
        rs.close();
}
}
