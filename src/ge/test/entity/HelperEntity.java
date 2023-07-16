package ge.test.entity;

public class HelperEntity {
    private String fullName;
    private int age;
    private int gradeOfHistory;
    private int gradeOfBiology;
    private int gradeOfEnglish;

    public HelperEntity() {
    }

    public HelperEntity(String fullName, int age, int gradeOfHistory, int gradeOfBiology, int gradeOfEnglish) {
        this.fullName = fullName;
        this.age = age;
        this.gradeOfHistory = gradeOfHistory;
        this.gradeOfBiology = gradeOfBiology;
        this.gradeOfEnglish = gradeOfEnglish;
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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
        return "HelperEntity{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", gradeOfHistory=" + gradeOfHistory +
                ", gradeOfBiology=" + gradeOfBiology +
                ", gradeOfEnglish=" + gradeOfEnglish +
                '}';
    }
}
