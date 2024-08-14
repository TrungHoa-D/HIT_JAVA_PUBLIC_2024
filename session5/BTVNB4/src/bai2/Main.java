package bai2;

import java.util.*;
import bai1.Student;

import java.util.Scanner;

public class Main {
    private static final int MAX_STUDENTS = 100; // Số lượng sinh viên tối đa
    private static Student[] students = new Student[MAX_STUDENTS];
    private static int studentCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("MENU:");
            System.out.println("1. Thêm sinh viên mới");
            System.out.println("2. Sửa thông tin sinh viên");
            System.out.println("3. Sắp xếp sinh viên theo Tuổi");
            System.out.println("4. Sắp xếp sinh viên theo GPA");
            System.out.println("5. Sắp xếp sinh viên theo Số tiết nghỉ");
            System.out.println("6. Xóa sinh viên khỏi danh sách");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer

            switch (choice) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    editStudent(scanner);
                    break;
                case 3:
                    sortStudentsByAge();
                    break;
                case 4:
                    sortStudentsByGPA();
                    break;
                case 5:
                    sortStudentsByAbsenceDays();
                    break;
                case 6:
                    deleteStudent(scanner);
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 0);

        scanner.close();
    }

    private static void addStudent(Scanner scanner) {
        if (studentCount >= MAX_STUDENTS) {
            System.out.println("Danh sách sinh viên đã đầy.");
            return;
        }

        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập năm sinh: ");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine(); // Clear the buffer
        System.out.print("Nhập địa chỉ: ");
        String address = scanner.nextLine();
        System.out.print("Nhập điểm TX1: ");
        double tx1 = scanner.nextDouble();
        System.out.print("Nhập điểm TX2: ");
        double tx2 = scanner.nextDouble();
        System.out.print("Nhập điểm KTHP: ");
        double kthp = scanner.nextDouble();
        System.out.print("Nhập số tiết nghỉ: ");
        int absenceDays = scanner.nextInt();

        students[studentCount++] = new Student(name, yearOfBirth, address, tx1, tx2, kthp, absenceDays);
        System.out.println("Thêm sinh viên thành công.");
    }

    private static void editStudent(Scanner scanner) {
        System.out.print("Nhập tên sinh viên cần sửa: ");
        String name = scanner.nextLine();
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getName().equalsIgnoreCase(name)) {
                System.out.print("Nhập địa chỉ mới: ");
                String address = scanner.nextLine();
                System.out.print("Nhập điểm TX1 mới: ");
                double tx1 = scanner.nextDouble();
                System.out.print("Nhập điểm TX2 mới: ");
                double tx2 = scanner.nextDouble();
                System.out.print("Nhập điểm KTHP mới: ");
                double kthp = scanner.nextDouble();
                System.out.print("Nhập số tiết nghỉ mới: ");
                int absenceDays = scanner.nextInt();

                students[i] = new Student(name, students[i].getYearOfBirth(), address, tx1, tx2, kthp, absenceDays);
                System.out.println("Sửa thông tin sinh viên thành công.");
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên với tên đã nhập.");
    }

    private static void sortStudentsByAge() {
        for (int i = 0; i < studentCount - 1; i++) {
            for (int j = 0; j < studentCount - i - 1; j++) {
                if (students[j].getAge() > students[j + 1].getAge()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
        System.out.println("Sắp xếp sinh viên theo tuổi thành công.");
    }

    private static void sortStudentsByGPA() {
        for (int i = 0; i < studentCount - 1; i++) {
            for (int j = 0; j < studentCount - i - 1; j++) {
                if (students[j].getGpa() > students[j + 1].getGpa()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
        System.out.println("Sắp xếp sinh viên theo GPA thành công.");
    }

    private static void sortStudentsByAbsenceDays() {
        for (int i = 0; i < studentCount - 1; i++) {
            for (int j = 0; j < studentCount - i - 1; j++) {
                if (students[j].getAbsenceDays() > students[j + 1].getAbsenceDays()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
        System.out.println("Sắp xếp sinh viên theo số tiết nghỉ thành công.");
    }

    private static void deleteStudent(Scanner scanner) {
        System.out.print("Nhập tên sinh viên cần xóa: ");
        String name = scanner.nextLine();
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getName().equalsIgnoreCase(name)) {
                for (int j = i; j < studentCount - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[--studentCount] = null; // Giảm số lượng sinh viên và xóa sinh viên cuối cùng
                System.out.println("Xóa sinh viên thành công.");
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên với tên đã nhập.");
    }
}


