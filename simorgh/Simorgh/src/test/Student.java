package test;

public class Student {

    private String name;
    private String address;
    private String email;
    private String phoneNumber;
    private String passportNumber;
    private int age;


    //create private constructor

    private Student(final StudentBuilder studentBuilder) {
        name = studentBuilder.name;
        address = studentBuilder.address;
        email = studentBuilder.email;
        phoneNumber = studentBuilder.phoneNumber;
        passportNumber = studentBuilder.passportNumber;
        age = studentBuilder.age;
    }


    @Override
    public String toString() {

        return "Student{" +
                "name=" + name +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", passportNumber='" + passportNumber + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    //inner class for builder class

    public static class StudentBuilder {

        private String name;
        private String address;
        private String email;
        private String phoneNumber;
        private String passportNumber;
        private int age;



        //required field into the constructor builder class

        public StudentBuilder(String name, String address, String email) {
            this.name = name;
            this.address = address;
            this.email = email;
        }


        //optional field create setter method

        public StudentBuilder setPhoneNumber(final String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public StudentBuilder setPassportNumber( final String passportNumber) {
            this.passportNumber = passportNumber;
            return this;
        }

        public StudentBuilder setAge( final int age) {
            this.age = age;
            return this;
        }


        //create or build method

        public Student create() {
            return new Student(this);
        }
    }


}
