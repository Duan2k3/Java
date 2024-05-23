package Model;

public class SinhVien {
private String Ma;
private String Ho;
private String Ten;
private String Nam;
private String Que;
private String GPA;
public String getMa() {
	return Ma;
}
public void setMa(String ma) {
	Ma = ma;
}
public String getHo() {
	return Ho;
}
public void setHo(String ho) {
	Ho = ho;
}
public String getTen() {
	return Ten;
}
public void setTen(String ten) {
	Ten = ten;
}
public String getNam() {
	return Nam;
}
public void setNam(String nam) {
	Nam = nam;
}
public String getQue() {
	return Que;
}
public void setQue(String que) {
	Que = que;
}
public String getGPA() {
	return GPA;
}
public void setGPA(String gPA) {
	GPA = gPA;
}
public SinhVien(String ma, String ho, String ten, String nam, String que, String gPA) {
	super();
	Ma = ma;
	Ho = ho;
	Ten = ten;
	Nam = nam;
	Que = que;
	GPA = gPA;
}


}
