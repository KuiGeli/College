import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        College c = new College();
        Group g = new Group();
        Teacher t;
        Student s;

        Scanner userInput = new Scanner(System.in);

        boolean endlessLoop = true;

        while (endlessLoop) {
            Options.op1();
            String input = userInput.next();

            switch (input) {
                case "a":

                    System.out.println("Please choose a college name");

                    String cName = userInput.next();

                    c = new College(cName);
                    break;

                case "b":

                    System.out.println("Please choose a group name and the maximum number of students.");

                    g = new Group();

                    String input1 = userInput.next();
                    int input2 = userInput.nextInt();

                    g.setMaxStudents(input2);
                    g.setGroupName(input1);
                    break;

                case "c":
                    System.out.println("Please choose the attributes of the teacher");


                    System.out.println("Please input the name of the teacher.");
                    String tName = userInput.next();

                    System.out.println("Please input the speciality the teacher is teaching.");
                    String tSpeciality = userInput.next();

                    System.out.println("Please input the e-mail address of the teacher.");
                    String tEmail = userInput.next();

                    System.out.println("Please input the phone number of the teacher.");
                    String tPhoneNumber = userInput.next();

                    t = new Teacher(tName, tSpeciality, tEmail, tPhoneNumber);

                    g.addTeacher(t);
                    c.addTeacher(t);
                    break;

                case "d":
                    System.out.println("Please choose the attributes of the student");

                    System.out.println("Please input the name of the student");
                    String sName = userInput.next();

                    System.out.println("Please input the e-mail address of the student.");
                    String sEmail = userInput.next();

                    System.out.println("Please input which stage is the student in.");
                    String sStage = userInput.next();

                    System.out.println("Please input the gender of the student");
                    String sGender = userInput.next();

                    System.out.println("Please input the age of the student.");
                    int sAge = userInput.nextInt();

                    s = new Student(sName, sEmail, sStage, sGender, sAge);

                    g.addStudent(s);
                    c.addStudent(s);
                    break;

                case "e":
                    System.out.println(c.getStudents());
                    break;

                case "ee":

                    System.out.println(c.getName());
                    System.out.println(g.getGroupName());

                    endlessLoop = false;
                    break;

                default:
                    System.out.println("Please input a valid answer. Only one character, lowercase.");
                    break;

            }


        }


    }


}
