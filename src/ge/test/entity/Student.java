package ge.test.entity;

public  class Student {
        private String firstName;
        private String lastname;
        private int age;
        private int gradeOfHistory;
        private int gradeOfBiology;
        private int gradeOfEnglish;

        public Student(String firstName, String lastname, int age) {
            this.firstName = firstName;
            this.lastname = lastname;
            this.age = age;
        }

        public Student(String firstName, String lastname, int age, int gradeOfHistory, int gradeOfBiology, int gradeOfEnglish) {
            this.firstName = firstName;
            this.lastname = lastname;
            this.age = age;
            this.gradeOfHistory = gradeOfHistory;
            this.gradeOfBiology = gradeOfBiology;
            this.gradeOfEnglish = gradeOfEnglish;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getGradeOfHistory() {
            return gradeOfHistory;
        }

        public void setGradeOfHistory(int gradeOfHistory) {
            this.gradeOfHistory = gradeOfHistory;
        }

        public int getGradeOfBiology() {
            return gradeOfBiology;
        }

        public void setGradeOfBiology(int gradeOfBiology) {
            this.gradeOfBiology = gradeOfBiology;
        }

        public int getGradeOfEnglish() {
            return gradeOfEnglish;
        }

        public void setGradeOfEnglish(int gradeOfEnglish) {
            this.gradeOfEnglish = gradeOfEnglish;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "firstName='" + firstName + '\'' +
                    ", lastname='" + lastname + '\'' +
                    ", age=" + age +
                    ", gradeOfHistory=" + gradeOfHistory +
                    ", gradeOfBiology=" + gradeOfBiology +
                    ", gradeOfEnglish=" + gradeOfEnglish +
                    '}';
        }
    }

