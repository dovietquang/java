package GetterSettervanhungtuybien;

public class MainClass {
    public static void main(String[] args) {
        SinhVien sinhVien1 = new SinhVien();
        SinhVien sinhVien2 = new SinhVien();
        sinhVien1.setTen("");
        sinhVien1.setTuoi(23);
        sinhVien2.setTen("peter");
        sinhVien2.setTuoi(17);
        System.out.println("Sinh vien 1 co ten: " + sinhVien1.getTen() + "Tuoi" + sinhVien1.getTuoi());
        System.out.println("Sinh vien 2 co ten: " + sinhVien2.getTen() + "Tuoi" + sinhVien2.getTuoi());
    }
}
