package sulaStart;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class PhoneBookMain {
	static Scanner sc = new Scanner(System.in);
	static HashMap hm = new HashMap();
/* <HashMap 메서드 정리>
 * 1)생성:HashMap 변수명 = new HashMap();
 * 2)삽입:변수명.put(key,value)
 * 3)가져오기:변수명.get(key)
 * 4)key 존재 확인:변수명.containsKey(key)
 * <전화번호부 기능>
 * 1)고객 저장
 * 2)고객 검색
 * 3)전체 보기
 * 4)끝내기
 */
	public static void main(String[] args) {		
		hm.put("hi","010-1234-1234");
		hm.put("hello","010-1111-2222");
		hm.put("hehe","010-2345-2345");
		hm.put("kim","010-1313-1313");
		hm.put("ji","010-4444-5555");
		hm.put("no","010-1010-2020");
		hm.put("mo","010-3030-4044");
		int choice;
		while(true) {
			
			System.out.println("***********Numberbook Program***********");
			System.out.println("1. 연락처 등록");
			System.out.println("2. 연락처 검색");
			System.out.println("3. 모두 조회");
			System.out.println("4. 종료");
			System.out.print("번호를 넣어주세요!:");
			choice= sc.nextInt();
			if(choice==1) {insert();}
			else if(choice==2) {search();}
			else if(choice==3) {show();}
			else if(choice==4) {
				System.out.println("종료합니다.");
				break;
			}
		}
	}	
	public static void insert() {
		System.out.print("저장할 사용자 이름을 입력해 주세요.:");
        String insertName = sc.next();
        if(hm.containsKey(insertName)) {
        	System.out.println("Cannot save because it already exists.");
        	
        }
        else {
        	System.out.print("저장할 사용자 전화번호를 입력해 주세요.:"); 
        	String insertPhone = "";
        	         	
        		
        	try {
        		insertPhone = "";
        		int inputNum = sc.nextInt();
        		insertPhone = Integer.toString(inputNum);
        		hm.put(insertName, insertPhone);
       	     
        		System.out.println("next~");
        		
        		
        	}catch(Exception e){	
        		       	
        	
        	     System.out.println("잘못된 입력입니다.");
        	     System.out.println("다시 시도해 주세요!");
        	     sc.next();
        	     
        	     
        			//insert( ): 고객 정보 저장 - 저장할 고객의 이름을 입력 받아,	hashmap에 존재하지 않을 경우 저장 가능
        	}
        	
        	
        }
	}
	public static void search() {
		System.out.print("검색할 이름을 입력해주세요:");
		String searchName = sc.next();
		if(hm.containsKey(searchName)) {
			System.out.println("저장된 내용 로딩~");
			System.out.println("전화번호는 :"+hm.get(searchName));
		}
		else {
			System.out.println("It's a name that doesn't exist");
		}
	}
	public static void show() {
		Set keySet = hm.keySet();
		Iterator i =keySet.iterator();
		System.out.println("------Everything Customer Enquiry------");
		while(i.hasNext()) {
			String curName = (String)i.next();
			System.out.println("name:"+curName+"phone:"+hm.get(curName));
		}
	}

}
