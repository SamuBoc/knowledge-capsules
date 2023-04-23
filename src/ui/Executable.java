package ui;

import java.util.Scanner;

import model.Controller;
import java.util.Date;
import java.nio.channels.ReadPendingException;
import java.text.ParseException;


public class Executable {

	private Scanner reader;
	private Controller controller;

	public Executable() {

		reader = new Scanner(System.in);
		controller = new Controller();
	}


	public static void main(String[] args) {

		Executable ejecutable = new Executable();
		ejecutable.menu();

	}

	public void menu() {

		controller.testProject();

		System.out.println("Bienvenido a KnowledgeUnit");

		boolean flag = false;

		while (!flag) {

			System.out.println("\n1. Register project");
			System.out.println("2. Shows all projects");
			System.out.println("3. Next Stage");
			System.out.println("4. Register knowledge capsule");
			System.out.println("5. Approve knowledge capsule");
			System.out.println("6. Consultar todas las capsulas de conocimiento registradas");
			
			int option = reader.nextInt();

			switch (option) {

			case 1:
				registerProject();
				break;

			case 2:
				infoProjects();
				break;

			case 3:
				nextStage();
				break;

			case 4:
				registerKnowledgeUnit();
				break;
			
			case 5:
				approveKnowledgeUnit();
				break;

			case 6:
			flag = true;
			

			}

		}

	}


	public void registerProject(){
	
		
		System.out.println("\n Enter the project's name:");
		String name = reader.nextLine();
		reader.nextLine(); // Consumir el carácter \n adicional
	
		System.out.println("Type the name of the client:");
		String clientName = reader.nextLine();
		

		System.out.println("Type the initial day (dd):");
		int iDay = reader.nextInt();
		reader.nextLine(); // Consumir el carácter \n adicional
		System.out.println("Type the initial mouth  (MM):");
		int iMouth = reader.nextInt();
		reader.nextLine(); // Consumir el carácter \n adicional
		System.out.println("Type the initial year (yyyy):");
		int iYear = reader.nextInt();
		reader.nextLine(); // Consumir el carácter \n adicional

		System.out.println("Type the final day (dd):");
		int fDay = reader.nextInt();
		reader.nextLine(); // Consumir el carácter \n adicional
		System.out.println("Type the final mouth (MM):");
		int fMouth = reader.nextInt();
		reader.nextLine(); // Consumir el carácter \n adicional
		
		System.out.println("Type the final year (yyyy):");
		int fYear = reader.nextInt();
		reader.nextLine(); // Consumir el carácter \n adicional
		
		System.out.println("Type the budget of the project:");
		Double budget = reader.nextDouble();
		reader.nextLine(); // Consumir el carácter \n adicional
		
		System.out.println("Type the name of the project manager:");
		String managName = reader.nextLine();
		

		System.out.println("Type the name of the green leader:");
		String greenName = reader.nextLine();
		
		
		System.out.println("Type the client phone number:");
		int clientPhone = reader.nextInt();
		reader.nextLine(); // Consumir el carácter \n adicional

		System.out.println("Type the green leader phone number:");
		int greenPhone = reader.nextInt();
		reader.nextLine(); // Consumir el carácter \n adicional

		//Question of create the new stage(initial)

		System.out.print("What is the estimated number of months for the first stage?");
		int durationMonths = reader.nextInt();
		reader.nextLine(); // Consumir el carácter \n adicional

		System.out.println("Type the final day estimated(dd):");
		int fDayStage = reader.nextInt();
		reader.nextLine(); // Consumir el carácter \n adicional

		System.out.println("Type the final mouth estimated(MM):");
		int fMouthStage = reader.nextInt();
		reader.nextLine(); // Consumir el carácter \n adicional

		System.out.println("Type the final year estimated(yyyy):");
		int fYearStage = reader.nextInt();
		reader.nextLine(); // Consumir el carácter \n adicional

		if (controller.addProject(name, clientName, budget, managName, greenName, clientPhone, greenPhone, iDay, iMouth, iYear, fDay, fMouth, fYear, durationMonths, fDayStage, fMouthStage, fYearStage)) {
		System.out.println("Project added successfully!");
		} else {
    	System.out.println("Could not add project. Project list is full.");
		}
	}

	public void seeProjects(){

		controller.seeProjects();

	}

	public void infoProjects(){
		controller.showstages();
	}

	public void nextStage(){

		infoProjects();
		System.out.println("Which project would you like to move on to the next stage?");
		int position = reader.nextInt();
		System.out.println("Then enter the data for the planned completion date");
		System.out.println("Day(dd)");
		int day = reader.nextInt();
		System.out.println("Month(MM)");
		int month = reader.nextInt();
		System.out.println("Year(yyyy)");
		int year = reader.nextInt();
		System.out.println("How many months can the project last?");
		int monthsPlanned = reader.nextInt();

		if(controller.approved(position, day, month, year, monthsPlanned)){
			System.out.println("In the project (" + position + ")the next stage was registered ! :D");
		}else{
			System.out.println("There was a problem");
		}

	}

	public void registerKnowledgeUnit(){

		infoProjects();
		System.out.println("\n Which project would you like to register a new capsule for?");
		int position = reader.nextInt();
		position--;
		System.out.println("You will then be asked about the characteristics of the capsule. \n");
		System.out.println("type of capsule: \n 1.TECHNICIAN  \n 2.GESTION \n 3.DOMAIN \n 4. EXPERIENCES");
		int capsuleType = reader.nextInt();
		System.out.println("identifier: ");
		String id = reader.nextLine();
		System.out.println("author's name: ");
		String authorName = reader.nextLine();
		System.out.println("descripcion: ");
		String descripcion = reader.nextLine();
		System.out.println("what is the lesson learned?");
		String lessonKnow = reader.nextLine(); 
		System.out.println("what is the charge author's?");
		String chargeAuthors = reader.nextLine(); 
		
		if(controller.registerKnowledgeUnit(position, capsuleType, id, authorName, descripcion, lessonKnow, chargeAuthors)){

			System.out.println("\n knowledge capsule has been created :D!");
		}else{
			System.out.println("There was a problem :(");
		}

	}

	public void approveKnowledgeUnit(){

		infoProjects();
   	    System.out.println("\n which project would you like to approve the capsule for? "); 
		 int position = reader.nextInt();
 		controller.showKnowledge(position, 0);
		
		System.out.println("select the capsule to approve") ;	
		int capsulePosition = reader.nextInt();
		
		System.out.println("");
		controller.approvedKnowledge(position, capsulePosition);

		System.out.println("the knowledge capsule has been approved :D !");
		
		System.out.println("an error has occurred :(");

	}

	public void infoKnowledge(){

		

	}

}
