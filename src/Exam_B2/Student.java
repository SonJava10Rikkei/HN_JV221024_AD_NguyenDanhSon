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

//            nh???p m?? sinh vi??n
        boolean checkStudentId = true;
        do {
            System.out.print(" Nh???p m?? sinh vi??n b???t ?????u b???ng (RAxxx): ");
            this.studentId = scanner.nextLine();
            if (this.studentId.startsWith("RA")) {
                checkStudentId = false;
            } else {
                System.err.print("M?? sinh vi??n kh??ng h???p l???. H??y nh???p l???i b???t ?????u b???ng (RAxxx): ");
            }
        } while (checkStudentId);

//        nh???p t??n
        do {
            System.out.println("Nh???p t??n sinh vi??n (t??? 20 ?????n 50 k?? t???): ");
            this.studentName = scanner.nextLine();
            if (this.studentName.length() < 10) {
                System.err.println(" T??n sinh vi??n kh??ng h???p l??? ! H??y nh???p l???i t??n ph???i t??? 10 k?? t??? : ");
            } else if (this.studentName.length() > 50) {
                System.err.println(" T??n sinh vi??n kh??ng h???p l??? ! H??y nh???p l???i t??n ph???i d?????i 50 k?? t??? : ");
            }
        } while (this.studentName.length() < 10 || this.studentName.length() > 50);

        // Nh???p tu???i sinh vi??n
        do {
            System.out.println("Nh???p tu???i sinh vi??n: ");
            age = scanner.nextInt();
            if (age <= 18) {
                System.err.println("Tu???i sinh vi??n ph???i l???n h??n 18 !");
            }
        } while (age <= 18);

//        G???i t??nh sinh vi??n
        String sex = "";
        while (true) {
            sex = scanner.nextLine().trim();
            if (sex.equalsIgnoreCase("Nam") || sex.equalsIgnoreCase("Nu")) {
                this.sex = sex;
                break;
            } else {
                System.out.print("Nh???p gi???i t??nh sinh vi??n l?? (Nam ho???c Nu): ");
            }
        }

        do {
            System.out.print("Nh???p s??? ??i???n tho???i: ");
            phone = scanner.nextLine();
            if (phone.length() != 10 || !phone.startsWith("0")) {
                System.err.println("S??? ??i???n tho???i kh??ng h???p l???. Ch??? g???m 10 k?? t??? b???t ?????u l?? k?? t??? 0.");
            }
        } while (phone.length() != 10 || !phone.startsWith("0"));


//        Nh???p ?????a ch???
        do {
            System.out.print("Nh???p ?????a ch???: ");
            address = scanner.nextLine();
            if (address.length() < 1) {
                System.err.println("?????a ch??? kh??ng ???????c ????? tr???ng, Vui l??ng nh???p l???i: ");
            } else if (address.length() > 100) {
                System.err.println("?????a ch??? kh??ng ???????c qu?? 100 k?? t???, Vui l??ng nh???p l???i:");
            }
        } while (address.length() < 1 || address.length() > 100);

//            Nh???p ??i???m thi HTML
        do {
            System.out.print("Nh???p ??i???m thi HTML (t??? 0 ?????n 10): ");
            html = scanner.nextFloat();
            if (html < 0 || html > 10) {
                System.err.println("??i???m thi HTML ph???i n???m trong kho???ng t??? 0 ?????n 10!");
            }
        } while (html < 0 || html > 10);

//             Nh???p ??i???m thi CSS
        do {
            System.out.print("Nh???p ??i???m thi CSS (t??? 0 ?????n 10): ");
            css = scanner.nextFloat();
            if (css < 0 || css > 10) {
                System.err.println("??i???m thi CSS ph???i n???m trong kho???ng t??? 0 ?????n 10!");
            }
        } while (css < 0 || css > 10);

//            Nh???p ??i???m thi JavaScript
        do {
            System.out.print("Nh???p ??i???m thi JavaScript (t??? 0 ?????n 10): ");
            javascript = scanner.nextFloat();
            if (javascript < 0 || javascript > 10) {
                System.err.println("??i???m thi JavaScript ph???i n???m trong kho???ng t??? 0 ?????n 10!");
            }
        } while (javascript < 0 || javascript > 10);

    }

    public void displayData() {
        int day = Year.now().getValue();
        System.out.printf("%s%-20s%s%s", "M?? sinh vi??n: ", studentId, "T??n sinh vi??n: ", studentName);
        System.out.printf("%s%-24d%s%-20s%s%s", "\nN??m sinh: ", (day - age), "Gi???i t??nh: ", sex, "??i???n tho???i: ", phone);
        System.out.printf("%s%-56s%s%f", "\n?????a ch???: ", address, "??i???m Trung B??nh: ", avgMark());

    }

    public float avgMark() {
        return (html + css + 2 * javascript) / 4;
    }
}
