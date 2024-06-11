package personalProject;

import java.util.Calendar;

public class Ticket {

	//싱글톤선언
private static Ticket current;
	
	public static Ticket getInstance(){
		if(current == null)
		{
			current = new Ticket();
		}
			return current;
	}
	
	private  Ticket() {
		
	}
	
	//대기표 출력
	public int WaitNo(int No){
		Calendar cal = Calendar.getInstance();
		
		int hh = cal.get(Calendar.HOUR_OF_DAY);
		int mi = cal.get(Calendar.MINUTE);
		//번호표 뽑기
		System.out.printf("\n\n\n\n\n\n");
		System.out.printf("%04d\n",No);
		System.out.printf("\n");
		System.out.printf("%02d시 %02d분\n",hh,mi);
		System.out.println("\n\n3초 후 초기화면으로 돌아감니다.");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		return No;
	}
	
	

}
