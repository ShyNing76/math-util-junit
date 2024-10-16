package com.shyning.mathutil.core.test;

import com.shyning.mathutil.core.MathUtility;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static com.shyning.mathutil.core.MathUtility.getFactorial;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {

    //@Test là 1 phần annotation của framework, biến cái hàm của ta thành hàm main
    //Để có thể run. hàm bt chỉ có thể gọi trong main() để chạy
    //@Test biến hàm bất kì thành main()

    //Kĩ thuật DDT - Data Driven Testing: Là kĩ thuật tách bộ DATA kiểm thử ra
    //khỏi các câu lệnh kiểm thử, mục đích giúp developer nhìn nhanh dc xe,
    //Bộ test case còn thiếu case nào hay ko
    //Kĩ thuật này còn gọi tên khác là tham số háo bộ data kiểm thử  (Parameterized Testing)

    public static Object[][] initTestData() {
        return new Object[][]
                {
                        {0, 1},
                        {1, 1},
                        {2, 2},
                        {3, 6},
                        {4, 24},
                        {5, 120},
                        {6, 720},
                };
    }

    public static Object[] initTestThrowsData() {
        return new Object[]
                {
                        -1, -2, -3, -4, -5, 21, 22, 23 ,24 ,25
                };
    }

    @ParameterizedTest
    @MethodSource("initTestData")
    void testFactorialGivenRightArgument5RunsWell(int n, long expected) {
        Assertions.assertEquals(expected, MathUtility.getFactorial(n));
    }

    @ParameterizedTest
    @MethodSource("initTestThrowsData")
    void testFactorialGivenWrongArgumentThrowsException(int n) {
        assertThrows(IllegalArgumentException.class, () -> {
            getFactorial(n);
        });
    }
}