package personalProject;

import java.util.Calendar;
import java.util.Scanner;
public class Toyproject_Kyj {

	public static void main(String[] args) {

	// 값 받을 scanner 선언
	Scanner scanner = new Scanner(System.in);
	
	// 필요 변수
	String sel = null, sel_re = null;
	boolean re = true;
	int A = 0,
		B = 0,
		C = 0;
	
	// 캘린더
	Calendar cal = Calendar.getInstance();
	
	int yy = cal.get(Calendar.YEAR);
	int mm = cal.get(Calendar.MONTH)+1;
	int dd = cal.get(Calendar.DAY_OF_MONTH);
	int hh = cal.get(Calendar.HOUR_OF_DAY);
	int mi = cal.get(Calendar.MINUTE);
	Ticket Tiketing = Ticket.getInstance();
	WaitList WList = new WaitList();
	
		// 초기 화면
	System.out.println("은행 자동 대기표, 대기 현황");
	System.out.println("---------------------------------");	
	while(re) {
		System.out.printf("   현재 시간\n%04d년 %02d월 %02d일 \n   %02d시 %02d분\n",yy,mm,dd,hh,mi);
		System.out.println("---------------------------------");
		System.out.println(	"A = \"주식/투자\"\n"
							+ "B = \"입출금계좌\"\n"
							+ "C = \"해외업무관련\"\n"
							+"원하는 업무를 골라 주세요 : ");
		sel = scanner.next();
		
		//선택 이후 출력
			if("A".equals(sel) || "a".equals(sel)) {
				Tiketing.WaitNo(A);
				WList.List(A);
				A++;
			}
			else if("B".equals(sel) || "b".equals(sel)) {
				Tiketing.WaitNo(B+1000);
				WList.List(B+1000);
				B++;
			}
			else if("C".equals(sel) || "c".equals(sel)) {
				Tiketing.WaitNo(C+2000);
				WList.List(C+2000);
				C++;
			}
			
			else{
				System.out.println("잘못 누르셨습니다.");
				System.out.println("다시 시작할까요? Y/N : ");
				sel_re = scanner.next();
			
				if(sel_re.equals("N") || sel_re.equals("n")) {
				System.out.println("번호뽑기를 중지합니다.");
				re = false;
					}
				else {
					continue;
					}
				
				}
		}
	scanner.close();
	}
	

}


