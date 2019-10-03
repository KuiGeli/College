import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();

        System.out.println(now.plusDays(1));

        College c = new College();
        Group g = new Group();
        Teacher t;
        Student s;
        ClassRoom cR;


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

                    String gName = userInput.next();
                    int gMaxStudents = userInput.nextInt();

                    g.setMaxStudents(gMaxStudents);
                    g.setGroupName(gName);
                    c.addGroup(g);
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

                    c.addTeacher(t);
                    break;

                case "d":

                    c.teacherList();

                    int teacherIndex = userInput.nextInt();

                    c.groupList();

                    int groupIndex = userInput.nextInt();

                    c.addTeacherToGroup(groupIndex, c.getIndividualTeacher(teacherIndex));

                    break;

                case "e":
                    System.out.println("Please enter the attributes of the student");

                    System.out.println("Please input the name of the student");
                    String sName = userInput.next();

                    System.out.println("Please input the e-mail address of the student.");
                    String sEmail = userInput.next();

                    System.out.println("Please input which stage is the student in.");
                    String sStage = userInput.next();

                    System.out.println("Please input the gender of the student");
                    char sGender = userInput.next().charAt(0);

                    System.out.println("Please input the age of the student.");
                    while (!userInput.hasNextInt()) {

                        System.out.println("Please only input a number.");
                        userInput.next();
                    }

                    int sAge = userInput.nextInt();

                    s = new Student(sName, sEmail, sStage, sGender, sAge);

                    if (c.getGroups().size() > 1) {

                        c.groupList();

                        int groupIndex1 = userInput.nextInt();

                        c.addStudentToGroup(groupIndex1, s);


                    } else {
                        System.out.println("Note: If there is only one group, the student was automatically added to it.");

                        c.addStudentToGroup(0, s);
                        c.addStudent(s);
                    }
                    break;

                case "f":

                    c.studentList();

                    int studentIndex = userInput.nextInt();

                    c.removeStudent(c.getIndividualStudent(studentIndex));


                    break;

                case "g":

                    System.out.println("Please enter the name of the room.");

                    String roomName = userInput.next();

                    cR = new ClassRoom(roomName);

                    c.addRoom(cR);

                    break;

                case "ee":

                    System.out.println(c.getName());
                    System.out.println(g.getGroupName());
                    c.test(0);

                    endlessLoop = false;
                    break;

                default:
                    System.out.println("Please input a valid answer. Only one character, lowercase.");
                    break;

            }


        }


    }


}