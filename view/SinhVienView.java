package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.SinhVienModel;

public class SinhVienView {
	Scanner sc = new Scanner(System.in);
	public void HienThi(ArrayList<SinhVienModel> sv) {
		for(SinhVienModel sinhVienModel : sv) {
			System.out.println("Ho va ten sinh vien : "+sinhVienModel.getName());
			System.out.println("Tuoi cua sinh vien : "+sinhVienModel.getAge());
			System.out.println("Lop cua sinh vien : "+sinhVienModel.getLop());
		}
	}

}
