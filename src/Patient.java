public class Patient {
    int patientId;
    String name;
    int age;
    String symptoms;
    int heartRate;
    double temperature;

    public Patient(int patientId, String name, int age, String symptoms,
                   int heartRate, double temperature) {

        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.symptoms = symptoms;
        this.heartRate = heartRate;
        this.temperature = temperature;
    }

    public void displayPatient() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Patient Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Symptoms: " + symptoms);
        System.out.println("Heart Rate: " + heartRate);
        System.out.println("Temperature: " + temperature);
    }
}