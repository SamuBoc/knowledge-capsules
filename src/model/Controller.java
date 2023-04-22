package model;

import java.util.Calendar;

import javax.sound.midi.SysexMessage;
import javax.swing.text.Position;

import javafx.stage.Stage;

public class Controller {

	private Projects[] project;

	public Controller() {

		project = new Projects[10];

	}

	Calendar now = Calendar.getInstance();

	int actualDay = now.get(Calendar.DAY_OF_MONTH);
	int actualmonth = now.get(Calendar.MONTH) + 1; // El mes comienza en 0, así que se le suma 1 para obtener el mes
													// actual.
	int actualyear = now.get(Calendar.YEAR);

	public boolean addProject(String projectName, String clientName, Double budget, String managName, String greenName,
			int clientPhone, int greenPhone, int iDay, int iMouth, int iYear, int fDay, int fMouth, int fYear,
			int durationMonths, int fDayStage, int fMouthStage, int fYearStage) {

		// create object newProject

		Projects newProject = new Projects(projectName, clientName, budget, managName, greenName, clientPhone,
				greenPhone, iDay, iMouth, iYear, fDay, fMouth, fYear);

		// put in null space

		for (int i = 0; i < project.length; i++) {
			if (project[i] == null) {
				project[i] = newProject;
				return true;
			}
		}

		int position = 0;

		approved(fDayStage, fMouthStage, fYearStage, iDay, iMouth, iYear, durationMonths, fDay, fMouth, fYear, iDay, iMouth, iYear, false, position);

		return false;
	}

	public boolean approved(int dFinalPlanned, int mFinalPlanned, int yFinalPlanned, int iDAyplaneed, int iMouthPlaneed, int iYearPlaneed, int durationMonths, int dFinalReal, int mFinalReal, int yFinalReal, int dInitalReal, int mInitialReal, int yInitialReal, boolean isActive, int position ) {
		
		position = position - 1;

			if(position >= 0 &&  position<project.length){
				
				
				}
			

	return false;
}

	public boolean seeProjects(){

		for(int i = 0; i < project.length; i++){

			if (project[i] != null) {
			System.out.println((i+1) + "-" + project[i].getProjectName());
		
		}
		}

		return false;
	}
	public String showstages(){
		//1. proyecto
		// etapa: 
		String msg = "no";

		for(int i = 0; i <project.length; i++){
		if (project[i] != null){

		msg = "\n" + i+1 + project[i].getProjectName() + " \n Stage: " + project[i].showActive();
		return msg = "hola";		
	}

	}
		return msg = "nada mano";
	}

	public void testProject(){

		project[0]= new Projects("Prueba 1", "Laura", 876.888, "Juan", "Samu", 313, 666648, actualDay, actualmonth, actualyear, actualDay, actualDay, actualyear);

		project[1]= new Projects("Prueba 2", "Mario", 6.88, "Camilo", "Carlos", 3531, 888, actualDay, actualmonth, actualyear, actualDay, actualDay, actualyear);

	}

}
