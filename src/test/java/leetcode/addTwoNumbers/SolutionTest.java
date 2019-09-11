package leetcode.addTwoNumbers; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 

import static org.junit.Assert.*;
import java.util.ArrayList;

/** 
* Solution Tester. 
* 
* @author xiao
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
    * Method: addTwoNumbers(ListNode l1, ListNode l2) 
    * 
    */

    private ListNode l1 = new ListNode(0);
    private ListNode l2 = new ListNode(0);
    private ListNode rest = new ListNode(0);

    private ListNode p = l1, q = l2, point = rest;

    @Test
    public void testAddTwoNumbers() throws Exception {
        p.next = new ListNode(5);
        p = p.next;
        p.next = new ListNode(8);
        p = p.next;
        p.next = new ListNode(2);
        p = l1.next;

        q.next = new ListNode(5);
        q = q.next;
        q.next = new ListNode(9);
        q = q.next;
        q.next = new ListNode(8);
        q = l2.next;

        point.next = new ListNode(0);
        point = point.next;
        point.next = new ListNode(8);
        point = point.next;
        point.next = new ListNode(1);
        point = point.next;
        point.next = new ListNode(1);
        point = rest.next;

        ListNode right = new Solution().addTwoNumbers(p,q);
        assertArrayEquals(ListToArray(point).toArray(), ListToArray(right).toArray());

    } 

    private ArrayList<Integer> ListToArray (ListNode ln) {
        ArrayList<Integer> arr = new ArrayList<>();
        while (ln != null) {
            arr.add(ln.val);
            ln = ln.next;
        }
        return arr;
    }
        
}
