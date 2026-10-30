import java.util.Scanner;
public class StudyTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        int weeklyGoal = 600;
        int programming = 0;
        int mathematic = 0;
        int english = 0;
        int other = 0;
        int totaltime = 0;
        int sessions = 0;
        boolean running = true;

        while(option != 4){while(running) {
            System.out.println("\n======STUDY TRACKER======");
            System.out.println("1. Add study seesion");
            System.out.println("2. View statistics");
            System.out.println("3. Check weekly goal");
            System.out.println("4. Exit");
            System.out.println("\nChoose an option:");
            if (sc.hasNextInt()) {
                option = sc.nextInt();
            } else {
                System.out.println("Invalid input. Please enter a number.");
                sc.next();
            }
            if (option == 1) {
                System.out.println("Choose subject:");
                System.out.println("1. Programming");
                System.out.println("2. Mathematic");
                System.out.println("3. English");
                System.out.println("4. Other");
                System.out.println("\nChoose an option");
                int sub = sc.nextInt();
                if (sub >= 1 && sub <= 4) {
                    System.out.println("Study time in minutes: ");
                    int minutes = sc.nextInt();
                    if (sub == 1) {
                        programming += minutes;
                    } else if (sub == 2) {
                        mathematic += minutes;
                    } else if (sub == 3) {
                        english += minutes;
                    } else if (sub == 4) {
                        other += minutes;
                    }
                    System.out.println("Study session added!");
                    System.out.println("Current total study time: " + minutes + " minutes");
                    totaltime += minutes;
                    sessions++;
                } else {
                    System.out.println("Invalid study time. Time must be greater than 0.");
                }

            } else if (option == 2) {
                System.out.println("Study sessions: " + sessions);
                System.out.println("Total study time: " + totaltime + " minutes");
                System.out.println("\nProgramming: " + programming + " minutes");
                System.out.println("Mathematics:" + mathematic + " minutes");
                System.out.println("English: " + english + " minutes");
                System.out.println("Other: " + other + " minutes");
            } else if (option == 3) {
                System.out.println("Weekly goal: " + weeklyGoal + " minutes");
                System.out.println("You studied: " + totaltime + " minutes");
                if (totaltime >= weeklyGoal) {
                    System.out.println("Weekly goal achieved!");
                } else {
                    System.out.println("Remaining: " + (weeklyGoal -= totaltime) + " minutes");
                }
            }
            else if (option == 4) {
                System.out.println("Studytracker closed. Keep up the good work!");
                running = false;
            }
        }
        }

    }
}






