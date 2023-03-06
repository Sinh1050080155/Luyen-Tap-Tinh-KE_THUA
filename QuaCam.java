package LuyentapCHAPTER4_KETHUA;


public class QuaCam extends HoaQua{
    private String mauSac;

    public QuaCam(double giaBan, String xuatXu, Integer ngayNhap, int soLuong, String mauSac) {
        super(giaBan, xuatXu, ngayNhap, soLuong);
        this.mauSac = mauSac;
    }
    public String getMauSac() {
        return mauSac;
    }
}
