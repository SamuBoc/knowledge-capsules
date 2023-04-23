package model;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.text.DateFormat;

import javax.swing.text.Position;

import org.omg.CORBA.FloatSeqHelper;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javafx.stage.Stage;

public class Projects {

    // name of the project
    private String projectName;

    // name of the client
    private String clientName;

    // initial date of the project
    private Calendar initialPlanned;

    // final date of the project
    private Calendar finalPlanned;

    // initial date of the project
    private Calendar initialReal;

    // final date of the project
    private Calendar finalReal;

    // budget of the project
    private Double budget;

    // name of the client manager
    private String managName;

    // name of the GreenSQ manager
    private String greenName;

    // phone number of the client
    private int clientPhone;

    // phone number of the GreenSQ client
    private int greenPhone;

    private DateFormat formatter;

    // Create Objet Stage
    private ProjectStage projectStage;

    private ProjectStage[] projectStages;

    private String[] sName = { "initiation", "planning", "design", "execution", "closure", "monitoring and control" };

    Calendar now = Calendar.getInstance();
    int actualDay = now.get(Calendar.DAY_OF_MONTH);
	int actualmonth = now.get(Calendar.MONTH) + 1;
    int actualyear = now.get(Calendar.YEAR);
    Calendar actualDate = new GregorianCalendar(actualyear, actualmonth-1, actualDay);

    public Projects(String projectName, String clientName, Double budget, String managName, String greenName, int clientPhone, int greenPhone, Calendar initialPlaneed, Calendar finalPlanned, int durationMonths, Calendar finalStage) {

        this.projectStages = new ProjectStage[6];
        
        // inititation
        createStage(initialPlaneed, finalStage, null, durationMonths, true, sName[0]);
        // planning
        createStage(finalPlanned, null, null, 0,false, sName[1]);
        // desing
        createStage(null, null, null,0, false, sName[2]);
        // execution
        createStage(null, null, null, 0, false, sName[3]);
        // closure
        createStage(null, null, null, 0 , false, sName[4]);
        // monitoring and control
        createStage(null, finalPlanned, null, 0, false, sName[5]);

        this.formatter = new SimpleDateFormat("dd/MM/yy");
        this.projectName = projectName;
        this.clientName = clientName;
        this.initialPlanned = initialPlanned;
		this.finalPlanned = finalPlanned;
		this.initialReal = null;
		this.finalReal = null;
        this.budget = budget;
        this.managName = managName;
        this.greenName = greenName;
        this.clientName = clientName;
        this.greenPhone = greenPhone;

    }

    public boolean createStage(Calendar initialPlanned, Calendar finalPlanned, Calendar initialReal, int durationMonths, boolean isActive,String nameStage) {

        ProjectStage miStage = new ProjectStage(  initialPlanned,  finalPlanned,  initialReal,  durationMonths,  isActive, nameStage);

        for (int i = 0; i < projectStages.length; i++) {
            if (projectStages[i] == null) {
            projectStages[i] = miStage; 
            return true;
            }
        }

        return false;
    }

    public String showActive() {

        if (projectStages == null) {
            return "No stages defined";
        }
    
        for (int i = 0; i < 6; i++) {
            if (projectStages[i].getisActive() == true) {
                return sName[i];
            }
        }
        
        return "No active stages";
    }
    
    public Boolean CulminateStage(Calendar finalPlanned, int monthsPlanned){

        for(int i = 0; i<6; i++){

            if(projectStages[i].getisActive() == true){
                if(i == 6){

                    System.out.println("Finish the project");
                    return false;

                }else{
                projectStages[(i)].setActive(false);
                
                projectStages[(i)].setFinalReal(actualDate);

                projectStages[(i+1)].setActive(true); 

                projectStages[(i+1)].setInitialReal(actualDate);

                projectStages[(i+1)].setFinalPlanned(finalPlanned);

                projectStages[(i+1)].setDurationMonths(monthsPlanned);

                break;
            }
            }

        }

        return false;
    }

    public boolean registerKnowledgeUnitProject(String id, String description, int typeknowledge, String nameAuthor, String learnedLessons, String chargeAuthor){

        for(int i = 0; i<6; i++){

            if(projectStages[i].getisActive() == true){

                projectStages[i].registerNewKnowledgeUnit(id, description, typeknowledge, nameAuthor, learnedLessons, chargeAuthor);

                return true;
            }

        }

        return false;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getInitialRealFormated() throws ParseException{
		return formatter.format(this.initialReal.getTime()); 
	}


	public String getFinalRealFormated() throws ParseException{
		return formatter.format(this.finalReal.getTime());
	}

	public String getInitialPlannedFormated() throws ParseException{
		return formatter.format(this.initialPlanned.getTime());
	}


	public String getFinalDatePFormated() throws ParseException{
		return formatter.format(this.finalPlanned.getTime());
	}
    public Calendar getInitialPlanned() {
		return initialPlanned;
	}

	public void setInitialDateP(Calendar initialPlanned) {
		this.initialPlanned = initialPlanned;
	}

	public Calendar getFinalPlanned() {
		return finalPlanned;
	}

	public void setFinalPlanned(Calendar finalPlanned) {
		this.finalPlanned = finalPlanned;
	}

	public Calendar getInitialReal() {
		return initialReal;
	}

	public void setInitialReal(Calendar initialReal) {
		this.initialReal = initialReal;
	}

	public Calendar getFinalReal() {
		return finalReal;
	}

	public void setFinalReal(Calendar finalReal) {
		this.finalReal = finalReal;
	}

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public String getManagName() {
        return managName;
    }

    public void setManagName(String managName) {
        this.managName = managName;
    }

    public String getGreenName() {
        return greenName;
    }

    public void setGreenName(String greenName) {
        this.greenName = greenName;
    }

    public int getClientPhone() {
        return clientPhone;
    }

    public void setClientPhone(int clientPhone) {
        this.clientPhone = clientPhone;
    }

    public int getGreenPhone() {
        return greenPhone;
    }

    public void setGreenPhone(int greenPhone) {
        this.greenPhone = greenPhone;
    }

    public String[] getsName() {
        return sName;
    }

    public void setsName(String[] sName) {
        this.sName = sName;
    }

    public ProjectStage[] getProjectStages() {
        return projectStages;
    }

    public void setProjectStages(ProjectStage[] projectStages) {
        this.projectStages = projectStages;
    }

}
