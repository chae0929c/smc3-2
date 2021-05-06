
public class TriangleExam {

	public static void main(String[] args) {
		Triangle t = new Triangle(10.2, 17.3);
		System.out.println("변경 전 삼각형 넓이 : " + t.tr());
		t.cg(7.5,9.2);
		System.out.println("변경 후 삼각형 넓이 : " + t.tr());
	}

}

class Triangle{
	double w,h;
	
	public Triangle(double w, double h){
		this.w = w;
		this.h = h;
	}
	public void cg(double w, double h){
		this.w = w;
		this.h = h;
	}
	public double tr(){
		return w*h/2;
	}
}