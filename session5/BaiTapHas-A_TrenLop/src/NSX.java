import java.util.Scanner;

public class NSX {
    private String maNSX;
    private String tenNSX;
    private String dcNSX;

    public NSX() {
    }

    public NSX(String maNSX, String tenNSX, String dcNSX) {
        this.maNSX = maNSX;
        this.tenNSX = tenNSX;
        this.dcNSX = dcNSX;
    }

    public String getMaNSX() {
        return maNSX;
    }

    public void setMaNSX(String maNSX) {
        this.maNSX = maNSX;
    }

    public String getTenNSX() {
        return tenNSX;
    }

    public void setTenNSX(String tenNSX) {
        this.tenNSX = tenNSX;
    }

    public String getDcNSX() {
        return dcNSX;
    }

    public void setDcNSX(String dcNSX) {
        this.dcNSX = dcNSX;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã NSX: ");
        maNSX = scanner.nextLine();
        System.out.print("Nhập tên NSX: ");
        tenNSX = scanner.nextLine();
        System.out.print("Nhập địa chỉ NSX: ");
        dcNSX = scanner.nextLine();
    }

    public void xuat() {
        System.out.println("Mã NSX: " + maNSX);
        System.out.println("Tên NSX: " + tenNSX);
        System.out.println("Địa chỉ NSX: " + dcNSX);
    }
}
