import java.time.LocalDate;

public class Teacher extends User {
    private int yearOfExperiences;
    private String speciality;

    public Teacher() {
    }

    public Teacher(int yearOfExperiences, String speciality) {
        this.yearOfExperiences = yearOfExperiences;
        this.speciality = speciality;
    }

    public Teacher(String id, String name, String email, String phoneNumber, LocalDate birthDay, Gender gender, int yearOfExperiences, String speciality) {
        super(id, name, email, phoneNumber, birthDay, gender);
        this.yearOfExperiences = yearOfExperiences;
        this.speciality = speciality;
    }

    public int getYearOfExperiences() {
        return yearOfExperiences;
    }

    public void setYearOfExperiences(int yearOfExperiences) {
        this.yearOfExperiences = yearOfExperiences;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "{" +
                "yearOfExperiences=" + yearOfExperiences +
                ", speciality='" + speciality + '\'' +
                '}';
    }
    public String display(){
        return toString() + super.toString();
    }
}