package test;

import java.util.Scanner;

import controller.TheMuonController;
import model.SinhVienModel;
import model.TheMuonModel;
import view.TheMuonView;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TheMuonModel model = new TheMuonModel(null, null, null, 0, new SinhVienModel(null, 0, null));
		TheMuonView view = new TheMuonView();
		TheMuonController controller = new TheMuonController(view, model);
		
		int c;
		do {
			    System.out.println("----- MENU -----");
	            System.out.println("1. Them the muon ");
	            System.out.println("2. Xoa the muon");
	            System.out.println("3. Hien thi thong tin the muon");
	            System.out.println("4. Thoat");
	            System.out.print("Nhap lua chon: ");
	            c = sc.nextInt();
	            switch (c) {
				case 1:
					controller.themTheMuon(model);
					break;
				case 2 :
					System.out.println("Nhap ma phieu muon can xoa : ");
					String MaPhieuMuon = sc.nextLine();
					controller.xoaTheMuon(MaPhieuMuon);
					System.out.println("The muon da duoc xoa !");
					break;
				case 3:
					controller.hienThiThongTinTheMuon();
					break;
				case 4:
					System.out.println("Chuong trinh ket thuc!");
					break;

				default:
					System.out.println("Lua chon cua ban khon hop le");
					break;
				}
	            
		}while(c!=4);
		sc.close();
	}
}
