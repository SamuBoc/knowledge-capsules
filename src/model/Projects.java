package model;

import java.sql.Date;

public class Projects {
    
    //name of the project
private String projectName;

//name of the client
private String clientName;

//initial date of the project
private Date initialDate;

//final date of the project
private Date finalDate;

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

    public Projects(String projectName,String clientName, Date initialDate, Date finalDate, Double budget, String managName,String greenName,int clientPhone, int greenPhone){

        this.projectName = projectName;
        this.clientName = clientName;
        this.initialDate = initialDate;
        this.finalDate = finalDate;
        this.budget = budget;
        this.managName = managName;
        this.greenName = greenName;
        this.clientName = clientName;
        this.greenPhone = greenPhone;

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
    
    public Date getInitialDate() {
        return initialDate;
    }
    
    public void setInitialDate(Date initialDate) {
        this.initialDate = initialDate;
    }
    
    public Date getFinalDate() {
        return finalDate;
    }
    
    public void setFinalDate(Date finalDate) {
        this.finalDate = finalDate;
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
    


}
