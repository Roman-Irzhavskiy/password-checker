package interview_tasks;

import java.util.ArrayList;
import java.util.List;

public class SumOfDigitsChecker extends BaseChecker {
    @Override
    public void check(Request request) {
        if (request.getPasswords().size() > 0) {
            List<String> passedPasswords = new ArrayList<>();
            int expectedSum = Integer.parseInt(request.getCheckString().substring(4, 5));

            for (int i = 0; i < request.getPasswords().size(); i++) {
                String password = request.getPasswords().get(i);
                int actualSum = password.chars()
                        .filter(Character::isDigit)
                        .map(c -> Character.digit(c, 10))
                        .sum();
                if (actualSum == expectedSum) {
                    passedPasswords.add(password);
                }
            }
            request.setPasswords(passedPasswords);
            super.check(request);
        }
    }
}
