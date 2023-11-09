package interview_tasks;

import java.util.List;

public class Request {
    private List<String> passwords;
    private String checkString;

    public Request(List<String> passwords, String checkString) {
        this.passwords = passwords;
        this.checkString = checkString;
    }

    public List<String> getPasswords() {
        return passwords;
    }

    public void setPasswords(List<String> passwords) {
        this.passwords = passwords;
    }

    public String getCheckString() {
        return checkString;
    }
}
