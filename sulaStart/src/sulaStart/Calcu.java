package sulaStart;
import java.util.Scanner;
public class Calcu {

	public static void main(String[] args) {
		String sign = "";
		Scanner sc = new Scanner(System.in);
		Calcus cal = new Calcus();
		
		System.out.println("A, B에 숫자를 입력하세요");
		
		try{
		System.out.print(" A : ");
		cal.A = sc.nextInt();
		
		System.out.print(" B : ");

		cal.B = sc.nextInt();
		}catch(Exception e){
			System.out.println("숫자만 입력해주세요");
		}
		
		System.out.println("사용할 사칙연산을 입력하세요~");
		
		System.out.print("sign (+,-,*,/) : ");
		sign = sc.next();	
		
		switch (sign) {
		case "+":
			System.out.print("계산결과는 ");
			System.out.println(cal.add());
			break;
		case "-":
			System.out.print("계산결과는 ");
			System.out.println(cal.sub());
			break;
		case "*":
			System.out.print("계산결과는 ");
			System.out.println(cal.multi());			
			break;
		case "/":
			System.out.print("계산결과는 ");
		if(cal.B==0) {
				System.out.print("0을 입력하지 마세요");					
			}else {
			System.out.println(cal.division());
			}
			break;
		default:
			System.out.print("잘못 입력하셨습니다");
			break;
		}
		
		
		
		
			
			
	}

}
class Calcus {
	int A,B;

	int add() {
		return A+B;
	}
	int sub() {
		return A-B;
	}
	int multi() {
		return A*B;
	}
	int division() {
		return A/B;
	}
	

}
