package Exam_B2;

import java.time.Year;
import java.util.Scanner;

public class Student {
    private String studentId;
    private String studentName;
    private int age;
    private String sex;
    private String phone;
    private String address;
    private float html;
    private float css;
    private float javascript;
    private float avgMark;

    public Student() {
    }

    public Student(String studentId, String studentName, int age, String sex, String phone, String address, float html, float css, float javascript) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
        this.phone = phone;
        this.address = address;
        this.html = html;
        this.css = css;
        this.javascript = javascript;
        this.avgMark = (html + css + 2 * javascript) / 4;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getHtml() {
        return html;
    }

    public void setHtml(float html) {
        this.html = html;
    }

    public float getCss() {
        return css;
    }

    public void setCss(float css) {
        this.css = css;
    }

    public float getJavascript() {
        return javascript;
    }

    public void setJavascript(float javascript) {
        this.javascript = javascript;

    }

    public float getAvgMark() {
        return avgMark;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);

//            nhập mã sinh viên
        boolean checkStudentId = true;
        do {
            System.out.print(" Nhập mã sinh viên bắt đầu bằng (RAxxx): ");
            this.studentId = scanner.nextLine();
            if (this.studentId.startsWith("RA")) {
                checkStudentId = false;
            } else {
                System.err.print("Mã sinh viên không hợp lệ. Hãy nhập lại bắt đầu bằng (RAxxx): ");
            }
        } while (checkStudentId);

//        nhập tên
        do {
            System.out.println("Nhập tên sinh viên (từ 20 đến 50 ký tự): ");
            this.studentName = scanner.nextLine();
            if (this.studentName.length() < 10) {
                System.err.println(" Tên sinh viên không hợp lệ ! Hãy nhập lại tên phải từ 10 ký tự : ");
            } else if (this.studentName.length() > 50) {
                System.err.println(" Tên sinh viên không hợp lệ ! Hãy nhập lại tên phải dưới 50 ký tự : ");
            }
        } while (this.studentName.length() < 10 || this.studentName.length() > 50);

        // Nhập tuổi sinh viên
        do {
            System.out.println("Nhập tuổi sinh viên: ");
            age = scanner.nextInt();
            if (age <= 18) {
                System.err.println("Tuổi sinh viên phải lớn hơn 18 !");
            }
        } while (age <= 18);

//        Gới tính sinh viên
        String sex = "";
        while (true) {
            sex = scanner.nextLine().trim();
            if (sex.equalsIgnoreCase("Nam") || sex.equalsIgnoreCase("Nu")) {
                this.sex = sex;
                break;
            } else {
                System.out.print("Nhập giới tính sinh viên là (Nam hoặc Nu): ");
            }
        }

        do {
            System.out.print("Nhập số điện thoại: ");
            phone = scanner.nextLine();
            if (phone.length() != 10 || !phone.startsWith("0")) {
                System.err.println("Số điện thoại không hợp lệ. Chỉ gồm 10 ký tự bắt đầu là ký tự 0.");
            }
        } while (phone.length() != 10 || !phone.startsWith("0"));


//        Nhập địa chỉ
        do {
            System.out.print("Nhập địa chỉ: ");
            address = scanner.nextLine();
            if (address.length() < 1) {
                System.err.println("Địa chỉ không được để trống, Vui lòng nhập lại: ");
            } else if (address.length() > 100) {
                System.err.println("Địa chỉ không được quá 100 ký tự, Vui lòng nhập lại:");
            }
        } while (address.length() < 1 || address.length() > 100);

//            Nhập điểm thi HTML
        do {
            System.out.print("Nhập điểm thi HTML (từ 0 đến 10): ");
            html = scanner.nextFloat();
            if (html < 0 || html > 10) {
                System.err.println("Điểm thi HTML phải nằm trong khoảng từ 0 đến 10!");
            }
        } while (html < 0 || html > 10);

//             Nhập điểm thi CSS
        do {
            System.out.print("Nhập điểm thi CSS (từ 0 đến 10): ");
            css = scanner.nextFloat();
            if (css < 0 || css > 10) {
                System.err.println("Điểm thi CSS phải nằm trong khoảng từ 0 đến 10!");
            }
        } while (css < 0 || css > 10);

//            Nhập điểm thi JavaScript
        do {
            System.out.print("Nhập điểm thi JavaScript (từ 0 đến 10): ");
            javascript = scanner.nextFloat();
            if (javascript < 0 || javascript > 10) {
                System.err.println("Điểm thi JavaScript phải nằm trong khoảng từ 0 đến 10!");
            }
        } while (javascript < 0 || javascript > 10);

    }

    public void displayData() {
        int day = Year.now().getValue();
        System.out.printf("%s%-20s%s%s", "Mã sinh viên: ", studentId, "Tên sinh viên: ", studentName);
        System.out.printf("%s%-24d%s%-20s%s%s", "\nNăm sinh: ", (day - age), "Giới tính: ", sex, "Điện thoại: ", phone);
        System.out.printf("%s%-56s%s%f", "\nĐịa chỉ: ", address, "Điểm Trung Bình: ", avgMark());

    }

    public float avgMark() {
        return (html + css + 2 * javascript) / 4;
    }
}
