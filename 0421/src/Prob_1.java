 import java.util.Scanner;

public class Prob_1 {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
				int a = 0;
				int b = 0;
				int sum = 0;
				
				System.out.printf("시작 숫자 : ");
				a = sc.nextInt();
				System.out.printf("마지막 숫자 : ");
				b = sc.nextInt();
				
				for(int i = a; i<=b; i++){
					sum = sum + i;
				}
				
				System.out.printf(a + "부터 " + b + "까지의 합은 " + sum);
			}
		}