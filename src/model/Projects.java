package model;

import java.sql.Date;
import java.util.Calendar;

import javax.swing.text.Position;

import javafx.stage.Stage;

public class Projects {

    // name of the project
    private String projectName;

    // name of the client
    private String clientName;

    // initial date of the project
    private int iDayP;
    private int iMouthP;
    private int iYearP;

    // final date of the project
    private int fDayP;
    private int fMouthP;
    private int fYearP;

    // iniital real date
    private int iDayR;
    private int iMouthR;
    private int iYearR;

    // initial real finish
    private int fDayR;
    private int fMouthR;
    private int fYearR;

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

    // Create Objet Stage
    private ProjectStage projectStage;

    private ProjectStage[] projectStages;

    public Projects(String projectName, String clientName, Double budget, String managName, String greenName,
            int clientPhone, int greenPhone, int iDayP, int iMouthP, int iYearP, int fDayP, int fMouthP, int fYearP,
            int iDayR, int iMouthR, int iYearR) {

        this.projectStages = new ProjectStage[6];

        String[] sName = { "initiation", "planning", "design", "execution", "closure", "monitoring and control" };

        // inititation
        nextStage(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, true, sName[0]);
        // planning
        nextStage(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, sName[1]);
        // desing
        nextStage(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, sName[2]);
        // execution
        nextStage(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, sName[3]);
        // closure
        nextStage(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, sName[4]);
        // monitoring and control
        nextStage(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, sName[5]);

        this.projectName = projectName;
        this.clientName = clientName;
        this.iDayP = iDayP;
        this.iMouthP = iMouthP;
        this.iYearP = iYearP;
        this.fDayP = fDayP;
        this.fYearP = fYearP;
        this.fMouthP = fMouthP;
        this.budget = budget;
        this.managName = managName;
        this.greenName = greenName;
        this.clientName = clientName;
        this.greenPhone = greenPhone;

    }

    public boolean nextStage(int iInitalPlanned, int mInitalPlanned, int yInitialPlanned, int dFinalPlanned,
            int mFinalPlanned, int yFinalPlanned, int dInitalReal, int mInitialReal, int yInitialReal, int dFinalReal,
            int mFinalReal, int yFinalReal, int durationMonths, boolean isActive, String nameStage) {

        ProjectStage miStage = new ProjectStage(iInitalPlanned, mInitalPlanned, yInitialPlanned, dFinalPlanned,
                mFinalPlanned, yFinalPlanned, dInitalReal, mInitialReal, yInitialReal, dFinalReal, mFinalReal,
                yFinalReal, durationMonths, isActive, nameStage);

        int position = 0;

        for (int i = 0; i < 6; i++) {

        }

        return false;
    }

    // for(int i = 0; i < stages.length; i++){
    // if(newProject == true){
    // stages[i] = newStage;
    // return true;
    // }
    // }

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

    public int getiMouthp() {
        return iMouthP;
    }

    public int getiDayP() {
        return iDayP;
    }

    public int getiYearP() {
        return iYearP;
    }

    public int getfMouthP() {
        return fMouthP;
    }

    public int getfDayP() {
        return fDayP;
    }

    public int getfYearP() {
        return fYearR;
    }

    public int getiMouthR() {
        return iMouthR;
    }

    public int getiDayR() {
        return iDayR;
    }

    public int getiYearR() {
        return iYearR;
    }

    public int getfMouthR() {
        return fMouthR;
    }

    public int getfDayR() {
        return fDayR;
    }

    public int getfYearR() {
        return fYearR;
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

    public ProjectStage[] getProjectStages() {
        return projectStages;
    }

    public void setprojectStages(ProjectStage[] projectStages) {
        this.projectStage = projectStage;
    }

}
