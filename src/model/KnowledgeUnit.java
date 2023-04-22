package model;

import java.text.ParseException;
import java.util.Calendar;

public class KnowledgeUnit {

	private String id;
	private String description;
	private String learnedLessons;
	private String hashtag;
	private boolean statusPrivacy;
	private Calendar publicDate;
	private Typeknowledge typeknowledege;
	private String nameAuthor;
	private String chargeAuthor;
	private Revision revision;


	public KnowledgeUnit(String id, String description, Typeknowledge typeknowledge, String nameAuthor, String learnedLessons, String chargeAuthor, String hashtag) {

		//variables inputs
		this.id = id;
		this.description = description;
		this.typeknowledege = typeknowledege;
		this.nameAuthor = nameAuthor;
		this.chargeAuthor = chargeAuthor;
		this.hashtag = hashtag;

		//variables no outputs in the create
		this.statusPrivacy = false;
		this.revision = revision;
		


	}

	public String getPublicDate() throws ParseException{
		return formatter.format(this.initialReal.getTime()); 
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

    public String getHashtag() {
        return hashtag;
    }

    public void setHashtag(String hashtag) {
        this.hashtag = hashtag;
    }

    public boolean isStatusPrivacy() {
        return statusPrivacy;
    }

    public void setStatusPrivacy(boolean statusPrivacy) {
        this.statusPrivacy = statusPrivacy;
    }

    public Calendar getPublicDate() {
        return publicDate;
    }

    public void setPublicDate(Calendar publicDate) {
        this.publicDate = publicDate;
    }

    public Typeknowledge getTypeknowledege() {
        return typeknowledege;
    }

    public void setTypeknowledege(Typeknowledge typeknowledege) {
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
