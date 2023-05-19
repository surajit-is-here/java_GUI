import java.util.Scanner;

public class prog5 {
    Scanner sc = new Scanner(System.in);
    public class complex {
        float real;
        float img;
        public complex()
        {
            this.real=0.0F;
            this.img=0.0F;
        }
    }
        public void input(complex[][] C1, int r, int c) {
            int i, j;
            for (i = 0; i < r; i++) {
                for (j = 0; j < c; j++) {
                    C1[i][j] = new complex();
                    System.out.println("Enter the real and imaginary part of the element at index " + (i + 1) + (j + 1));
                    C1[i][j].real = sc.nextFloat();
                    C1[i][j].img = sc.nextFloat();
                }
            }
        }

        complex[][] MatrixMultiplication(complex[][] C1, complex[][] C2, int r1, int c1, int c2) {
            complex[][] C3 = new complex[r1][c2];
            int i, j, k;
            for (i = 0; i < r1; i++) {
                for (j = 0; j < c2; j++) {
                    C3[i][j] = new complex();
                    for (k = 0; k < c1; k++) {
                        C3[i][j].real = C3[i][j].real + ((C1[i][k].real * C2[k][j].real) - (C1[i][k].img * C2[k][j].img));
                        C3[i][j].img = C3[i][j].img + ((C1[i][k].real * C2[k][j].img) + (C1[i][k].img * C2[k][j].real));
                    }
                }
            }
            return C3;
        }

       void display(complex[][] C, int r1, int c1) {
            int i, j;
            for (i = 0; i < r1; i++) {
                for (j = 0; j < c1; j++)
                    System.out.format("%+g%+gi\t", C[i][j].real, C[i][j].img);
                System.out.print("\n");
            }
        }
    void go() {
        Scanner sc = new Scanner(System.in);
        int r1, c1, r2, c2;
        System.out.println("Enter the order of matrices");
        r1 = sc.nextInt();
        c1 = sc.nextInt();
        r2 = sc.nextInt();
        c2 = sc.nextInt();
        if (c1 != r2) {
            System.out.println("Invalid input");
            System.exit(0);
        } else {
            complex[][] C1 = new complex[r1][c1];
            complex[][] C2 = new complex[r2][c2];
            System.out.println("Enter the elements of the first matrix");
            input(C1, r1, c1);
            System.out.println("Enter the elements of the second matrix");
            input(C2, r2, c2);
            System.out.println("First Matrix: ");
            display(C1, r1, c1);
            System.out.print("\n\nSecond Matrix: \n");
            display(C2, r2, c2);
            complex[][] C3;
            C3 = MatrixMultiplication(C1, C2, r1, c1, c2);
            System.out.print("\n\n");
            System.out.println("Multiplication: ");
            display(C3, r1, c2);
        }
    }
}
