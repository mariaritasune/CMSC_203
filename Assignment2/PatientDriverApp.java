/*
 * Class: CMSC203 
 * Instructor: Professor Grinberg
 * Description: This class displays the patient's personal 
 * information, procedure information and the total charges.
 * Due: 06/28/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Maria Marques
*/

import java.util.Scanner;

public class PatientDriverApp {
	public static void main(String[] args) {
		
	
        // Create a Scanner object for user input
        Scanner keyboard = new Scanner(System.in);
        
        // Prompt user to enter patient information
        System.out.println("Enter patient information:");
        System.out.print("First Name: ");
        String first = keyboard.nextLine();
        System.out.print("Middle Name: ");
        String middle = keyboard.nextLine();
        System.out.print("Last Name: ");
        String last = keyboard.nextLine();
        System.out.print("Street Address: ");
        String address = keyboard.nextLine();
        System.out.print("City: ");
        String city = keyboard.nextLine();
        System.out.print("State: ");
        String state = keyboard.nextLine();
        System.out.print("ZIP Code: ");
        String zipcode = keyboard.nextLine();
        System.out.print("Phone Number (e.g., 301-123-4567): ");
        String phone = keyboard.nextLine();
        System.out.print("Emergency Contact Name: ");
        String emergencyName = keyboard.nextLine();
        System.out.print("Emergency Contact Phone Number: ");
        String emergencyPhone = keyboard.nextLine();
        
        // Patient object
        Patient patient = new Patient(first, middle, last, address, city,
        		state, zipcode, phone, emergencyName, emergencyPhone);
        
        // Create three Procedure objects using different constructors
        Procedure procedure1 = new Procedure("Physical Exam", "07/20/2019", "Dr. Irvine", 3250.0);
        Procedure procedure2 = new Procedure("X-ray", "07/20/2019", "Dr. Jamison", 5500.43 );
        Procedure procedure3 = new Procedure("Blood Test", "07/20/2019", "Dr. Smith", 1400.75);
        
        // Display patient's information
        displayPatient(patient);
        
        // Display information about all three procedures
        displayProcedure(procedure1);
        displayProcedure(procedure2);
        displayProcedure(procedure3);

        // Calculate and display total charges of the three procedures
        double totalCharges = calculateTotalCharges(procedure1, procedure2, procedure3);
        System.out.printf("\nTotal Charges: $%.2f\n", totalCharges);
        
        System.out.print("\nStudent Name: Maria Marques\n");
        System.out.print("MC#: M21168077\n");
        System.out.print("Date: 06/28/2024");
        keyboard.close();
        
        
    }
	
        // Method to display patient's information
        public static void displayPatient(Patient patient) {
            System.out.println("\nPatient Info:");
            System.out.println("Name: " + patient.buildFullName());
            System.out.println("Address: " + patient.buildAddress());
            System.out.println("Emergency Contact: " + patient.buildEmergencyContact());
        }

        // Method to display procedure's information
        public static void displayProcedure(Procedure procedure) {
            System.out.println("\n	Procedure Name = " + procedure.getProcedureName());
            System.out.println("	Procedure Date = " + procedure.getProcedureDate());
            System.out.println("	Practitioner Name = " + procedure.getPractitionerName());
            System.out.printf("	Procedure Charge = $%.2f\n", procedure.getProcedureCharge());   
        }
        
        // Method to calculate total charges of three procedures
        public static double calculateTotalCharges(Procedure procedure1, Procedure procedure2, Procedure procedure3) {
            double totalCharges = procedure1.getProcedureCharge() + procedure2.getProcedureCharge() + procedure3.getProcedureCharge();
            return totalCharges;
            
  
	}
}
