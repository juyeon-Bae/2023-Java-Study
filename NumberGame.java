import java.util.Scanner;
public class NumberGame {

	public static void main(String[] args) {
		 
		int com = (int)(Math.random()*100)+1; //com : 1~100 임의의 숫자
		//System.out.println(com);
		Scanner sc = new Scanner(System.in);
		
		int you =0;
		int count =0;
		while(true) {
			count++;
		System.out.print("1~100 사이의 숫자를 입력 : ");
		you = sc.nextInt();
		
		if(you < com)
			System.out.println("그 보다 더 큰 숫자입니다.");
		
		else if(you > com)
			System.out.println("그 보다 더 작은 숫자 입니다.");
		
		else {
			System.out.println("정답입니다.");
			break;
		}
	}//while
		System.out.println();
		System.out.println(count+ "번째 맞추셨습니다.");
		if(count<=4)System.out.println("Great");
		else if(count<=8)System.out.println("good");
		else System.out.println("try again");
} //main
}