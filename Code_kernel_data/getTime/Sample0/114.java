//113
public class func{
	public void deletePrefLogArchive(int dayBefore){
        Calendar before = Calendar.getInstance();
        before.add(Calendar.DATE, -1);
        before.set(Calendar.SECOND, 0);
        prefLogDao.deleteArchivedRecoredByTime(before.getTime());
}
}
