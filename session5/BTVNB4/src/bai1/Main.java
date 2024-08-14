package bai1;

public class Main {
    public static void main(String[] args) {
        // Khởi tạo mảng tĩnh để lưu các đối tượng Student
        Student[] students = new Student[5];

        // Thêm các đối tượng Student vào mảng
        students[0] = new Student("Nguyen Van A", 2000, "Ha Noi", 8.5, 7.5, 8.0, 2);
        students[1] = new Student("Le Thi B", 1999, "Hai Phong", 6.0, 8.0, 7.0, 1);
        students[2] = new Student("Tran Van C", 2001, "Da Nang", 9.0, 8.5, 8.5, 0);
        students[3] = new Student("Pham Thi D", 1998, "Ho Chi Minh", 7.0, 7.0, 6.0, 3);
        students[4] = new Student("Hoang Van E", 2002, "Can Tho", 5.0, 6.0, 6.5, 4);

        // In tiêu đề bảng
        System.out.println(String.format("%-15s%-10s%-15s%-12s%-12s%-12s%-12s%-12s",
                "Tên", "Tuổi", "Địa chỉ", "Điểm TX1", "Điểm TX2", "Điểm KTHP", "Điểm GPA", "Số tiết nghỉ"));

        // Duyệt mảng bằng vòng for chỉ số
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            System.out.println(String.format("%-15s%-10d%-15s%-12.1f%-12.1f%-12.1f%-12.1f%-12d",
                    student.getName(),
                    student.getAge(),
                    student.getAddress(),
                    student.getTx1(),
                    student.getTx2(),
                    student.getKthp(),
                    student.getGpa(),
                    student.getAbsenceDays()));
        }
    }
}

