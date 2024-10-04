import java.util.Arrays;
import java.util.Scanner;

public class PSBB {
    public static void count(int family, int[] members) {
        if (family != members.length) {
            System.out.println("Input must be equal with count of family");
            return;
        }

        int result;
        int sum = 0;
        for (int member : members) {
            sum += member;
        }

        if (sum % 4 == 0) {
            result = sum / 4;
        } else {
            result = (sum / 4) + 1;
        }

        System.out.println("Minimum bus required is : " + result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number of families : ");
        int family = Integer.parseInt(scanner.nextLine());
        System.out.print("Input the number of members in the family (separated by a space) : ");
        int[] members = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        count(family, members);
    }
}
