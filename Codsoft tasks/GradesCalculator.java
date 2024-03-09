import java.util.Scanner;

public class GradesCalculator {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        // Input no of subjects and thier marks obtained in each subject
        System.out.println("Enter the number of subjects:");
        int n = kb.nextInt();
        System.out.println("Enter marks obtained (out of 100) in each subject:");
        int[] marks = new int[n];
        int totalMarks = 0;
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = kb.nextInt();
            totalMarks += marks[i];
        }
        
        // Calculate Total Marks
        System.out.println("Total Marks: " + totalMarks);
        
        // Calculate Average Percentage
        double averagePercentage = (double) totalMarks / marks.length;
        System.out.println("Average Percentage: " + averagePercentage + "%");
        
        // Grade Calculation
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade: " + grade);
        
        kb.close();
    }
}
