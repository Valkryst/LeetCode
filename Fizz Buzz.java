import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> fizzBuzz(final int n) {
        final List<String> result = new ArrayList<>();

        final StringBuilder sb = new StringBuilder();
        for (int i = 1 ; i < (n + 1) ; i++) {
            if (i % 3 == 0) {
                sb.append("Fizz");
            }

            if (i % 5 == 0) {
                sb.append("Buzz");
            }

            if (sb.length() == 0) {
                sb.append(i);
            }

            result.add(sb.toString());
            sb.setLength(0);
        }

        return result;
    }
}
