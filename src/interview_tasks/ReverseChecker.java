package interview_tasks;

import java.util.ArrayList;
import java.util.List;

public class ReverseChecker extends BaseChecker {
    @Override
    public void check(Request request) {
        if (request.getPasswords().size() > 0) {
            List<String> passedPasswords = new ArrayList<>();
            String checkString = request.getCheckString().substring(1, 4);
            String reversedCheckString = new StringBuilder(checkString).reverse().toString();

            for (int i = 0; i < request.getPasswords().size(); i++) {
                String password = request.getPasswords().get(i);
                if (password.endsWith(reversedCheckString)) {
                    passedPasswords.add(password);
                }
            }
            request.setPasswords(passedPasswords);
            super.check(request);
        }
    }
}
