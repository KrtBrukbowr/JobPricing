import java.util.Scanner;
/**
 * JobPricing
 */
public class JobPricing {

    public static void main(String[] args) {
        // Variables and Constants
        String jobName;
        double mtrlCost;
        double hrsToFnshJb;
        double hrsTrvl;

        // Objects
        Scanner kbd = new Scanner(System.in);
       NewJobEstimate newJob = new NewJobEstimate();

        // Input phase
        System.out.println("");
        System.out.print("Enter Job name >> ");
        jobName = kbd.nextLine();

        System.out.print("Enter Material cost >> $");
        mtrlCost = kbd.nextDouble();

        System.out.print("Enter estimated number of hours to complete job >> ");
        hrsToFnshJb = kbd.nextDouble();

        System.out.print("Enter number of travel hours TO jobsite >> ");
        hrsTrvl = kbd.nextDouble();
        System.out.println("");

        // Calculation phase using NJE.java class methods
        newJob.enterName(jobName);
        newJob.setTotal(mtrlCost, hrsToFnshJb, hrsTrvl);
        
        // Output new job estimate details to user
        newJob.summary();
    }
}
