package baseball;
import camp.nextstep.edu.missionutils.Console;

public class TryAgain {
    String tryAgainOrNot;
    public String getRetryNum() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        tryAgainOrNot = Console.readLine();
        return tryAgainOrNot;
    }
    public boolean tryAgainOrWhat(String retry) {
        char answer = retry.charAt(0);
        if(answer == '1') {
            return true;
        }
        return false;
    }



}
