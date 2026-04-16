public class ReplaceZeroesWithOne {
    public static void main(String[] args) {
        int num = 10203040;

        String str = Integer.toString(num);
        str = str.replace('0', '1');

        int result = Integer.parseInt(str);

        System.out.println("Original number: " + num);
        System.out.println("Modified number: " + result);
    }
}