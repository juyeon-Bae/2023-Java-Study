
public class Card_Test {

	public static void main(String[] args) {
		System.out.println("카드의 너비는 "+Card.width );
		System.out.println("카드의 높이는 "+Card.height );
		
		
	Card c1 = new Card();
	c1.kind = "하트";
	c1.number = 7;
	
	Card c2 = new Card();
	c2.kind="클로버";
	c2.number = 1;
	 
	
	Card c3 = new Card();
	c3.kind="스페이드";
	c3.number=4;
	 
	
	System.out.println("c1은 "+ c1.kind+","+c1.number+"이며,크기는("+Card.width+","+Card.height+")");
	System.out.println("c2은 "+ c2.kind+","+c2.number+"이며,크기는("+Card.width+","+Card.height+")");
	System.out.println("c3은 "+ c3.kind+","+c3.number+"이며,크기는("+Card.width+","+Card.height+")");
	
	Card.width = 50;
	Card.height = 80;  //유지보수
	
	System.out.println();
	
	System.out.println("c1은 "+ c1.kind+","+c1.number+"이며,크기는("+Card.width+","+Card.height+")");
	System.out.println("c2은 "+ c2.kind+","+c2.number+"이며,크기는("+Card.width+","+Card.height+")");
	System.out.println("c3은 "+ c3.kind+","+c3.number+"이며,크기는("+Card.width+","+Card.height+")");
	
	
	 
	}//main

}
