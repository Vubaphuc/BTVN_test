import java.time.LocalDate;

public class Student extends User {
    private String background;
    private boolean isOnline;

    public Student() {
    }

    public Student(String background, boolean isOnline) {
        this.background = background;
        this.isOnline = isOnline;
    }

    public Student(String id, String name, String email, String phoneNumber, LocalDate birthDay, Gender gender, String background, boolean isOnline) {
        super(id, name, email, phoneNumber, birthDay, gender);
        this.background = background;
        this.isOnline = isOnline;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "{" +
                "background='" + background + '\'' +
                ", isOnline=" + isOnline +
                '}';
    }
}

