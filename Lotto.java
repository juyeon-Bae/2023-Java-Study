
public class Lotto {

	public static void main(String[] args) {
			int count =1000; //100만원
			int lotto[] = new int[7]; //당첨번호 6개 + 보너스번호 1개
			int human[]= new int[6]; //당첨번호 6개
			int lucky; //맞힌 숫자의 개수
			int lucky_b; //보너스번호 1:맞음, 0 : 틀림
			int rank1=0, rank2=0, rank3 =0, rank4=0, rank5=0;
			
			//로또 당첨번호
			for(int i=0; i<lotto.length; i++) {
				lotto[i]= (int)(Math.random()*45) + 1; //0~45
			//중복처리
			for(int j=0; j<i; j++)
			{
				if(lotto[i]==lotto[j])
				{
					i--;
					break;
				}//if
			}//for j
			}//for i
			
			
			for(int k=1; k<=count; k++)
			{
				System.out.printf("[제 %5d회 : ]",k);
				
				for(int i=0; i<human.length; i++) {
					human[i]= (int)(Math.random()*45) + 1; //0~45
				//중복처리
				for(int j=0; j<i; j++)
				{
					if(human[i]==human[j])
					{
						i--;
						break;
					}//if
				}//for j
				}//for i
				
				
				for(int i=0; i<6; i++)
				{
					System.out.printf(" %2d", lotto[i]);
				}
				System.out.printf("[%2d]\t", lotto[6]);
				
				lucky =0;
				for(int i=0; i<human.length; i++) {
					for(int j=0; j<6; j++)
					{
						if(human[i]== lotto[j])
						{
							System.out.printf("%2d ",human[i]);
							lucky++;
							break;
						}
						else if(human[i]!=lotto[j]&& j==5){
							System.out.printf("%2d ",human[i]);
						}
					}//for
					
				} //for i
				int i1; //당첨번호
				//보너스번호 일치 여부 확인
				for(i1=0, lucky_b=0; i1<human.length; i1++) {
					if(human[i1]==lotto[6]) {
						lucky_b=1;
						break;
					}//if
				}//for i1
				//
				
				switch(lucky) {
				case 6: 
					System.out.println("*****축하합니다 1등에 당첨되셨습니다****");
					rank1++;
					break;
					
				case 5:
					
					if(lucky_b==1) {
						System.out.println("[2등]");
						rank2++;
					}
					else {
						System.out.println("[3등]");
						rank3++;
					}
					break;
					
					case 4 :
						System.out.println("[4등]");
						rank4++;
						break;
						
					case 3 :
						System.out.println("[5등]");
						rank5++;
						break;
				default:
					System.out.println("[꽝]"); break;
				}
				
				 
			}//for k
			
				System.out.println();
				System.out.println("총 도전 횟수 : "+ count + "회("+(count*1000)+")원");
				System.out.println("1등: "+rank1+"회");
				System.out.println("2등: "+rank2+"회");
				System.out.println("3등: "+rank3+"회");
				System.out.println("4등: "+rank4+"회");
				System.out.println("5등: "+rank5+"회");
			
	}//main

}
