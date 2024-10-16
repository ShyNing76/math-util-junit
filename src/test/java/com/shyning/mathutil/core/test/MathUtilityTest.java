package  com.shyning.mathutil.core.test;

import static com.shyning.mathutil.core.MathUtility.*;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {
//    Cấu trúc test case: ID, DESCRIPTION, STEPS/PROCEDURES, EXPECTED Result, ACTUAL Result, status: Passed, failed
//                        Test Date, Bug # (bug id) Bugzilla (Bug DB) or JIRA

    //    Test case #3: Check getFactorial() with n = - 5 to see the exception
    //    Chủ động tôi muốn thấy có ngoại lệ xuất hiện trong tình huôống n âm hoặc n > 20
    //    Ngoai le co xuat hiện như dự kiến hay ko ... -> nếu có thì phải là màu xanh
    //    Nghe kĩ: có ngoại lệ, nhưng là màu xanh, vì ngoại lệ xh như dự kiến
    @Test
    void testFactorialGivenWrongArgumentThrowsException() {
//        getFactorial(-5)
        assertThrows(IllegalArgumentException.class, () -> {getFactorial(-5);});
    }



    //    Test case #2: Check getFactorial() with n = 5 to see result of 120
    @Test
    void testFactorialGivenRightArgument5RunsWell(){
        assertEquals(1, getFactorial(1));
        assertEquals(2, getFactorial(2));
        assertEquals(6, getFactorial(3));
        assertEquals(24, getFactorial(4));
        assertEquals(120, getFactorial(5));
        assertEquals(720, getFactorial(6));

    }


    //    Test case #1: Check getFactorial() with n = 0 to see result of 1
    @Test
    void testFactorialGivenRightArgument0RunsWell() {
        long expectedValue = 1; // hy vong 0! tra ve 1
        long actualValue = getFactorial(0);
//        So sanh
//        Truyen thong ta sout() in ket qua va nhin = mat de doan dung sai
//        hien dai: xai them tool, thu vien, unit testing framework JUNIT
//        Giup doi mat ta nhin ket qua dung sai qua 2 mau xanh va do
//        Nao va mat ko can nhin doan va ket luan nhu truyen thong
//        Ma nay thay do => tach , xanh => on
        assertEquals(expectedValue, actualValue);
//        Giong nhau mau xanh, lenh nhau au do ham chay ket qua ko nhu mong doi
    }

}

// Quy tac xanh do cua unit test tool/framework
// Neu tat ca cac test cae passed(expected === actual) => Mau xanh
// Chi can 1 trong nhung test case failed (expected !== actual) => mau do
// Ly do: ham da dung thi phai dung het voiw cac test case da dua ra
// Mat chi nhin 2 tin hieu - xanh, do theo style gop cac ket qua
// Xanh: Dung het, do: 1 thang nao chet => bo ham, fix lai

// Ki thuat viet code chinh (Ham trong api, core...)
// ma di kem code test ham luon, dung 2 trang thai xanh do, cu lien tuc code
// Xong chay xanh do, sửa, chạy lại xanh đỏ, tối ưu chỉnh code , chay lại xanh
// do, xanh do lien tuc trong qua trinh viet code dc goi la TDD
// Test DRIVEN DEVELOPMENT - Viet code song hanh cung code test