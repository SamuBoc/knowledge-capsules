package model;

import java.util.Calendar;

public class Controller {

	private Projects[] project;

	public Controller() {

		project = new Projects[10];

	}

	public boolean addProject(String projectName,String clientName, Double budget, String managName,String greenName,int clientPhone, int greenPhone, int iDay, int iMouth, int iYear, int fDay, int fMouth, int fYear) {
		Projects newProject = new Projects(projectName, clientName, budget, managName, greenName, clientPhone, greenPhone, iDay, iMouth, iYear, fDay, fMouth, fYear);
	
		for (int i = 0; i < project.length; i++) {
			if (project[i] == null) {
				project[i] = newProject;
				
				Projects.c

				return true;
			}
		}
	
		
		return false;
	}
	
	public boolean approved(int dFinal, int mfinal, int yfinal, int iActual, int dActual, int mActual, int yActual,int durationMonths, boolean newProject) {
		
		Projects.

		return false;
	}

	//public void testCases() {

	//	capsules[0] = new KnowledgeUnit("A001", "Gestion de repositorios", "Tecnico", "GitHub es una herramienta util");
	//	capsules[1] = new KnowledgeUnit("A002", "Gestion de equipos", "Experiencias",
	//			"Es importante definir responsabilidades claras");

	//}

	
}
