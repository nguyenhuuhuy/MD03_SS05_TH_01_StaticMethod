package StaticMethod;

public class Student {
    private int rollNo;
    private String name;
    private static String college = "BBDTT";

    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    static void change() {
        college = "Xin Chao";
    }

    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }
}
