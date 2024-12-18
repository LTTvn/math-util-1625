/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.tra.mathutil.test.core;

import com.tra.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author TRA
 */

//cau lenh nay cua JUnit bao hieu rang se can loop qua tap data de
//lay cap data input/expected nhoi ham vao test
@RunWith(value=Parameterized.class)
public class MathUtilDDTTest {
    //ta sẽ trả về mảng 2 chiều gồm nhiều cặp Expected \ Input
  @Parameterized.Parameters //JUnit sex ngam chay qua tung dong 
                            //cua mang de lay ra dc cap data input/expected
  //ten ham ko quan trong ,quan trong la @
    public static Object[][] initData() {
       return new Integer[][]{
                               {0,1},
                               {1,1},
                               {2,2},
                               {3,6},
                               {4,24},
                               {6,720},
       };
}
    //gia su loop qua tung dong cua mang, ta van gan tung value cua cot
    //vao bien tuong ung input/expected de lat hoi feed cho ham
@Parameterized.Parameter(value=0) // value = 0 la map voi mang data
    public int n; //bien map voi value cua cot 0 cua mang
@Parameterized.Parameter(value=1)
public long expected;//kieu long vi gia tri tra ve cua ham getF()
                         //la long

@Test
  public void testGetFactorialGivenRightArgumentReturnsWell(){
      Assert.assertEquals(expected, MathUtil.getFactorial(n));
  }
  
    
}
