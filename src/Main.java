public class Main {
    public static void main(String[] args) {
        String projectName = "The epic time logger";
        byte startTime = 0; //Currently a placeholder, sooner or later it can be any number
        byte endTime = 60; //Same thing here
        System.out.println(projectName);
        int duration = endTime - startTime; //This variable calculates the difference of your start and end time in mins
        System.out.println(duration);
    }
}