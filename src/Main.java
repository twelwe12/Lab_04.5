void main() {
    Scanner sc = new Scanner(System.in);
    double x, y, R;

    System.out.print("R = ");
    R = sc.nextDouble();
    System.out.println();

    // cпосіб 1

    for (int i = 0; i < 10; i ++){
        System.out.print("x = ");
        x = sc.nextDouble();
        System.out.print("y = ");
        y = sc.nextDouble();

        if ((x - R) * (x - R) + (y - R) * (y - R) <= R * R &&
                y <= x ||
                (x + R) * (x + R) + (y + R) * (y + R) <= R * R &&
                        y >= x)
            System.out.println("yes\n");
        else
            System.out.println("no\n");
    }

    // спосіб 2
    Random random = new Random();

    for (int i = 0; i < 10; i ++){
        x = random.nextDouble(-2 * R, 2 * R);
        y = random.nextDouble(-2 * R, 2 * R);

        System.out.println("x = " + x + "; y = " + y);

        if ((x - R) * (x - R) + (y - R) * (y - R) <= R * R &&
                y <= x ||
                (x + R) * (x + R) + (y + R) * (y + R) <= R * R &&
                        y >= x)
            System.out.println("yes\n");
        else
            System.out.println("no\n");
    }
}
