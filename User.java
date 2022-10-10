import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class User {
    private  String id;
    private String name;
    private String email;
    private String phoneNumber;
    private LocalDate birthDay;
    private Gender gender;
    // hàm khởi tạo không tham số

    public User() {
    }

    public User(String id, String name, String email, String phoneNumber, LocalDate birthDay, Gender gender) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.birthDay = birthDay;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", birthDay=" + birthDay +
                ", gender=" + gender +
                '}';
    }
}
