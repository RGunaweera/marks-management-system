import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String options = "[1] Add New Student\n"+
                "[2] Add New Student With Marks\n"+
                "[3] Add Marks\n"+
                "[4] Update Student Details\n"+
                "[5] Update Marks\n"+
                "[6] Delete Student\n"+
                "[7] Print Student Details\n"+
                "[8] Print Student Ranks\n"+
                "[9] Best in Programming Fundamentals\n"+
                "[10] Best in Database Management\n";




        System.out.println("------------------------------------------------------------");
        System.out.println("|         WELCOME TO GDSE MARKS MANAGEMENT SYSTEM          |");
        System.out.println("------------------------------------------------------------");

        while (true){
            System.out.println(options);

            //get user input
            Scanner input = new Scanner(System.in);
            System.out.print("Enter an option to continue: ");
            int option = input.nextInt();

            switch (option){
                case 1:
                    addStudent(input);
                    break;
            }
        }
    }

    public static void addStudent(Scanner input) {

        //create an empty array
        String[] studentID = new String[0];
        //total number of students
        int studentCount = 0;

        while (true) {

            //ask user to enter the student ID
            System.out.println("Enter student ID: ");
            String stID = input.next();

            // Checking whether the entered student ID already exists
            boolean idExists = false;
            for (int i = 0; i < studentCount; i++) {
                if (studentID[i] != null && studentID[i].equals(stID)) {
                    System.out.println("This student ID already exists.");
                    idExists = true;
                    break;
                }
            }
            if (!idExists) {
                // create a new array to store student ID s
                String [] newStudentID = new String [studentID.length + 1];
                for (int i = 0; i < studentID.length; i++){
                    newStudentID[i] = studentID [i];
                }
                //store the new user input to the last index of newStudent array
                newStudentID[newStudentID.length - 1] = stID;
                // making newStudentID array reference the same array as studentID
                studentID = newStudentID;

                //increase student cout by 1
                studentCount++;

                //ask user to enter the student name
                System.out.println("Enter student name: ");
                String stName = input.next();
                System.out.println("Student has been added successfully.");

            }

            System.out.println("Do you want to add another student? (Y/N): ");
            String response = input.next();
            if (response.equals("Y"))
                continue;
            else if (response.equals("N")) {
                break;
            }
        }



    }
}