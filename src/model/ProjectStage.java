package model;

import java.sql.Date;

import javax.print.DocFlavor.STRING;

public class ProjectStage {
 
    private KnowledgeUnit[] capsules;

    public ProjectStage() {
        
        capsules = new KnowledgeUnit[50];

    }

    private int iInitalPlanned;
    private int mInitalPlanned;
    private int yInitialPlanned;
    private int dFinalPlanned;
    private int mFinalPlanned;
    private int yFinalPlanned;
    private int dInitalReal;
    private int mInitialReal;
    private int yInitialReal;
    private int dFinalReal;
    private int mFinalReal;
    private int yFinalReal;
    private int durationMonths;
    private boolean isActive;
    private String nameStage;

//

    public ProjectStage(int iInitalPlanned, int mInitalPlanned, int yInitialPlanned, int dFinalPlanned, int mFinalPlanned, int yFinalPlanned, int dInitalReal, int mInitialReal, int yInitialReal,int dFinalReal, int mFinalReal, int yFinalReal, int durationMonths, boolean isActive,String nameStage){
        

        this.iInitalPlanned = iInitalPlanned;
        this.mInitalPlanned = mInitalPlanned;
        this.yInitialPlanned = yInitialPlanned;
        this.dFinalPlanned = dFinalPlanned;
        this.mFinalPlanned = mFinalPlanned;
        this.yFinalPlanned = yFinalPlanned;
        this.dInitalReal = dInitalReal;
        this.mInitialReal = mInitialReal;
        this.yInitialReal = yInitialReal;
        this.dFinalReal = dFinalReal;
        this.mFinalReal = mFinalReal;
        this.yFinalReal = yFinalReal;
        this.durationMonths = durationMonths;
        this.isActive = isActive;
        this.nameStage = nameStage;
    }
    

    public boolean registerKnowledgeUnit(String id, String description, int type, String learnedLessons) {

		String typeKU = "";

		if (type == 1) {
			typeKU = "Tecnico";
		} else {
			typeKU = "Experiencias";
		}

		KnowledgeUnit newKU = new KnowledgeUnit(id, description, typeKU, learnedLessons);

		for (int i = 0; i < capsules.length; i++) {

			if (capsules[i] == null) {
				capsules[i] = newKU;
				return true;

			}

		}

		return false;
	}

	public String getAllKnwoledgeUnits() {

		String msg = "";

		for (int i = 0; i < capsules.length; i++) {

			if (capsules[i] != null) {
				msg += "\n" + capsules[i].toString() + "\n";
			}

		}

		return msg;

	}

	public int approveKnowledgeUnit(int position, int status) {

		if (status == 1) {

			capsules[position].setStatus("Aprobada");

		} else {
			capsules[position].setStatus("No aprobada");

		}

		return status;

	}

	public String getKnowledgeUnitsList() {

		String msg = "";

		for (int i = 0; i < capsules.length; i++) {

			if (capsules[i] != null) {
				msg += "\n" + (i + 1) + ". " + capsules[i].getId() + " - " + capsules[i].getDescription();
			}

		}

		return msg;

	}
    
    public int getiInitalPlanned() {
        return iInitalPlanned;
    }
    
    public void setiInitalPlanned(int iInitalPlanned) {
        this.iInitalPlanned = iInitalPlanned;
    }
    
    public int getmInitalPlanned() {
        return mInitalPlanned;
    }
    
    public void setmInitalPlanned(int mInitalPlanned) {
        this.mInitalPlanned = mInitalPlanned;
    }
    
    public int getyInitialPlanned() {
        return yInitialPlanned;
    }
    
    public void setyInitialPlanned(int yInitialPlanned) {
        this.yInitialPlanned = yInitialPlanned;
    }
    
    public int getdFinalPlanned() {
        return dFinalPlanned;
    }
    
    public void setdFinalPlanned(int dFinalPlanned) {
        this.dFinalPlanned = dFinalPlanned;
    }
    
    public int getmFinalPlanned() {
        return mFinalPlanned;
    }
    
    public void setmFinalPlanned(int mFinalPlanned) {
        this.mFinalPlanned = mFinalPlanned;
    }
    
    public int getyFinalPlanned() {
        return yFinalPlanned;
    }
    
    public void setyFinalPlanned(int yFinalPlanned) {
        this.yFinalPlanned = yFinalPlanned;
    }
    
    public int getdInitalReal() {
        return dInitalReal;
    }
    
    public void setdInitalReal(int dInitalReal) {
        this.dInitalReal = dInitalReal;
    }
    
    public int getmInitialReal() {
        return mInitialReal;
    }
    
    public void setmInitialReal(int mInitialReal) {
        this.mInitialReal = mInitialReal;
    }
    
    public int getyInitialReal() {
        return yInitialReal;
    }
    
    public void setyInitialReal(int yInitialReal) {
        this.yInitialReal = yInitialReal;
    }
    
    public int getdFinalReal() {
        return dFinalReal;
    }
    
    public void setdFinalReal(int dFinalReal) {
        this.dFinalReal = dFinalReal;
    }
    
    public int getmFinalReal() {
        return mFinalReal;
    }
    
    public void setmFinalReal(int mFinalReal) {
        this.mFinalReal = mFinalReal;
    }
    
    public int getyFinalReal() {
        return yFinalReal;
    }
    
    public void setyFinalReal(int yFinalReal) {
        this.yFinalReal = yFinalReal;
    }
    
    public int getDurationMonths() {
        return durationMonths;
    }
    
    public void setDurationMonths(int durationMonths) {
        this.durationMonths = durationMonths;
    }
    
    public boolean isActive() {
        return isActive;
    }
    
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
    
    public void setmnameStage(String nameStage) {
        this.nameStage = nameStage;
    }
    
    public String getnameStage() {
        return nameStage;
    }

}
