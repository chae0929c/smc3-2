import java.util.Scanner;

public class Prob_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum = 0;
		int i = 0;
		System.out.println("1000 이하의 자연수를 입력하세요.");
		int num1 = sc.nextInt();
		
		
		while(i<=num1) {
			if(i%4==0) {
				sum += i;
				System.out.println(i);	
			}
			i++;
		}
		System.out.println("1~"+num1+"까지 4의 배수의 합은 "+sum+"입니다.");

	}

}
