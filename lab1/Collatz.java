/**
 * Class that prints the Collatz sequence starting from a given number.
 *
 * @author YOUR NAME HERE
 */
public class Collatz {


    /**
     * 如果是奇数 返回 3*n+1
     * 如果是偶数 返回 n/2
     * 如果是1 返回仍是1
     *
     * @param n 需要计算的数据
     * @return
     */
    public static int nextNumber(int n) {
        if (n == 1) {
            return 1;
        } else if (n % 2 == 0) {
            return n / 2;
        } else {
            return 3 * n + 1;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.print(n + " ");
        while (n != 1) {
            n = nextNumber(n);
            System.out.print(n + " ");
        }
        System.out.println();
    }
}

