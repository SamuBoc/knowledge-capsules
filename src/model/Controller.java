package model;

import java.util.Calendar;

import javax.swing.text.Position;

import javafx.stage.Stage;

public class Controller {

	private Projects[] project;

	public Controller() {

		project = new Projects[10];

	}

	Calendar now = Calendar.getInstance();

	int actualDay = now.get(Calendar.DAY_OF_MONTH);
	int actualmonth = now.get(Calendar.MONTH) + 1; // El mes comienza en 0, así que se le suma 1 para obtener el mes actual.
	int actualyear = now.get(Calendar.YEAR);

	public boolean addProject(String projectName,String clientName, Double budget, String managName,String greenName,int clientPhone, int greenPhone, int iDay, int iMouth, int iYear, int fDay, int fMouth, int fYear, int durationMonths, int fDayStage, int fMouthStage, int fYearStage) {

		//create object newProject

		Projects newProject = new Projects(projectName, clientName, budget, managName, greenName, clientPhone, greenPhone, iDay, iMouth, iYear, fDay, fMouth, fYear);
	
		//put in null space

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
				
				project[position].getStages()(posicionEtapa);

				}
			}

		return false;
	}

	//public void testCases() {

	//	capsules[0] = new KnowledgeUnit("A001", "Gestion de repositorios", "Tecnico", "GitHub es una herramienta util");
	//	capsules[1] = new KnowledgeUnit("A002", "Gestion de equipos", "Experiencias",
	//			"Es importante definir responsabilidades claras");

	//}

	
}
