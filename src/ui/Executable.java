package ui;

import java.util.Scanner;

import model.Controller;
import java.util.Date;
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
			System.out.println("4. Salir");
			System.out.println("5. Consultar todas las capsulas de conocimiento registradas");
			
			int option = reader.nextInt();

			switch (option) {

			case 1:
				registerProject();
				break;

			case 2:
				seeProjects();
				break;

			case 3:
				controller.showstages();
				break;

			case 4:
				flag = true;
				break;

			}

		}

	}


	public void registerProject(){
	
		
		System.out.println("\n Enter the project's name:");
		String name = reader.nextLine();
		reader.nextLine(); // Consumir el carácter \n adicional
	
		System.out.println("Type the name of the client:");
		String clientName = reader.nextLine();
		reader.nextLine(); // Consumir el carácter \n adicional

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
		reader.nextLine(); // Consumir el carácter \n adicional

		System.out.println("Type the name of the green leader:");
		String greenName = reader.nextLine();
		reader.nextLine(); // Consumir el carácter \n adicional
		
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


}
