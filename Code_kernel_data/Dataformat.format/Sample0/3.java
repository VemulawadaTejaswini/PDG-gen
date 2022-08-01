//2
public class func{
	public void addNote(){
        String comment = "Added on " + df.format(new Date());
        Note note = new Note(null, noteText, comment, new Date());
        noteDao.insert(note);
        Log.d("DaoExample", "Inserted new note, ID: " + note.getId());
}
}
