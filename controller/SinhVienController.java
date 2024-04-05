package controller;

import java.util.ArrayList;

import model.SinhVienModel;
import view.SinhVienView;

public class SinhVienController {
	private SinhVienView view;
	private ArrayList<SinhVienModel> model;
	
	public SinhVienController( SinhVienView sinhVienView, ArrayList<SinhVienModel> sinhVienModel) {
		this.view = sinhVienView;
		this.model = sinhVienModel;
		
	}
	
	public void hienThiThongTin() {
		view.HienThi(model);
	}

}
