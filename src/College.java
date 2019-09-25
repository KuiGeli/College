import java.util.ArrayList;
import java.util.List;

public class College {

    private String name;

    private List<Group> groups = new ArrayList<Group>();
    private List<Teacher> teachers = new ArrayList<Teacher>();
    private List<Student> students = new ArrayList<Student>();

    public College(String name) {
        this.name = name;
    }

    public void addStudentToGroup(int groupIndex, Student newStudent) {
        groups.get(groupIndex).addStudent(newStudent);

    }


    public void addTeacherToGroup(int groupIndex, Teacher newTeacher) {
        groups.get(groupIndex).addTeacher(newTeacher);


    }

    public void groupList() {

        System.out.println("Pleas type in the number of the selected group.");

        for (int i = 0; i <= groups.size() - 1; i++) {

            System.out.println(i + " " + groups.get(i));
        }

    }

    public void teacherList() {

        System.out.println("Pleas type in the number of the selected teacher.");

        for (int i = 0; i <= teachers.size() - 1; i++) {

            System.out.println(i + " " + teachers.get(i));
        }

    }

    public void studentList() {

        System.out.println("Pleas type in the number of the selected student.");

        for (int i = 0; i <= students.size() - 1; i++) {

            System.out.println(i + " " + students.get(i));
        }

    }

    public void removeStudent (Student student){

        students.remove(student);

    }

    public College() {
    }

    public Teacher getIndividualTeacher (int teacherIndex){

        return teachers.get(teacherIndex);

    }

    public Student getIndividualStudent (int studentIndex){

        return students.get(studentIndex);

    }

    public void test (int i ){
        System.out.println(groups.get(i));
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void addGroup(Group newGroup) {
        groups.add(newGroup);
    }

    public void addStudent(Student newStudent) {
        students.add(newStudent);

    }

    public void addTeacher(Teacher newTeacher) {
        teachers.add(newTeacher);

    }


    public boolean isStudentDuplicate(String email) {
        boolean isIt = false;

        for (Student student : this.students) {
            if (student.getEmail().equals(email)) {
                isIt = true;
                break;
            }
        }

        return isIt;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
