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

    public College() {
    }

    public void addGroup (Group newGroup){
            groups.add(newGroup);

        }

    public void addStudent (Student newStudent){
        students.add(newStudent);

    }

    public void addTeacher (Teacher newTeacher){
        teachers.add(newTeacher);

    }


        public boolean isStudentDuplicate (String email){
            boolean isIt = false;

            for (Student student: this.students){
                if (student.getEmail().equals(email)){
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
