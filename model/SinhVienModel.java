package model;

public class SinhVienModel {
	 String Name;
	 int Age;
	 String Lop;
	public SinhVienModel(String Name, int Age, String Lop) {
		super();
		this.Name = Name;
		this.Age = Age;
		this.Lop = Lop;
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int Age) {
		this.Age = Age;
	}
	public String getLop() {
		return Lop;
	}
	public void setLop(String Lop) {
		this.Lop = Lop;
	}
}
