package personalProject;

import java.util.ArrayList;
import java.util.List;

public class WaitList {
	List<Integer> Board_a = new ArrayList<Integer>();
	List<Integer> Board_b = new ArrayList<Integer>();
	List<Integer> Board_c = new ArrayList<Integer>();
	


	public List<Integer> getBoard_a() {
		return Board_a;
	}



	public void setBoard_a(List<Integer> board_a) {
		Board_a = board_a;
	}



	public List<Integer> getBoard_b() {
		return Board_b;
	}



	public void setBoard_b(List<Integer> board_b) {
		Board_b = board_b;
	}



	public List<Integer> getBoard_c() {
		return Board_c;
	}



	public void setBoard_c(List<Integer> board_c) {
		Board_c = board_c;
	}



	void List(int x) {
		
		int count_a,count_b,count_c;
		
		
		
		//현황판 만들기
	
		if (x>=0 && x<1000) {
			getBoard_a().add(x);
		}else if (x>=1000 && x<2000) {
			getBoard_b().add(x);
		}else {
			getBoard_c().add(x);
		}
		
		count_a = Board_a.size();
		count_b = Board_b.size();
		count_c = Board_c.size();

		System.out.println("창구별 현 대기 상황");
		System.out.println("---------------------------------");
		System.out.print("A 창구\n");
		for(int i=0;i<count_a;i++) {
			System.out.printf("%04d, ",Board_a.get(i));
		}
		System.out.println();
		System.out.println("---------------------------------");
		System.out.print("B 창구\n");
		for(int i=0;i<count_b;i++) {
			System.out.printf("%04d, ",Board_b.get(i));
		}
		System.out.println();
		System.out.println("---------------------------------");
		System.out.print("C 창구\n");
		for(int i=0;i<count_c;i++) {
			System.out.printf("%04d, ",Board_c.get(i));
		}
		System.out.println();
		System.out.println("---------------------------------");
		
	}
}
