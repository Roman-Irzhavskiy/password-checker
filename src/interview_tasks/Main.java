package interview_tasks;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Request request = new Request(List.of("P4ASSword#5suc", "PASswor1d@wer", "R1E5ST3%qwe"),
                "4ewq9");

        var uppercaseCountChecker = new UppercaseCountChecker();
        var reverseChecker = new ReverseChecker();
        var sumOfDigitsChecker = new SumOfDigitsChecker();
        uppercaseCountChecker.setNext(reverseChecker);
        reverseChecker.setNext(sumOfDigitsChecker);

        uppercaseCountChecker.check(request);
        System.out.println(request.getPasswords());
    }
}
