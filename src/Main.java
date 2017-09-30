import java.util.*;
public class Main {
	//總分平均
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x, y, z, A, B;
		x = in.nextInt();
		y = in.nextInt();
		z = in.nextInt();
		A = x + y + z;
		B = (x + y + z) / 3;
		System.out.printf("%d\n%d\n", A, B);
	}
}
