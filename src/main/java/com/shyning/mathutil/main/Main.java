package com.shyning.mathutil.main;

import static com.shyning.mathutil.core.MathUtility.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        testFactorialGivenRightArgumentMinus5ThrownsException();
    }

//    Về lý thuyết ta phải test với data n = 2,3,....,20


    //    Test case để dưới đây, lát hồi run trong main()
    static void testFactorialGivenRightArgumentRunsWell() {
        //Test case #1:
        //Description: Check getFactorial() function with valid argument (n = 0)
        //Step:
        //Call function/method with n = 0 getFactorial(0)
        //Expected resultx
        //       get 1 as the result of 0!
        //Actual result/status(passed, failed) (waiting for test run)

        //TEST RUN: RUN cai test case
        long expectedResult = 1;
        long actualResult = getFactorial(0); //named-argument
        System.out.println("Expected: " + expectedResult + " | Actual: " + actualResult);
    }

//    Test case #2
//    Description: Check getFactorial() method with valid argument ( n = 1)

//    Step/Procedures (cách test, các bước verify hàm, cức năn)
//                Call function/method with n = 1 === getFactorial(1)

//    Expected result: (Hy vọng gọi 1! thì giá trị trả về là mấy)
//                    To have 1 as result of 1!
//    Status (Passed/Failed): mình phải run hàm và nhìn giá trị
//                            trả về mới biết hàm chạy đúng hay sai
//    Chạy TEST CASE/ làm các bước ở trên để xác định được hàm đúng sai
//    Gọi là Test Run

    static void testFactorialGivenRightArgument1RunsWell() {
        int n = 1; //data đưa vào
        long expectedResult = 1; //hy vọng 1! = 1
        long actualResult = getFactorial(n);
//        So sánh bằng mắt để kết luận kết quả đúng sai
        System.out.println("1! Expected: " + expectedResult + " | Actual: " + actualResult);
    }


//    Test case #3:
    static void testFactorialGivenRightArgument5RunsWell(){
            int n = 5;
            long expectedResult = 120;
            long actualResult = getFactorial(n);
            System.out.println("5! Expected: " + expectedResult + " | Actual: " + actualResult);
    }

//    Test case #4
//    Discription Test factorial with invalid argument. E.G N = - 5
//    Step
//         Call getFactorial(-5)
//    Expected Result
//            An exception is thrown - ky vong 1 ngoai le

//    Diễn giải thêm: Hàm của ta thiết kế rằng nếu đưa N âm -> Hàm sẽ chửi
//    Vậy nếu ta test N âm, ta sẽ nhận về chửi -> Hàm ta chạy dúng như thiết kế
//    Thấy ngoại lệ mừng rơt nước mắt
    static void testFactorialGivenRightArgumentMinus5ThrownsException() {
       getFactorial(-5);


    }

}