import java.util.Scanner;

public class Hang {
    private String maHang;
    private String tenHang;
    private NSX x;

    public Hang() {
        x = new NSX();
    }

    public Hang(String maHang, String tenHang, NSX nsx) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.x = nsx;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public NSX getNsx() {
        return x;
    }

    public void setNsx(NSX nsx) {
        this.x = nsx;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã hàng: ");
        maHang = scanner.nextLine();
        System.out.print("Nhập tên hàng: ");
        tenHang = scanner.nextLine();
        x.nhap();
    }

    public void xuat() {
        System.out.println("Mã hàng: " + maHang);
        System.out.println("Tên hàng: " + tenHang);
        x.xuat();
    }
}

