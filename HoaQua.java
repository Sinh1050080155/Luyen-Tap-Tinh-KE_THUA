package LuyentapCHAPTER4_KETHUA;
/*
        Câu 1. Cho các đối tượng sau gồm Hoa Quả, Quả Cam, Quả Táo, Cam Cao
                Phong, Cam Sành.
        - Dựa trên cách hiểu của mình về thừa kế, hãy viết chương trình mô tả quan hệ các
        đối tượng trên.
        - Với từng đối tượng, hãy bổ sung các thuộc tính và phương thức bạn cho là cần
        thiết (VD: giá bán/cân, nguồn gốc xuất xứ, ngày nhập, số lượng, v.v.)
        - Viết hàm main khởi tạo các đối tượng trên
 */

public class HoaQua {
    private double giaBan; 
    private  String xuatXu; 
    private int ngayNhap; 
    private int soLuong;

    public double getGiaBan() {
        return giaBan;
    }
    
    public String getXuatXu() {
        return xuatXu;
    }
    
    public int getNgayNhap() {
        return ngayNhap;
    }
    
    public int getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public HoaQua(double giaBan, String xuatXu, Integer ngayNhap, int soLuong) {
        this.giaBan = giaBan;
        this.xuatXu = xuatXu;
        this.ngayNhap = ngayNhap;
        this.soLuong = soLuong;
    }   
}

    

  

 
    