import java.util.Scanner;
public class CircleExam {
	public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);
		 int radius;
		 System.out.print("반지름 값 >> ");
		 radius = sc.nextInt();

		 Circle c = new Circle(radius);
 
		 System.out.println("반지름 "+ radius + "인 원의 넓이는 " + c.Area() + "이다.");  
	}
}

class Circle{
	int radius;

	public Circle(int radius){
		this.radius=radius; 
	}
	public double Area() {   // 원의 넓이 return (원의 넓이 = 반지름*반지름*3.14)
		
		return radius*radius*3.14;
	}
}