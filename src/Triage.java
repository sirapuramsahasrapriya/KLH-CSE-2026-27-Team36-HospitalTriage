public class Triage {
    public String calculatePriority(double temperature, int heartRate) {
        if (heartRate >= 120 || temperature >= 39.0) {
            return "high";
        } 
        else if (heartRate >= 100 || temperature >= 37.5) {
            return "medium";
        } 
        else {
            return "low";
        }
    }
    public void displayTriage(double temperature, int heartRate) {
        String priority = calculatePriority(temperature, heartRate);
        System.out.println("Temperature: " + temperature);
        System.out.println(" heart rate: " + heartRate);
        System.out.println("Triage Priority: " + priority);
    }
}
