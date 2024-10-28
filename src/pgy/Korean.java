package pgy;

import java.util.Objects;

public class Korean {

	private String regNo;
	private String name;
	
	
	




	public Korean(String regNo, String name) {
		super();
		this.regNo = regNo;
		this.name = name;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getRegNo() {
		return regNo;
	}

// 주민번호가 같으면 같은 주소값이 나오도록 Object.hashCode()를 오버라이딩
	// 문자열은 같으면 같은 주소를 같는 특징이 있다.

	@Override
	public int hashCode() {
		return Objects.hash(name, regNo);
	}


// 주민번호가 같으면 같은 객체로 인식하도록 Object.equals()를 오버라이딩
	@Override
	public boolean equals(Object obj) {
		//인스턴스 오브 누구의 객체이냐 아니냐
		boolean result = false;
		if(obj instanceof Korean) {
			Korean tmp = (Korean)obj;
			if(this.regNo.equals(tmp.getRegNo())) {
				result = true;
				
			}
			
		}
		return result;
		
//		if (this == obj)
//	        return true;
//	      if (obj == null)
//	        return false;
//	      if (getClass() != obj.getClass())
//	        return false;
//	      Korean other = (Korean) obj;
//	      return name == other.name && Objects.equals(regNo, other.regNo);
	    }
	



	@Override
	public String toString() {
		return "Korean [regNo=" + regNo + ", name=" + name + ", getName()=" + getName() + ", getRegNo()=" + getRegNo()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}




	
	
	
}
