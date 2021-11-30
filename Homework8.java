import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;


public class Homework8 {
    public static void main(String[] args) {
        Map<String, String> input = new HashMap<String, String>();
        input.put("myId", "myPass");
        input.put("myId2", "myPass2");
        input.put("myId3", "myPass3");

        int i=0;
        String idinput;
        String passinput;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id : ");
            idinput=sc.next();
            idinput=idinput.trim();

            if(input.containsKey(idinput)==true) {
                System.out.print("password : ");
                passinput=sc.next();
                passinput=passinput.trim();

                if((input.get(idinput)).equals(passinput)==true) {
                    System.out.println("id와 비밀번호가 일치합니다.\n");
                }
                else if((input.get(idinput)).equals(passinput)==false) {
                    System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.\n");
                }
            }
            else {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.\n");
            }
        } while(i!=1);

    }
}
