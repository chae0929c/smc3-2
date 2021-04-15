/*import java.util.Scanner;
import java.util.Random;

public class number {
	public static void main(String args[]) {
		int[] rand = new int [10];
		int input = 0;
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			count++;
			System.out.println("10개의 랜덤 숫자 중 하나를 맞춰보세요(1~50까지) : ");
			input = sc.nextInt();
			
			for(int i = 0; i < 10; i++) {
				rand[i] = (int)(Math.random() * 50 + 1);
			if(input == rand[i]) {
				System.out.println(rand[i] + " ");
				System.out.println("당첨! 일치하는 숫자가 있습니다.");
				}else if(input != rand[i]) {
					System.out.println("꽝! 일치하는 숫자가 없습니다.");
				}
			}
		}
	}
}
*/
import java.util.Scanner;
public class number {
	public static void main(String args[]) {
		System.out.println("10개의 랜덤 숫자 중 하나를 맞춰보세요(1~50까지) : ");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();//입력값
		int []arr = new int[10];//10개의 난수
		int diff = 0;//당첨,꽝 비교함수
		for(int i = 0; i<10; i++) {//1~50까지의 숫자중에서 10개의 난수를 생성
			arr[i]=(int)(Math.random()* 50+1);
			System.out.print(arr[i] + " ");
		}
		System.out.println();//줄바꿈
		
		for(int j = 0; j<10; j++) {//입력 숫자중에 일치하는 숫자가 있는지 확인
			if(arr[j] == num) {//입력된 숫자안에 일치하는 숫자가 있으면 당첨! 일치하는 숫자가 있습니다 출력
				System.out.println("당첨! 일치하는 숫자가 있습니다.");
				diff = 1;//당첨시 diff 값을 1로 변경
			}
		}
		if(diff==0)//diff값이 0일 경우 꽝! 일치하는 숫자가 없습니다 출력
			System.out.println("꽝! 일치하는 숫자가 없습니다.");
	}
}
