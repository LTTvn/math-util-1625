/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tra.mathutil.main;

import com.tra.mathutil.core.MathUtil;

/**
 *
 * @author TRA
 */
public class Main {
    public static void main(String[] args) {
        
        //thử nghiệm coi hàm tính giai thừa có đúng như thiết kế hay ko
        //ta phải đưa các tình huống sử dụng hàm trong thực tế
        //ví dụ: -5 coi tính được ko
        //       0 tính được mấy
        //       20 tính được mấy
        //       21 tính đươc mấy
        //TEST CASE: Một tình huống hàm /app/màn hình/tính năng đc đưa vào sử dụng
        //giả lập hành vi xài của ai đó !!!
        
        //TEST CASE: LÀ MỘT TÌNH HUỐNG SỬ DỤNG,XÀI APP (HÀM) MÀ NÓ BAO GỒM 
        //INPUT:DATA ĐẦU VÀO CỤ THỂ NÀO ĐÓ
        //OUTPUT: ĐÂU RA ỨNG VỚI XỬ LÍ CỦA HÀM/ CHỨC NĂNG CỦA APP,DĨ NHIÊN DÒNG ĐẦU 
        //VÀO ĐỂ XỬ LÍ
        //KÌ VỌNG : MONG HÀM SẼ TRẢ VỀ VALUE NÀO ĐÓ ỨNG VỚI INPUT Ở TRÊN
        //SO SÁNH ĐỂ XEM KẾT QUẢ NHƯ KÌ VỌNG HAY KO
        
        long expected = 120; // tao kì vọng ói về 120 nếu tính 5!
        int n =5 ; //input
        long actual = MathUtil.getFactorial(n);
        
        System.out.println("5!= " + expected + "expected");
        System.out.println("5!= " + actual + "actual");
    }
}
   