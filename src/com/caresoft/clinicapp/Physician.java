package com.caresoft.clinicapp;

//... imports class definition...
public class Physician extends User implements HIPAACompliantUSER {
    
    // Inside class:    
    private ArrayList<String> patientNotes;
	
    // TO DO: Constructor that takes an ID
    public Physician(Integer id) {
    	
    }
    	
    	
    // TO DO: Implement HIPAACompliantUser!
    public boolean assignPin(int pin) {    	
    }	
   
    public boolean accessAuthorized(Intefer confirmedAuthID) {
    }
    
    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }

	
// TO DO: Setters & Getters

	
	public ArrayList<String> getPatientNotes() {
		return patientNotes;
	}
	
	public void setPatientNotes(ArrayList<String> patientNotes) {
		this.patientNotes = patientNotes;
	}
	
	
	
}