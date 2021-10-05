import java.util.Scanner;

class Student {
    int[] number = new int[3];
    String[] name = new String[3];
    String[] major = new String[3];
    StringBuffer[] phone = new StringBuffer[3];
    //첫번째 학생을 배열의 0번 인덱스, 두번째 학생을 1번 인덱스, 세번째 학생을 2번 인덱스에 저장하기 위해 크기3의 배열로
    void setNumber(int n, int c) { // n은 학생의 학번, c+1번째 학생
        number[c] = n;
    } // 입력받은 n
    void setName(String na, int c) {
        name[c] = na;
    }
    void setMajor(String ma, int c) {
        major[c] = ma;
    }
    void setPhone(StringBuffer ph, int c) {
        phone[c] = ph;
    }
    String covphone(StringBuffer phone[y]) { // y번째 학생의 전화번호를 수정하는 함수
        StringBuffer ph0; // 기본 틀, null값이 들어가있음
        StringBuffer ph1 = new Stringbuffer(phone[y]); // 첫 3자리에 사용할 문자열
        StringBuffer ph2 = new Stringbuffer(phone[y]); // 4번째~7번째 자리에 사용할 문자열
        StringBuffer ph3 = new Stringbuffer(phone[y]); // 8~11번째 자리에 사용할 문자열
        ph1.deleteCharAt(3); // 3번 인덱스부터 삭제 = 첫 3자리만 남음
        ph2.deleteCharAt(7); // 7번 인덱스부터 삭제 = 1~7번째 자리만 남음
        ph2.delete(0,3); // 0번 인덱스부터 2번 인덱스까지 삭제 = 3~7번쨰 자리만 남음
        ph3.delete(0,7); // 0번 인덱스부터 6번 인덱스까지 삭제 = 8~11번째 자리만 남음
        ph0.append(ph1, "-", ph2, "-", ph3); // 기본 틀에 1~3 , - , 4~7 , - , 8~11 번째 자리의 문자열을 연결시킴
    }
    void tellinfo (int x) { // x+1번째 학생의 정보를 출력하는 함수
        System.out.println(number[x] + name[x] + major[x] + transphone[x]);
    }
}


public class Homework2 {
    public static void main(String[] args) {
        for(int c=0; c<3;c++) { // 3번 반복
            System.out.println("학생의 학번, 이름, 전공, 전화번호를 입력하세요:");
            Scanner sc = new Scanner(System.in);  // 입력받기
            int A = sc.next();
            String B = sc.next();
            String C = sc.next();
            StringBuffer D = sc.next();
            //학번, 이름, 전공, 전화번호 순서대로 A, B, C, D 에 저장
            setNumber(A, c); // getNumber
            setName(B, c); // getName
            setMajor(C, c); // getMajor
            setPhone(D, c); // getPhone
        } // 3명의 학생에 대한 정보를 모두 입력함
        System.out.println("첫번째 학생:" + tellinfo(0));
        System.out.println("두번째 학생:" + tellinfo(1));
        System.out.println("세번째 학생:" + tellinfo(2));
    }
}
