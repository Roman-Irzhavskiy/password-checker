package interview_tasks;

import java.util.ArrayList;
import java.util.List;

public class UppercaseCountChecker extends BaseChecker {
    @Override
    public void check(Request request) {
        if (request.getPasswords().size() > 0) {
            List<String> passedPasswords = new ArrayList<>();
            int expectedCount = Integer.parseInt(request.getCheckString().substring(0, 1));

            for (int i = 0; i < request.getPasswords().size(); i++) {
                String password = request.getPasswords().get(i);
                long actualCount = password.chars()
                        .filter(c -> Character.isUpperCase(c))
                        .count();
                if (actualCount == expectedCount) {
                    passedPasswords.add(password);
                }
            }
            request.setPasswords(passedPasswords);
            super.check(request);
        }
    }
}
