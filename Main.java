import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        Teacher teacher = new Teacher();
        User[] users = new User[7];
        for (int i=0;i<2; i++){
                System.out.println("Nhập ID giáo viên " + (i + 1));
                String id = sc.nextLine();
                teacher.setId(id);
                System.out.println("Nhập tên giáo viên " + (i + 1));
                String name = sc.nextLine();
                teacher.setName(name);
                System.out.println("Nhập email giáo viên " + (i + 1));
                String email = sc.nextLine();
                teacher.setName(email);
                System.out.println("Nhập chuyên nghành giáo viên " + (i + 1));
                String speciality = sc.nextLine();
                teacher.setName(speciality);
                System.out.println("Nhập số điện thoại giáo viên " + (i + 1));
                String phoneNumber = sc.nextLine();
                teacher.setName(phoneNumber);
                System.out.println("Nhập ngày tháng năm sinh của giáo viên " + (i + 1));
                String birthDay = sc.nextLine();
                LocalDate bd = LocalDate.parse(birthDay, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                teacher.setBirthDay(bd);
                System.out.println("Nhập kinh nghiệm giáo viên " + (i + 1));
                int yearOfExperiences = sc.nextInt();
                teacher.setYearOfExperiences(yearOfExperiences);
                System.out.println("Chọn giới tính giáo viên " + (i + 1));
                System.out.println("1. Nam , 2. Nữ");
                int gioiTinh = sc.nextInt();
                switch (gioiTinh) {
                    case 1:
                        teacher.setGender(Gender.MALE);
                        break;
                    case 2:
                        teacher.setGender(Gender.FEMALE);
                        break;
                    default:
                        break;
                }

                users[i]= teacher;
                sc.nextLine();
        }
        // nhập dữ liệu học sinh
        for (int i=2;i<7; i++){
            System.out.println("Nhập ID học sinh "+(i-1));
            String id = sc.nextLine();
            student.setId(id);
            System.out.println("Nhập tên học sinh "+(i-1));
            String name = sc.nextLine();
            student.setName(name);
            System.out.println("Nhập email học sinh "+(i-1));
            String email = sc.nextLine();
            student.setName(email);
            System.out.println("Nhập background của học sinh "+(i-1));
            String background = sc.nextLine();
            student.setName(background);
            System.out.println("Nhập số điện thoại học sinh "+(i-1));
            String phoneNumber = sc.nextLine();
            student.setName(phoneNumber);
            System.out.println("Nhập ngày tháng năm sinh của học sinh "+(i-1));
            String birthDay = sc.nextLine();
            LocalDate bd = LocalDate.parse(birthDay, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            student.setBirthDay(bd);
            System.out.println("Chọn giới tính học sinh "+(i-1));
            System.out.println("1. Nam , 2. Nữ");
            int gioiTinh = sc.nextInt();
            switch (gioiTinh) {
                case 1:
                    student.setGender(Gender.MALE);
                    break;
                case 2:
                    student.setGender(Gender.FEMALE);
                    break;
                default:
                    break;
            }

            users[i]= student;
            sc.nextLine();
        }
        for (User user: users){
            System.out.println(teacher.toString());
        }


        
    }
}