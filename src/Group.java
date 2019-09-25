import java.util.ArrayList;
import java.util.List;

public class Group {

    private String groupName;
    private Teacher teacher;
    private int maxStudents;

    private List<Student> students = new ArrayList<Student>();



    public void addStudent(Student newStudent){
        students.add(newStudent);
    }
    public void addTeacher(Teacher newTeacher){
        this.teacher = newTeacher;
    }
    public String toString (){
        return groupName + String.valueOf(students);//change it you bastard!!!
    }


    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        this.maxStudents = maxStudents;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
