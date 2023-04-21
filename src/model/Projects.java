package model;


import java.sql.Date;
import java.util.Calendar;

import javax.swing.text.Position;

import javafx.stage.Stage;

public class Projects {
    
    //name of the project
private String projectName;

//name of the client
private String clientName;

//initial date of the project
private int iDay;
private int iMouth;
private int iYear;

//final date of the project
private int fDay;
private int fMouth;
private int fYear;

//budget of the project
private Double budget;

//name of the client manager
private String managName;

//name of the GreenSQ manager
private String greenName;

//phone number of the client
private int clientPhone;

//phone number of the GreenSQ client
private int greenPhone;

//Create Objet Stage
private ProjectStage projectStage;


private ProjectStage[] projectStages;


    public Projects(String projectName,String clientName, Double budget, String managName,String greenName,int clientPhone, int greenPhone, int iDay, int iMouth, int iYear, int fDay, int fMouth, int fYear){

        this.projectStages = new ProjectStage[6];

        String[] sName = {"initiation", "planning", "design", "execution", "closure", "monitoring and control"};

        

        ProjectStage[0] = nextStage(null,null, null,null,null, null,null,null, null,null, null, null, null, null, null);
        nextStage(sName[1], null, null, "inactiva");
        nextStage(sName[2], null, null, "Inactiva");
        nextStage(sName[3], null, null, "Inactiva");
        nextStage(sName[4], null, null, "Inactiva");
        nextStage(sName[5], null, null, "Inactiva");

        this.projectName = projectName;
        this.clientName = clientName;
        this.iDay = iDay;
        this.iMouth = iMouth;
        this.iYear = iYear;
        this.fDay = fDay;
        this.fYear =  fYear;
        this.fMouth = fMouth;
        this.budget = budget;
        this.managName = managName;
        this.greenName = greenName;
        this.clientName = clientName;
        this.greenPhone = greenPhone;

    }

    public boolean nextStage(int iInitalPlanned, int mInitalPlanned, int yInitialPlanned, int dFinalPlanned, int mFinalPlanned, int yFinalPlanned, int dInitalReal, int mInitialReal, int yInitialReal,int dFinalReal, int mFinalReal, int yFinalReal, int durationMonths, boolean isActive, String nameStage) {

        

        ProjectStage miStage = new ProjectStage( iInitalPlanned,  mInitalPlanned,  yInitialPlanned,  dFinalPlanned,  mFinalPlanned,  yFinalPlanned,  dInitalReal,  mInitialReal,  yInitialReal, dFinalReal,  mFinalReal,  yFinalReal,  durationMonths,  isActive, nameStage);
        
        int position = 0;

        for(int i=0;i<ProjectStage.length;i++){
            
           

        }

        
        return false;
    }
    
    //for(int i = 0; i < stages.length; i++){
    //    if(newProject == true){
    //        stages[i] = newStage;
    //        return true;
    //    }
    //}

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
    
    public int getiMouth() {
        return iMouth;
    }

    public int getiDay() {
        return iDay;
    }

    public int getiYear() {
        return iYear;
    }
    
    public int getfMouth() {
        return fMouth;
    }

    public int getfDay() {
        return fDay;
    }

    public int getfYear() {
        return fYear;
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
