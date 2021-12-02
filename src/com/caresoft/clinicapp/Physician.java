package com.caresoft.clinicapp;

public class Physician extends User implements HIPAACompliantUSER {
//... imports class definition...
    
    // Inside class:    
    private ArrayList<String> patientNotes;
	
    // TO DO: Constructor that takes an ID
    public Physician(Integer id, ArrayList<String> patientNotes) {
    	super(id);
    	
    	
    	// TO DO: Implement HIPAACompliantUser!
    	this.patientNotes = patientNotes;
   public physician()
	
    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }

	
// TO DO: Setters & Getters

	}
	public ArrayList<String> getPatientNotes() {
		return patientNotes;
	}
	
	public void setPatientNotes(ArrayList<String> patientNotes) {
		this.patientNotes = patientNotes;
	}
}