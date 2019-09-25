import java.util.Scanner;

public class Student {

    private String name;
    private String email;
    private String stage;
    private String gender;
    private int age;


    public Student(String name, String email, String stage, String gender, int age) {
        this.name = name;
        this.email = email;
        this.stage = stage;
        this.gender = gender;
        this.age = age;
    }

    public String toString (){

        return "Name: " + name + " Email address: " + email+ " Stage/Grade: " + stage+ " Gender: " + gender+ "  Age: " + String.valueOf(age);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
