package bai1;

public class Student {
    private String name;
    private int yearOfBirth;
    private String address;
    private double tx1;
    private double tx2;
    private double kthp;
    private int absenceDays;

    public Student(String name, int yearOfBirth, String address, double tx1, double tx2, double kthp, int absenceDays) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
        this.tx1 = tx1;
        this.tx2 = tx2;
        this.kthp = kthp;
        this.absenceDays = absenceDays;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public double getTx1() {
        return tx1;
    }

    public double getTx2() {
        return tx2;
    }

    public double getKthp() {
        return kthp;
    }

    public int getAbsenceDays() {
        return absenceDays;
    }

    public int getAge() {
        int currentYear = java.time.Year.now().getValue();
        return currentYear - yearOfBirth;
    }

    public double getGpa() {
        return (tx1 * 0.2 + tx2 * 0.3 + kthp * 0.5);
    }
}
