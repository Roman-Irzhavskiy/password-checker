package interview_tasks;

public abstract class BaseChecker implements PasswordChecker {
    protected PasswordChecker next;

    public void setNext(PasswordChecker passwordChecker) {
        this.next = passwordChecker;
    }

    @Override
    public void check(Request request) {
        if (next != null) {
            next.check(request);
        }
    }
}
