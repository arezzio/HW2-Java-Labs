import java.util.Scanner;

public class CaloriesBurned {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        int age;
        int weight;
        int heartRate;
        int time;
        
        age = scnr.nextInt();
        weight = scnr.nextInt();
        heartRate = scnr.nextInt();
        time = scnr.nextInt();
        
        double calories;
        
        calories = (((age * 0.2757) + (weight * 0.03295) + (heartRate * 1.0781) - 75.4991) * time) / 8.368;
        
        System.out.printf("Calories: %.2f calories\n", calories);
        
        scnr.close();
    }
}
