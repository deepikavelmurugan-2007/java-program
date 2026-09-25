import java.util.Random;

public class BMICalculator {

    // Find BMI status
    static String getBmiStatus(double bmi) {
        if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 25)
            return "Normal";
        else if (bmi < 30)
            return "Overweight";
        else
            return "Obese";
    }

    // Print wellness report
    static void printWellnessReport(double[] heights, double[] weights) {

        System.out.println("------------------------------------------------------");
        System.out.printf("%-8s %-12s %-12s %-10s %-15s%n",
                "Person", "Height(m)", "Weight(kg)", "BMI", "Status");
        System.out.println("------------------------------------------------------");

        for (int i = 0; i < heights.length; i++) {

            double bmi = weights[i] / (heights[i] * heights[i]);

            System.out.printf("%-8d %-12.2f %-12.2f %-10.2f %-15s%n",
                    i + 1,
                    heights[i],
                    weights[i],
                    bmi,
                    getBmiStatus(bmi));
        }

        System.out.println("------------------------------------------------------");
    }

    public static void main(String[] args) {

        double[] heights = new double[10];
        double[] weights = new double[10];

        Random random = new Random();

        // Generate random values for 10 people
        for (int i = 0; i < 10; i++) {
            heights[i] = 1.50 + random.nextDouble() * 0.40;
            weights[i] = 50 + random.nextDouble() * 50;
        }

        printWellnessReport(heights, weights);
    }
}