package model;

import java.util.Calendar;

import javax.sound.midi.SysexMessage;
import javax.swing.text.Position;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javafx.beans.binding.When.BooleanConditionBuilder;
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

		position--;

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

	public boolean showKnowledge(int position, int capsulePosition){

		position--;



		if(project[position].showCapsul(capsulePosition)){
			return true;
		}

		return false;
	}

	public boolean showstages(){
		
		for(int i = 0; i <project.length; i++){
		if (project[i] != null){

		System.out.println("\n" + (i+1) + "- " + project[i].getProjectName() + " \n Stage: " + project[i].showActive());
			
			}
		}
		
		return true;
	}

	public boolean registerKnowledgeUnit(int position, int capsuleType, String id, String authorName, String descripcion, String lessonKnow, String chargeAuthors){

		position = position - 1;

		if(position < 0){
			position++; 
		}else{

		project[position].registerKnowledgeUnitProject(id, descripcion, capsuleType,authorName, lessonKnow, chargeAuthors);
				return true;
		}
		
		return false;
	}

	public void testProject(){

		//Projects(projectName, clientName, budget, managName, greenName, clientPhone, greenPhone, initialPlanned,finalPlanned, durationMonths, finalStage);
		Calendar initialPlanned = new GregorianCalendar(2000, 10-1, 04);
     	Calendar initialFinal = new GregorianCalendar(2005, 11-1, 04);    
        Calendar finalStage = new GregorianCalendar(2001, 6-1, 04);
		project[0]= new Projects("Prueba 1", "Jhon", 3232.2, "Logan", "Juan", 30056789, 43433, initialPlanned, initialFinal, 28, finalStage);

		registerKnowledgeUnit(0, 2, "ssa", "Patricio", "Esta capsula sirve para muchas cosas #importantes# porque almacena #ideas#", "la leccion que aprendi es #no decir cosas malas# porque estas pueden meterme en problemas", "Jefe");

		registerKnowledgeUnit(1, 2, "nnt", "Kevin", "El proceso de desarrollo de las aplicaciones tiene #metodos en cada clase#, claro en general esto se usa bien, pero hay maneras de no usarse bien", "Por ende aprendi que #es importnate saber sobre diagramas de clase#", "Npc");

		
		Calendar initialPlanned2 = new GregorianCalendar(2023, 5-1, 1);
		Calendar initialFinal2 = new GregorianCalendar(2023, 6-1, 30);
		Calendar finalStage2 = new GregorianCalendar(202, 6-1, 30);
		project[1] = new Projects("Prueba 2", "Mario", 6.88, "Camilo", "Carlos", 3531, 888, initialPlanned2, initialFinal2, 10, finalStage2);

	}

	public boolean approvedKnowledge(int position, int stage){

		if(project[position] != null){

			project[position].getProjectStages();

		}

		return false;
	}

}
