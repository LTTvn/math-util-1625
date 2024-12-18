/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tra.mathutil.core;

/**
 *
 * @author TRA
 */
public class MathUtil {
    
        //trong class này cung cấp cho ai đó nhiêù hàm xử lí toán họcj
        //clone class Math của JDK
        //Hamf thư viện xài chung cho ai đó,ko cần lưu lại trạng thái/giá trị 
        //chọn thiết kế là hàm static
        
        //hàm tính giai thừa !!!
        //n! = 1.2.3.4 ... n
        //ko có giai thừa âm
        //0! = 1! quy ước
        //hiai thừa hàm đồ thị dốc,tăng nhanh về gía trị 
        //20 giai thừa 18 con số 0 , vừa kịp dù cho kiểu long của Java
        //21 giai thừa tràn kiểu long
        //bài này quy ước tính n! trong khoảng từ 0..20
        public static long getFactorial (int n){
             if(n<0 || n>20)
                 throw new IllegalArgumentException("Invalid argument.N must be between 0 .. 20");
             if(n==0 || n==1)
                 return 1; //kết thúc cuộc chơi sớm nêu nhận những đầu vào đặc biệt
             long product =1 ; // tích nhân dồn,thuật toán heo đát ,ốc bu dồn thịt
             for (int i = 2; i <= n; i++) 
                 product *= i; // product = product * i
             return product;
            }
        }
         
         

       
    


     