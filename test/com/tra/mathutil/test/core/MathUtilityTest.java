/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.tra.mathutil.test.core;

import com.tra.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;
 /**
 *
 * @author TRA
 */
public class MathUtilityTest {
    
   
        // Đây là class sẽ sử dung các hàm của thư viện /framework JUnit
        // Để kiểm tra/kiểm thử code chinhs - hàm tínhGiaiThua()bên
        // class core.mathUtil 
        // viết code để test code chính bên kia
        
    
        // có nhiều quy tắc đặt tên kiểm thử 
        //nhưng thường sẽ là nói lên mục đích của các case/tình huống kiểm thử
        //tình huống xài hàm theo kiểu thanhf công và thất bại 
    
        // hàm dưới đây là tình huống test hàm chạy thành công ,trả về ngon
        //ta sẽ xài hàm kiểu well - đưa 5! , 30!
    
        //@Test JUnit sẽ phối hợp với JVM để chạy hàm này
        //@Test phía hậu trường chính là public static void main()
        // Có nhiều @ test ứng với nhiều case khác nhau để kiểm thử hàm tính giai thừa 
        @Test
        public void testGetFactorialGivenRightArgumentReturnsWell(){
            int n = 0; // test thưr tình huống  tử tế đầu vào, mày phải chạy đúng 
            long expected = 1;// hy vọng 0!= 1
            //long actual = ; gọi hàm cânf test bên core /app chính / code chính
           long actual = MathUtil.getFactorial(n);
           
            // so sánh expected vs actual dùng xanh xanh đỏ đỏ , framework
            Assert.assertEquals(expected, actual);
           // Hàm giúp so sánh 2 gía trị naò đó có giống nhau hay ko
            // nếu giống nhau -> thấy màu xanh của đèn đường - đường thông, code ngon
            //                    ít nhất cho case đang test
            //   nếu ko giống nhau     -> thấy màu đỏ lên đường
            //                         hàm ý expected và actual ko giống nhau   
            // gộp thêm vài case thành công/đưa đầu vào ngon !!! hàm phải tính ngon
            Assert.assertEquals(1, MathUtil.getFactorial(1));//tui muốn 1!==1
            Assert.assertEquals(2, MathUtil.getFactorial(2));//tui muốn 2!==2
            Assert.assertEquals(6, MathUtil.getFactorial(3));//tui muốn 3!==6
            Assert.assertEquals(24, MathUtil.getFactorial(4));//tui muốn 4!==24
            Assert.assertEquals(120, MathUtil.getFactorial(5));//tui muốn 5!==120
            Assert.assertEquals(720, MathUtil.getFactorial(6));//tui muốn 6!==720

        
        }
        //hàm getF () ta thiết kế 2 tình huống xử lí
        //1. đưa data tử tế trong [0..20]-> tính đúng được n! = done
        //2.đưa data vào cà chớn âm > 20 ;THIẾT KẾ CỦA HÀM LÀ NÉM RA NGOẠI LỆ
        //TAO KÌ VỌNG NGOẠI LỆ XUẤT HIỆN VỚI N CÀ CHỚN NÀY
        // rất mong ngoại lệ xuất hiện với n cà chớn này
        
        //nếu hàm nhận vào n< 0 hoặc n> 20 và hàm ném ra ngoại lệ 
        //HÀM CHẠY ĐÚNG NHƯ THIẾT KẾ -> XANH PHẢI XUẤT HIỆN
        //nếu hàm nhận vào n<0 hoặc n> 20 và hàm éo ném ra ngoại lệ
        //sure,HÀM CHẠY SAI THIẾT KẾ,SAI KÌ VỌNG,MÀU ĐỎ
        
        //Test case:
        //input:-5
        //eccpected:IllegalArgumentException xuất hiện
        //tình huống bất thường ,ngoại lêj ,ngoài dự tính ,dữ liệu
        //là nhưngx thứ ko thể đo lươngf so sánh theo kiểu value
        //mà chỉ có thể đo lường = cách chúng có xuất hiện hay ji
        //assertEquals() ko dùng để so sánh 2 ngoại lệ
        //      equals() là bằng nhau hay ko trên value!!!
      
        //MAUF ĐỎ ĐÓ EM , DO HÀM ĐÚNG LÀ CÓ NÉM NGOẠI LỆ THẬT SỰ
        //                NHƯNG KO PHẢI LÀ NGOẠI LỆ NHUƯ KÌ VỌNG - THỰC SỰ KÌ VỌNG SAI
        //                KO PHẢI HÀM NÉM SAI
      
       // @Test(expected =NumberFormatException.class)
        //public void testGetFactorialGivenWrongArgumentThrowsException(){
         //  MathUtil.getFactorial(-5);//Hàm @Test chạy, hay hàm getF()chạy
                                      //sẽ ném về ngoại lệ NumberFormat...
        //}
        
        @Test  (expected =IllegalArgumentException.class)
        public void testGetFactorialGivenWrongArgumentThrowsException(){
            MathUtil.getFactorial(-5);//Hàm @Test chạy, hay hàm getF()chạy
                                      //sẽ ném về ngoại lệ NumberFormat...
        }
        //cách khác để bắt ngoại lệ xuất hiện,viết tự nhiên hơn!!!
        //xài Lambda
        //Tui cần màu xanh khi chơi với 21!
        @Test  
        public void testGetFactorialGivenWrongArgumentThrows_LambdaVesion(){
          //  Assert.assertThrows(tham số 1: loại ngoại lệ muốn so sánh, 
          //                    tham số 2: đoạn code chạy văng ra runable);
              Assert.assertThrows(IllegalArgumentException.class,
                                  () -> MathUtil.getFactorial(-5));  
          //MathUtil.getFactorial(-5);//Hàm @Test chạy, hay hàm getF()chạy
                                      //sẽ ném về ngoại lệ NumberFormat...
        }
        //Bắt ngoại lệ xem hàm có ném về ngoại lệ hay ko khi n cà chớn
        //có ném tức là hàm chạy đúng thiết kế ->xanh
         @Test  
        public void testGetFactorialGivenWrongArgumentThrows_TryCatch(){
            //chủ động kiểm soát ngoại lệ !!!
            try{
                 MathUtil.getFactorial(-5);
             } catch (Exception e){
             //bắt try catch laf Junit sẽ ra xanh do đã chủ động kiểm soát ngoại lệ 
             //nhưng ko chắc ngoại lệ mình có xuất hiện hay ko???
             //có đoạn code kiểm soát đúng ngoại lệ IllegaArgumrntException xuất hiện
             Assert.assertEquals("Invalid argument.N must be between 0 .. 20", 
                                  e.getMessage());
             
             }
             
         
        }
        
}
