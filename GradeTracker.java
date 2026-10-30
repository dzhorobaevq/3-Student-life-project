import java.util.Scanner;
public class GradeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        int aspoints = 0;
        int expoints = 0;
        int ascounter = 0;
        int excounter = 0;
        double assignmentAverage = 0;
        double examAverage = 0;
        double overallAverage = 0;

        while(option != 4){
            System.out.println("\n======SEMESTER GRADE TRACKER======");
            System.out.println("\n1. Add assignment result");
            System.out.println("2. Add exam result");
            System.out.println("3. View current grade");
            System.out.println("4. Exit");
            System.out.println("Choose an option: ");

            if(sc.hasNextInt()){
                option = sc.nextInt();
            }else {
                System.out.println("Invalid input. Please enter a number.");
                sc.next();
            }
            if(option==1){
                System.out.println("Enter assignment score: ");
                int score = sc.nextInt();
                if(score >= 0 && score <= 100) {
                    System.out.println("Assignment score added!");
                    aspoints += score;
                    ascounter++;
                }else{
                    System.out.println("Invalid score. Enter a value from 0 to 100.");
                }

            }else if(option==2){
                System.out.println("Enter exam score: ");
                int score = sc.nextInt();
                if(score >= 0 && score <= 100) {
                    System.out.println("Exam score added!");
                    expoints += score;
                    excounter++;
                }else{
                    System.out.println("Invalid score. Enter a value from 0 to 100.");
                }
            }else if(option==3){
                System.out.println("====== CURRENT RESULTS ======");
                if(ascounter==0 && excounter==0){
                    System.out.println("No results available yet.");
                }else{
                    if(ascounter>0){
                        assignmentAverage = aspoints / ascounter;
                    }
                    if(excounter>0){
                        examAverage = expoints / excounter;
                    }
                    if(ascounter>0 && excounter>0){
                        overallAverage = assignmentAverage * 0.50 + examAverage * 0.50;
                    }
                }
                System.out.println("Assignments completed: "+ ascounter);
                System.out.println("Assignment average: "+ aspoints);
                System.out.println("\nExam completed: "+excounter);
                System.out.println("Exam average: "+expoints);
                System.out.println("\nOverall average: "+ overallAverage);
                if(overallAverage>=90 && overallAverage<=100){
                    System.out.println("Grade: A");
                    System.out.println("Status: Passing");
                }else if(overallAverage>=80){
                    System.out.println("Grade: B");
                    System.out.println("Status: Passing");
                }else if(overallAverage>=70){
                    System.out.println("Grade: C");
                    System.out.println("Status: Passing");
                }else if(overallAverage>=60){
                    System.out.println("Grade: D");
                    System.out.println("Status: Passing");
                }else if(overallAverage<60 && overallAverage>0){
                    System.out.println("Grade: F");
                    System.out.println("Status: Falling");
                }else {
                    System.out.println("Invalid with points");
                }
            }else if(option==4){
                System.out.println("Grade tracker closed. Goodbye!");
            }
        }

    }
}




