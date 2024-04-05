package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.SinhVienModel;
import model.TheMuonModel;

public class TheMuonView {
	Scanner sc = new Scanner(System.in);
	List<TheMuonModel> danhsachTM;
	
	public TheMuonView() {
		danhsachTM = new ArrayList<TheMuonModel>();
	}
	
	public void hienThiThongTinTheMuon() {
		for(TheMuonModel theMuonModel : danhsachTM) {
			System.out.println("Ma the muon: "+ theMuonModel.getMaPhieuMuon());
			System.out.println("Ngay muon : "+theMuonModel.getNgayMuon());
			System.out.println("Han tra : "+theMuonModel.getHanTra());
			System.out.println("So hieu sach : "+theMuonModel.getSoHieuSach());
			System.out.println("Thong tin sinh vien muon sach :");
			SinhVienModel sinhvien = theMuonModel.getSinhVien();
			System.out.println("Ho ten sinh vien : "+sinhvien.getName());
			System.out.println("Tuoi cua sinh vien :"+sinhvien.getAge());
			System.out.println("Lop cua sinh vien : "+sinhvien.getLop());
		}
	}
	
	public void themTheMuon(TheMuonModel theMuon) {
		System.out.println("Nhap ma phieu muon : ");
		String maPhieu = sc.nextLine();
		System.out.println("Nhap ngay muon :");
		String NgayMuon = sc.nextLine();
		System.out.println("Nhap han tra : ");
		String HanTra = sc.nextLine();
		System.out.println("Nhap so hieu sach :");
		int SoHieuSach = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap ho va ten sinh vien : ");
		String Name = sc.next();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap tuoi cua sinh vien : ");
		int Age = sc.nextInt();
		System.out.println("Nhap lop cua sinh vien:");
		String Lop = sc.next();
		SinhVienModel sinhvien = new SinhVienModel(Name, Age, Lop);
		TheMuonModel newTheMuon = new TheMuonModel(maPhieu, NgayMuon, HanTra, SoHieuSach, sinhvien);
		System.out.println("Phieu muon da duoc them!");
		danhsachTM.add(theMuon);
	}
	public void xoaTheMuon(String MaPhieuMuon) {
		danhsachTM.removeIf(theMuon ->theMuon.getMaPhieuMuon().equals(MaPhieuMuon));
	}

}
