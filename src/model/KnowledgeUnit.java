package model;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class KnowledgeUnit {

	private String id;
	private String description;
	private String learnedLessons;
	private String hashtagLesson;
	private String hashtagDescription;
	private boolean statusPrivacy;
	private Calendar publicDate;
	private String typeknowledege;
	private String nameAuthor;
	private String chargeAuthor;
	private Revision revision;
	private DateFormat formatter;

	Calendar now = Calendar.getInstance();
    int actualDay = now.get(Calendar.DAY_OF_MONTH);
	int actualmonth = now.get(Calendar.MONTH) + 1;
    int actualyear = now.get(Calendar.YEAR);
    Calendar actualDate = new GregorianCalendar(actualyear, actualmonth-1, actualDay);

	private String[] ListtypeKnowledge = { "TECHNICIAN", "GESTION", "DOMAIN", "EXPERIENCES"};

	public KnowledgeUnit(String id, String description, int typeknowledge, String nameAuthor, String learnedLessons, String chargeAuthor) {

		//variables inputs
		this.id = id;
		this.description = description;
		this.typeknowledege = ListtypeKnowledge[typeknowledge];
		this.nameAuthor = nameAuthor;
		this.learnedLessons = learnedLessons;
		this.chargeAuthor = chargeAuthor;

		//variables no outputs in the create
		this.statusPrivacy = false;
		this.revision = Revision.ENPROCESS;
		


	}

	public Calendar getPublicdate(){
		return publicDate;
	}
	
	public String getPublicdateFormated() throws ParseException{
		return formatter.format(this.publicDate.getTime());
	}

	public void setPublicDate(String dateString) throws ParseException {
		this.publicDate = Calendar.getInstance();
		this.publicDate.setTime(formatter.parse(dateString));
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLearnedLessons() {
        return learnedLessons;
    }

    public void setLearnedLessons(String learnedLessons) {
        this.learnedLessons = learnedLessons;
    }

    public String setHashtagLesson() {
        return hashtagLesson;
    }

    public void setHashtagLesson(String hashtagLesson) {
        this.hashtagLesson = hashtagLesson;
    }

	public String getHashtagDescription() {
        return hashtagDescription;
    }

    public void setHashtagDescription(String hashtagDescription) {
        this.hashtagDescription = hashtagDescription;
    }

    public boolean isStatusPrivacy() {
        return statusPrivacy;
    }

    public void setStatusPrivacy(boolean statusPrivacy) {
        this.statusPrivacy = statusPrivacy;
    }

    public void setPublicDate(Calendar publicDate) {
        this.publicDate = publicDate;
    }

    public String getTypeknowledege() {
        return typeknowledege;
    }

    public void setTypeknowledege(String typeknowledege) {
        this.typeknowledege = typeknowledege;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public String getChargeAuthor() {
        return chargeAuthor;
    }

    public void setChargeAuthor(String chargeAuthor) {
        this.chargeAuthor = chargeAuthor;
    }

    public Revision getRevision() {
        return revision;
    }

    public void setRevision(Revision revision) {
        this.revision = revision;
    }


	public String toString() {

		String msg = "";

		msg = "ID: " + id + "\nDescripcion: " + description + "\nTipo: " + typeknowledege + "\nLecciones aprendidas: "
				+ learnedLessons + "\nStatus: " + revision;

		return msg;

	}
}
