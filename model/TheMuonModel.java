package model;

public class TheMuonModel {
	String MaPhieuMuon;
	String NgayMuon;
	String HanTra;
	int SoHieuSach;
	SinhVienModel SinhVien;
	

	
	
	public TheMuonModel(String maPhieuMuon, String ngayMuon, String hanTra, int soHieuSach, SinhVienModel sinhVien) {
		super();
		MaPhieuMuon = maPhieuMuon;
		NgayMuon = ngayMuon;
		HanTra = hanTra;
		SoHieuSach = soHieuSach;
		SinhVien = sinhVien;
	}
	public String getMaPhieuMuon() {
		return MaPhieuMuon;
	}
	public void setMaPhieuMuon(String MaPhieuMuon) {
		this.MaPhieuMuon = MaPhieuMuon;
	}
	public String getNgayMuon() {
		return NgayMuon;
	}
	public void setNgayMuon(String NgayMuon) {
		this.NgayMuon = NgayMuon;
	}
	public String getHanTra() {
		return HanTra;
	}
	public void setHanTra(String HanTra) {
		this.HanTra = HanTra;
	}
	public int getSoHieuSach() {
		return SoHieuSach;
	}
	public void setSoHieuSach(int SoHieuSach) {
		this.SoHieuSach = SoHieuSach;
	}
	
	public SinhVienModel getSinhVien() {
		return SinhVien;
	}
	public void setSinhvien(SinhVienModel sinhVien) {
		this.SinhVien = sinhVien;
	}

}
