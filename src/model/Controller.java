package model;

public class Controller {

	private KnowledgeUnit[] capsules;

	public Controller() {

		capsules = new KnowledgeUnit[25];
		testCases();

	}

	public void testCases() {

		capsules[0] = new KnowledgeUnit("A001", "Gestion de repositorios", "Tecnico", "GitHub es una herramienta util");
		capsules[1] = new KnowledgeUnit("A002", "Gestion de equipos", "Experiencias",
				"Es importante definir responsabilidades claras");

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

}
