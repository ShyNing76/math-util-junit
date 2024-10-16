package com.shyning.mathutil.core;

//Ta tao bo thu vien cung cap cac ham tien ich lien quan den toan hoc
//Vi la do tien ich dung chung, tool cho nhieu noi su dung -> Ham static

public class MathUtility {

    //    Ham tinh n! = 1.2.3.4....n
    //    Ko co giai thua so am
    //    //    0! = 1! = 1
    //    20! vua du kieu long, 19 con so 0
    //    Bai nay ko choi voi 21!

    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid number, n must be between 0 and 20");
        }

        if (n == 0 || n == 1) {
            return 1; //0! la 1
        }

//        song sot den cho nay n = 2,3,4,5,...
//        Vong for nhan don - nguyen ly con heo dat

        long result = 1; //tich ban dau la 1

        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
