import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Homework9 {
    public static void main(String[] args) {
        Map<String, String> input = new HashMap<String, String>();
        input.put("myId", "myPass");
        input.put("myId2", "myPass2");
        input.put("myId3", "myPass3");

        int i=0;
        String idinput;
        String passinput;
        try {
            Scanner sc = new Scanner(new FileInputStream("db.txt"));
            // db.text 파일은 첫 번째 줄에 id, 두 번째 줄에는 password가 있는 파일입니다.

            idinput = sc.nextLine();
            idinput = idinput.trim();
            passinput = sc.nextLine();
            passinput = passinput.trim();

            do {
                System.out.println("id와 password를 입력해주세요.");
                System.out.println("id : "+idinput);

                if (input.containsKey(idinput) == true) {
                    System.out.println("password : "+passinput);

                    if ((input.get(idinput)).equals(passinput) == true) {
                        System.out.println("id와 비밀번호가 일치합니다.\n");
                        i=1;
                    } else if ((input.get(idinput)).equals(passinput) == false) {
                        System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.\n");
                        i=1;
                    }
                } else {
                    System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.\n");
                    i=1;
                }
            } while (i != 1);
        }

        catch (FileNotFoundException e) {
            System.out.println("db.txt 파일이 없습니다.");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
