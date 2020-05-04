package mayChallenge2020;

public class NumberComplement {
    /*
    Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.
     */
    public static int findComplement(int num) {
        String binaryString = Integer.toBinaryString(num);
        char[] chars = binaryString.toCharArray();
        StringBuilder resultBuilder = new StringBuilder();
        for (final char c : chars) {
            resultBuilder.append(c == '0' ? '1' : '0');
        }
        String result = resultBuilder.toString();
        return Integer.parseInt(result, 2);
    }
}
