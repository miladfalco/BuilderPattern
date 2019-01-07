package test;

public class Main {

    public static void main(String[] args) {


        Student student = new Student.StudentBuilder("milad", "gorgan", "milad.dasdf@gmail.com")
                .setPhoneNumber("09124536767")
                .setAge(21)
                .setPassportNumber("B64523854")
                .create();
        System.out.println("Student one : " + student.toString());

    }
}
