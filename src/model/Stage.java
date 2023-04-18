package model;

import java.sql.Date;

import javax.print.DocFlavor.STRING;

public class Stage {
 
    private String nowStage;
    private Date plannedInitialStage;
    private Date plannedFinalStage;
    private Date realInitialStage;
    private Date realFinalStage;
    private int durationMonths;
    private boolean isActive;
    
    public Stage(String nowStage, Date plannedInitialStage, Date plannedFinalStage, Date realInitialStage, Date realFinalStage, int durationMonths, boolean isActive){
        this.nowStage = nowStage;
        this.plannedInitialStage = plannedInitialStage;
        this.plannedFinalStage = plannedFinalStage;
        this.realInitialStage = realInitialStage;
        this.realFinalStage = realFinalStage;
        this.durationMonths = durationMonths;
        this.isActive = isActive;
    }

    public String getNowStage() {
        return nowStage;
    }
    
    public void setNowStage(String nowStage) {
        this.nowStage = nowStage;
    }
    
    public Date getPlannedInitialStage() {
        return plannedInitialStage;
    }
    
    public void setPlannedInitialStage(Date plannedInitialStage) {
        this.plannedInitialStage = plannedInitialStage;
    }
    
    public Date getPlannedFinalStage() {
        return plannedFinalStage;
    }
    
    public void setPlannedFinalStage(Date plannedFinalStage) {
        this.plannedFinalStage = plannedFinalStage;
    }
    
    public Date getRealInitialStage() {
        return realInitialStage;
    }
    
    public void setRealInitialStage(Date realInitialStage) {
        this.realInitialStage = realInitialStage;
    }
    
    public Date getRealFinalStage() {
        return realFinalStage;
    }
    
    public void setRealFinalStage(Date realFinalStage) {
        this.realFinalStage = realFinalStage;
    }
    
    public int getDurationMonths() {
        return durationMonths;
    }
    
    public void setisActive(Boolean isActive) {
        this.isActive = isActive;
    }
    

}
