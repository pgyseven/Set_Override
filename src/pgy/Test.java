package pgy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		//HashSet<Korean> people = new HashSet<Korean>();
		List<Korean> people = new ArrayList<Korean>();
		people.add(new Korean("111111-1111111", "dooly"));
		people.add(new Korean("111111-1111111", "dooly"));
		
		// 국민 중 주민번호가 같고, 이름이 같으면 같은 사람으로 처리하고자 한다.
		// 같은 사람은 중복되어 컬렉션에 저장되지 않도록 처리하고 싶다. 어떻게 하면될까?
		
		Set<Korean> peopleSet = new HashSet<Korean>();
		peopleSet.addAll(people);
		
		for(Korean k : peopleSet) {
			System.out.println(k.toString());
		}
		
		
	}
	

}
