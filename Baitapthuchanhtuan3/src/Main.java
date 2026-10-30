import java.util.Scanner;

class Sach {
    String maSach;
    String tenSach;
    String tacGia;
    int namXuatBan;
    double donGia;
    int soLuong;

    Scanner sc = new Scanner(System.in);

    // Bài 1: Nhập thông tin sách
    void nhapThongTin() {
        System.out.print("Nhập mã sách: ");
        maSach = sc.nextLine();

        System.out.print("Nhập tên sách: ");
        tenSach = sc.nextLine();

        System.out.print("Nhập tên tác giả: ");
        tacGia = sc.nextLine();

        System.out.print("Nhập năm xuất bản: ");
        namXuatBan = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập đơn giá (đồng): ");
        donGia = Double.parseDouble(sc.nextLine());

        System.out.print("Nhập số lượng: ");
        soLuong = Integer.parseInt(sc.nextLine());
    }

    // Bài 2: Tính thành tiền
    double tinhThanhTien() {
        return donGia * soLuong;
    }

    // Bài 3: Tính phí vận chuyển bằng 5% thành tiền
    double tinhPhiVanChuyen() {
        return tinhThanhTien() * 0.05;
    }

    // Bài 4: Tính tổng tiền nhập kho
    double tinhTongTienNhap() {
        return tinhThanhTien() + tinhPhiVanChuyen();
    }

    // Hiển thị thông tin và kết quả
    void hienThiThongTin() {
        System.out.println("\n========== THÔNG TIN SÁCH ==========");
        System.out.println("Mã sách: " + maSach);
        System.out.println("Tên sách: " + tenSach);
        System.out.println("Tên tác giả: " + tacGia);
        System.out.println("Năm xuất bản: " + namXuatBan);
        System.out.printf("Đơn giá: %.0f đồng%n", donGia);
        System.out.println("Số lượng: " + soLuong);

        System.out.println("\n========== KẾT QUẢ TÍNH TOÁN ==========");
        System.out.printf("Thành tiền: %.0f đồng%n", tinhThanhTien());
        System.out.printf("Phí vận chuyển: %.0f đồng%n", tinhPhiVanChuyen());
        System.out.printf("Tổng tiền nhập kho: %.0f đồng%n", tinhTongTienNhap());
    }
}

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng sách
        Sach s = new Sach();

        // Nhập thông tin và hiển thị kết quả
        s.nhapThongTin();
        s.hienThiThongTin();
    }
}

