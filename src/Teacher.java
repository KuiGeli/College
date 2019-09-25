public class Teacher {

    private String name;
    private String speciality;
    private String email;
    private String phoneNumber;

    public Teacher(String name, String speciality, String email, String phoneNumber) {
        this.name = name;
        this.speciality = speciality;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String toString () {

        return "Name: " + name + " Speciality: " + speciality + " Email address: " + email + " Phone number: " + phoneNumber;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getSpeciality() {

        return speciality;
    }

    public void setSpeciality(String speciality) {

        this.speciality = speciality;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getPhoneNumber() {

        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {

        this.phoneNumber = phoneNumber;
    }
}
