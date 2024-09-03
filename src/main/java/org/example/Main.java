package org.example;

class CyberneticOrgan {
    String id;
    String model;
    String functionality;
    String compatibility;

    // Constructor
    CyberneticOrgan(String id, String model, String functionality, String compatibility) {
        this.id = id;
        this.model = model;
        this.functionality = functionality;
        this.compatibility = compatibility;
    }

    // Getters and Setters
    String getId() { return id; }
    void setId(String id) { this.id = id; }
    String getModel() { return model; }
    void setModel(String model) { this.model = model; }
    String getFunctionality() { return functionality; }
    void setFunctionality(String functionality) { this.functionality = functionality; }
    String getCompatibility() { return compatibility; }
    void setCompatibility(String compatibility) { this.compatibility = compatibility; }

    // Check compatibility
    String isCompatible(String patientCompatibility) {
        if (patientCompatibility.equals(compatibility)) {
            return "yes";
        } else {
            return "no";
        }
    }

    // Display information
    void getDetails(String patientCompatibility) {
        System.out.println("ID: " + id);
        System.out.println("Model: " + model);
        System.out.println("Functionality: " + functionality);
        System.out.println("Compatibility: " + isCompatible(patientCompatibility));
    }
}

class Patient {
    String name;
    String age;
    String medicalHistory;
    String installedOrgans;

    // Constructor
    Patient(String name, String age, String medicalHistory, String installedOrgans) {
        this.name = name;
        this.age = age;
        this.medicalHistory = medicalHistory;
        this.installedOrgans = installedOrgans;
    }
    // Setters and getters
    String getName() { return name; }
        void setName(String name) { this.name = name; }
    String getAge() { return age; }
        void setAge(String age) { this.age = age; }
    String getMedicalHistory() { return medicalHistory; }
        void setMedicalHistory(String medicalHistory) { this.medicalHistory = medicalHistory; }
    String getInstalledOrgans() { return installedOrgans; }
        void setInstalledOrgans(String installedOrgans) { this.installedOrgans = installedOrgans; }

    String addOrgan(String installedOrgans){
        return installedOrgans;
    }

    // Display information
    void getPatientInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Medical History: " + medicalHistory);
        System.out.println("Installed Organs: " + installedOrgans);
    }
}

class OrganInventory {
    CyberneticOrgan[] inventory = new CyberneticOrgan[10];
}

public class Main {
    public static void main(String[] args) {
        CyberneticOrgan organ = new CyberneticOrgan("4a", "Model X", "Enhanced Vision", "34ab");
        organ.getDetails("34ab");
        System.out.println();
        Patient patient = new Patient("John", "35", "healthy", "heart");
        patient.getPatientInfo();
    }
}
