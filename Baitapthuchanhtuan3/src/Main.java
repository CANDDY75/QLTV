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


    // Bài 5: Kiểm tra giá, số lượng và năm xuất bản
    void kiemTraThongTin() {
        System.out.println("\\n========== KIỂM TRA THÔNG TIN ==========");

        if (donGia > 0) {
            System.out.println("Giá sách hợp lệ!");
        }
        else {
            System.out.println("Giá sách không hợp lệ!");
        }

        if (soLuong >= 0) {
            System.out.println("Số lượng hợp lệ!");
        }
        else {
            System.out.println("Số lượng không hợp lệ!");
        }

        if (namXuatBan >= 1450 && namXuatBan <= 2026) {
            System.out.println("Năm xuất bản hợp lệ!");
        }
        else {
            System.out.println("Năm xuất bản không hợp lệ!");
        }
    }

    // Bài 6: Phân loại giá sách
    void phanLoaiGia() {
        System.out.println("\\n========== PHÂN LOẠI GIÁ SÁCH ==========");

        if (donGia <= 0) {
            System.out.println("Giá sách không hợp lệ!");
        } else
            if (donGia < 50000) {
                System.out.println("Sách giá thấp");
        } else
            if (donGia < 100000) {
                System.out.println("Sách giá trung bình");
        } else
            if (donGia <= 200000) {
                System.out.println("Sách giá cao");
        } else {
            System.out.println("Sách giá đặc biệt");
        }
    }

    // Bài 7: Phân loại số lượng tồn kho
    void phanLoaiTonKho() {
        System.out.println("\\n========== PHÂN LOẠI TỒN KHO ==========");

        if (soLuong < 0) {
            System.out.println("Số lượng không hợp lệ!");
        } else
            if (soLuong == 0) {
                System.out.println("Hết sách");
        } else
            if (soLuong <= 5) {
                System.out.println("Sắp hết");
        } else
            if (soLuong <= 20) {
                System.out.println("Còn ít");
        } else {
            System.out.println("Còn nhiều");
        }
    }

    // Bài 8: Dùng switch chọn loại sách
    void chonLoaiSach() {
        System.out.println("\\n========== CHỌN LOẠI SÁCH ==========");
        System.out.println("1. Sách giáo khoa");
        System.out.println("2. Sách tham khảo");
        System.out.println("3. Sách chuyên ngành");
        System.out.println("4. Sách khác");
        System.out.print("Nhập lựa chọn: ");

        int loaiSach = Integer.parseInt(sc.nextLine());

        switch (loaiSach) {
            case 1:
                System.out.println("Bạn đã chọn: Sách giáo khoa");
                break;
            case 2:
                System.out.println("Bạn đã chọn: Sách tham khảo");
                break;
            case 3:
                System.out.println("Bạn đã chọn: Sách chuyên ngành");
                break;
            case 4:
                System.out.println("Bạn đã chọn: Sách khác");
                break;
            default:
                System.out.println("Loại sách không hợp lệ!");
        }
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

        // Thực hiện các bài kiểm tra và phân loại
        s.kiemTraThongTin();
        s.phanLoaiGia();
        s.phanLoaiTonKho();
        s.chonLoaiSach();
    }
}

