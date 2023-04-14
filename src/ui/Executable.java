package ui;

import java.util.Scanner;
import model.Controller;

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

		System.out.println("Bienvenido a KnowledgeUnit");

		boolean flag = false;

		while (!flag) {

			System.out.println("\n1. Registrar capsula de conocimiento");
			System.out.println("2. Aprobar capsula de conocimiento");
			System.out.println("3. Consultar todas las capsulas de conocimiento registradas");
			System.out.println("4. Salir");
			int option = reader.nextInt();

			switch (option) {

			case 1:
				registerKnowledgeUnit();
				break;

			case 2:
				approveKnowledgeUnit();
				break;

			case 3:
				showAllKnowledgeUnits();
				break;

			case 4:
				flag = true;
				break;

			}

		}

	}

	public void registerKnowledgeUnit() {

		System.out.println("Digite a continuacion la informacion de la nueva capsula de conocimiento");

		// Limpieza de buffer
		reader.nextLine();

		System.out.println("Digite el identificador. Ej.: A001");
		String id = reader.nextLine();

		System.out.println("Digite la situacion que desea registrar. Ej.: Aprendizajes en gesion de informacion");
		String descripcion = reader.nextLine();

		System.out.println("Digite el tipo de capsula. \n1. Tecnico \n2. Experiencias");
		int tipo = reader.nextInt();

		// Limpieza de buffer
		reader.nextLine();

		System.out.println("Digite el aprendizaje alcanzado. Ej.: Manejo de SQL");
		String aprendizaje = reader.nextLine();

		if (controller.registerKnowledgeUnit(id, descripcion, tipo, aprendizaje)) {

			System.out.println("Capsula de Conocimiento registrada exitosamente");

		} else {

			System.out.println("Memoria llena, no se pudo registrar la Capsula de Conocimiento");
		}
	}

	public void showAllKnowledgeUnits() {

		System.out.println("Esta es la informacion registrada en el sistema");

		String query = controller.getAllKnwoledgeUnits();

		if (query.equals("")) {

			System.out.println("No hay capsulas registradas");
		} else {
			System.out.println(query);
		}

	}

	private void approveKnowledgeUnit() {

		String query = controller.getKnowledgeUnitsList();

		if (query.equals("")) {

			System.out.println("No hay capsulas registradas");
		} else {

			System.out.println("\nEste es el lisatdo de capsulas registradas en el sistema");

			System.out.println(query);

			System.out.println("\nSeleccione la capsula a aprobar");

			int option = reader.nextInt();

			System.out.println("\nDigite el nuevo status de la capsula\n1. Aprobada \n2. No aprobada");

			int status = reader.nextInt();

			if (controller.approveKnowledgeUnit(option - 1, status) == 1) {

				System.out.println("\nCapsula Aprobada");

			} else {

				System.out.println("\nCapsula No Aprobada");
			}

		}

	}

}