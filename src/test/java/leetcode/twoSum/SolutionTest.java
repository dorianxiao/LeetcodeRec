package leetcode.twoSum; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 

import static org.junit.Assert.*;

/** 
* Solution Tester. 
* 
* @author 
* @version 1.0 
*/ 
public class SolutionTest { 

    @Before
    public void before() throws Exception { 
    } 
    
    @After
    public void after() throws Exception { 
    } 
    
        /** 
    * 
    * Method: twoSum(int[] nums, int target) 
    * 
    */

    private int[] left = {0, 1};
    private int[] right = {2, 7, 11, 15};
    private int target = 9;

    @Test
    public void testTwoSum1() throws Exception {
        assertArrayEquals(left, new Solution().twoSum1(right, target));
    }

    @Test
    public void testTwoSum2() throws Exception {
        assertArrayEquals(left, new Solution().twoSum2(right, target));
    }

    @Test
    public void testTwoSum3() throws Exception {
        assertArrayEquals(left, new Solution().twoSum2(right, target));
    }
}
