package workshop.book.control;

import workshop.book.entity.Magazine;
import workshop.book.entity.Novel;
import workshop.book.entity.Publication;

public class ManageBook {
	public static void main(String[] args) {
		Publication[] pubs = new Publication[5];
		pubs[0] = new Magazine("마이크로소프트","2007-10-01",328,9900,"매월");
		
		//Magazine 객체생성
		Magazine mz = new Magazine();
//		mz변수로 호출 가능한 메서드 = 5개
		Publication pub = new Magazine();
//		pub변수로 호출 가능한 메서드 = 4개
		
		Novel novel = new Novel();
		Publication pub2 = new Novel();
	}

}
