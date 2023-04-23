package model;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.print.DocFlavor.STRING;

public class ProjectStage {
 
    
    private KnowledgeUnit[] capsules;


    private Calendar initialPlanned;
    private Calendar finalPlanned;
    private Calendar initialReal;
    private Calendar finalReal;
    private DateFormat formatter;
    private int durationMonths;
    private boolean isActive;
    private String nameStage;

    Calendar now = Calendar.getInstance();
    int actualDay = now.get(Calendar.DAY_OF_MONTH);
	int actualmonth = now.get(Calendar.MONTH) + 1;
    int actualyear = now.get(Calendar.YEAR);
    Calendar actualDate = new GregorianCalendar(actualyear, actualmonth-1, actualDay);

    public ProjectStage(Calendar initialPlanned, Calendar finalPlanned, Calendar initialReal, int durationMonths, boolean isActive,String nameStage){

        
        this.formatter = new SimpleDateFormat("dd/MM/yy");
        this.initialPlanned = initialPlanned;
		this.finalPlanned = finalPlanned;
		this.initialReal = null;
		this.finalReal = null;
        this.durationMonths = durationMonths;
        this.isActive = isActive;
        this.nameStage = nameStage;
        capsules = new KnowledgeUnit[50];
    }
    

    public boolean registerNewKnowledgeUnit(String id, String description, int typeknowledge, String nameAuthor, String learnedLessons, String chargeAuthor) {


        // public KnowledgeUnit(String id, String description, int typeknowledge, String nameAuthor, String learnedLessons, String chargeAuthor) {



		KnowledgeUnit newKU = new KnowledgeUnit(id, description, typeknowledge, nameAuthor, description, nameAuthor);

		for (int i = 0; i < 50; i++) {
            if (capsules[i] == null) {
                 
                capsules[i] = newKU;
                System.out.println("hola");
            return true;    
            
            }

        }

		return false;
	}

    public String setHashtag(String input) {
        String[] parts = input.split("##");
        StringBuilder hashtagBuilder = new StringBuilder();
        for (String part : parts) {
            if (part.startsWith("#")) {
                if (hashtagBuilder.length() > 0) {
                    hashtagBuilder.append(", ");
                }
                hashtagBuilder.append(part);
            }
        }
        input = hashtagBuilder.toString();

        return input;
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


	public String getKnowledgeUnitsList() {

		String msg = "";

		for (int i = 0; i < capsules.length; i++) {

			if (capsules[i] != null) {
				msg += "\n" + (i + 1) + ". " + capsules[i].getId() + " - " + capsules[i].getDescription();
			}

		}

		return msg;

	}
    
	

//	public void registerKnowledgeUnit() {
//	
//	System.out.println("Digite a continuacion la informacion de la nueva capsula de conocimiento");
//	
//		// Limpieza de buffer
//		reader.nextLine();
//
//		System.out.println("Digite el identificador. Ej.: A001");
//		String id = reader.nextLine();
//
//		System.out.println("Digite la situacion que desea registrar. Ej.: Aprendizajes en gesion de informacion");
//		String descripcion = reader.nextLine();
//
//		System.out.println("Digite el tipo de capsula. \n1. Tecnico \n2. Experiencias");
//		int tipo = reader.nextInt();
//
//		// Limpieza de buffer
//		reader.nextLine();
//
//		System.out.println("Digite el aprendizaje alcanzado. Ej.: Manejo de SQL");
//		String aprendizaje = reader.nextLine();
//
//		if (controller.registerKnowledgeUnit(id, descripcion, tipo, aprendizaje)) {
//
//			System.out.println("Capsula de Conocimiento registrada exitosamente");
//
//		} else {
//
//			System.out.println("Memoria llena, no se pudo registrar la Capsula de Conocimiento");
//		}
//	}
//
//	public void showAllKnowledgeUnits() {
//
//		System.out.println("Esta es la informacion registrada en el sistema");
//
//		String query = controller.getAllKnwoledgeUnits();
//
//		if (query.equals("")) {
//
//			System.out.println("No hay capsulas registradas");
//		} else {
//			System.out.println(query);
//		}
//
//	}
//
//	private void approveKnowledgeUnit() {
//
//		String query = controller.getKnowledgeUnitsList();
//
//		if (query.equals("")) {
//
//			System.out.println("No hay capsulas registradas");
//		} else {
//
//			System.out.println("\nEste es el lisatdo de capsulas registradas en el sistema");
//
//			System.out.println(query);
//
//			System.out.println("\nSeleccione la capsula a aprobar");
//
//			int option = reader.nextInt();
//
//			System.out.println("\nDigite el nuevo status de la capsula\n1. Aprobada \n2. No aprobada");
//
//			int status = reader.nextInt();
//
//			if (controller.approveKnowledgeUnit(option - 1, status) == 1) {
//
//				System.out.println("\nCapsula Aprobada");
//
//			} else {
//
//				System.out.println("\nCapsula No Aprobada");
//			}
//
//		}
//
//	}
//

   
public String getInitialRealFormated() throws ParseException{
		return formatter.format(this.initialReal.getTime()); 
	}


	public String getFinalRealFormated() throws ParseException{
		return formatter.format(this.finalReal.getTime());
	}

	public String getInitialPlannedFormated() throws ParseException{
		return formatter.format(this.initialPlanned.getTime());
	}


	public String getFinalDatePFormated() throws ParseException{
		return formatter.format(this.finalPlanned.getTime());
	}
    public Calendar getInitialPlanned() {
		return initialPlanned;
	}

	public void setInitialDateP(Calendar initialPlanned) {
		this.initialPlanned = initialPlanned;
	}

	public Calendar getFinalPlanned() {
		return finalPlanned;
	}

	public void setFinalPlanned(Calendar finalPlanned) {
		this.finalPlanned = finalPlanned;
	}

	public Calendar getInitialReal() {
		return initialReal;
	}

	public void setInitialReal(Calendar initialReal) {
		this.initialReal = initialReal;
	}

	public Calendar getFinalReal() {
		return finalReal;
	}

	public void setFinalReal(Calendar finalReal) {
		this.finalReal = finalReal;
	}
    
    public int getDurationMonths() {
        return durationMonths;
    }
    
    public void setDurationMonths(int durationMonths) {
        this.durationMonths = durationMonths;
    }
    
    public boolean getisActive() {
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
