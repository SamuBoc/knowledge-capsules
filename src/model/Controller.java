package model;

import java.util.Calendar;

import javax.sound.midi.SysexMessage;
import javax.swing.text.Position;
import java.util.Calendar;
import java.util.GregorianCalendar;

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

		//format gregorian calender
		Calendar initialPlanned = new GregorianCalendar(iYear, iMouth-1, iDay);
		Calendar finalPlanned = new GregorianCalendar(fYear, fMouth-1, fDay);
		Calendar finalStage = new GregorianCalendar(fYearStage, fMouthStage-1, fDayStage);
		
			
		// create object newProject

		Projects newProject = new Projects(projectName, clientName, budget, managName, greenName, clientPhone, greenPhone, initialPlanned,finalPlanned, durationMonths, finalStage);

		// put in null space

		for (int i = 0; i < project.length; i++) {
			if (project[i] == null) {
				project[i] = newProject;
				return true;
			}
		}

		return false;
	}

	public boolean approved(int position, int fDay, int fMouth, int fYear, int monthsPlanned) {
		
		Calendar finalPlanned = new GregorianCalendar(fYear, fMouth-1, fDay);

		if(position < 0){
			position++; 
		}

		if(project[position] == null){

			System.out.println("it is not possible to choose that value");

		}else{

			project[position].CulminateStage(finalPlanned, monthsPlanned);
			return true;

		}

	return false;
}

	public boolean seeProjects(){

		for(int i = 0; i < project.length; i++){

			if (project[i] != null) {
			System.out.println((i+1) + "- " + project[i].getProjectName());
		
		}
		}

		return false;
	}

	public boolean showstages(){
		
		//1. proyecto
		// etapa: 
		
		for(int i = 0; i <project.length; i++){
		if (project[i] != null){

		System.out.println("\n" + (i+1) + "- " + project[i].getProjectName() + " \n Stage: " + project[i].showActive());
				
	}

	}
		
		return true;
	}




	public void testProject(){

		//Projects(projectName, clientName, budget, managName, greenName, clientPhone, greenPhone, initialPlanned,finalPlanned, durationMonths, finalStage);
		Calendar initialPlanned = new GregorianCalendar(2000, 10-1, 04);
     	Calendar initialFinal = new GregorianCalendar(2005, 11-1, 04);    
        Calendar finalStage = new GregorianCalendar(2001, 6-1, 04);
		project[0]= new Projects("Prueba 1", "Jhon", 3232.2, "Logan", "Juan", 30056789, 43433, initialPlanned, initialFinal, 28, finalStage);
		
		Calendar initialPlanned2 = new GregorianCalendar(2023, 5-1, 1);
		Calendar initialFinal2 = new GregorianCalendar(2023, 6-1, 30);
		Calendar finalStage2 = new GregorianCalendar(202, 6-1, 30);
		project[1] = new Projects("Prueba 2", "Mario", 6.88, "Camilo", "Carlos", 3531, 888, initialPlanned2, initialFinal2, 10, finalStage2);

	}


}
