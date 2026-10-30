import java.util.Scanner;
public class ScreenTimeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        int totalScTime = 0;
        int gameTime = 0;
        int socialTime = 0;
        int studyTime = 0;
        int streamTime = 0;
        int session = 0;
        int studyScTime = 0;


        while(option !=6 ){
            System.out.println("\n======SCREEN-TIME TRACKER======");
            System.out.println("\n1. Add social media time");
            System.out.println("2. Add gaming time");
            System.out.println("3. Add studying time");
            System.out.println("4. Add video or streaming time");
            System.out.println("5. View statistics");
            System.out.println("6. Exit");
            System.out.println("\nChoose an option: ");
            if(sc.hasNextInt()){
                option = sc.nextInt();
            }else {
                System.out.println("Invalid input. Please enter a number.");
                sc.next();
            }
            if(option==1){
                System.out.println("Enter social media minutes: ");
                int socialminutes = sc.nextInt();
                System.out.println("\nTime added successfully");
                socialTime += socialminutes;
                totalScTime += socialminutes;
                session++;
            }else if(option==2){
                System.out.println("Enter gaming minutes: ");
                int gamingminutes = sc.nextInt();
                if(gamingminutes <= 0){
                    System.out.println("Invalid time.Minutes must be greater than 0.");
                }else{
                System.out.println("\nTime added successfully");
                gameTime += gamingminutes;
                totalScTime += gamingminutes;
                session++;}
            }else if(option==3){
                System.out.println("Enter studying minutes: ");
                int studyingminutes = sc.nextInt();
                if(studyingminutes <= 0){
                    System.out.println("Invalid time.Minutes must be greater than 0.");
                }else{
                System.out.println("\nTime added successfully");
                studyScTime+=studyingminutes;
                studyTime += studyingminutes;
                totalScTime += studyingminutes;
                session++;}
            }else if(option==4){
                System.out.println("Enter streaming minutes: ");
                int streamingMinutes = sc.nextInt();
                if(streamingMinutes <= 0){
                    System.out.println("Invalid time.Minutes must be greater than 0.");
                }else{
                System.out.println("\nTime added successfully");
                streamTime += streamingMinutes;
                totalScTime += streamingMinutes;
                session++;}
            }else if(option==5){
                System.out.println("====== TODAY'S SCREEN TIME ======");
                System.out.println("\nSocial media: "+ socialTime);
                System.out.println("Gaming: "+ gameTime);
                System.out.println("Studying: "+ studyTime);
                System.out.println("Streaming: "+ streamTime);
                System.out.println("\nTotal screen time: " + totalScTime );
                System.out.println("Recorded sessions: " + session);
                int entertainmentTime = socialTime + gameTime+ streamTime;
                if(studyScTime > entertainmentTime){
                    System.out.println("\nStudy screen time is greater than entertainment screen time. Good balance!");
                }else if(studyScTime == entertainmentTime){
                    System.out.println("\nStudy and entertainment screen time are equal.");
                }else if(entertainmentTime > studyScTime) {
                    System.out.println("\nEntertainment screen time is greater than study time.");
                }
                if(totalScTime< 120){
                    System.out.println("\nLow screen time.");
                }else if(totalScTime >= 120 && totalScTime < 240){
                    System.out.print("\nModerate screen time!");
                }else {
                    System.out.print("\nHigh screen time!");
                }
            }else if(option==6){
                System.out.print("Screen-time tracker closed.");
            }else{
                System.out.print("Invalid! Enter from 1 to 6");
            }

        }

    }
}