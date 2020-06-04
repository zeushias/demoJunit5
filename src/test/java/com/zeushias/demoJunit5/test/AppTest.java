/**
 * 
 */
package com.zeushias.demoJunit5.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.zeushias.demoJunit5.Voiture;

/**
 * @author DANON
 *
 */
public class AppTest {

	@Test
	public void test() {
		List<Integer> tab = new LinkedList<Integer>();
		try {
		Integer i = tab.get(10);        
		fail("Should have thrown an exception");
		} catch(Exception e) {
			
		}
	}
	
	@Test
	public void test1() {
		assertTrue(true);
	}
	
	@Test
	public void test2() {
		assertFalse(false);
	}
	
	@Test
	public void test3() {
		assertNull(null);
	}
	
	@Test
	public void test4() {
		String a = "no";
		assertEquals(a, "no");
	}
	
	@Test
	public void test5() {
		assertFalse(false);
	}
	
	@Test
	public void test6() {
		assertNotEquals("not", "bad");
	}
	
	@Test
	public void test7() {
		String a = "man";
		assertNotNull(a);
	}
	
	@Test
	public void test8() {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "moi");
		
		Map<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(1, "moi");
		
		assertSame(map.get(0), map2.get(0));
	}

	@Test
	public void test9() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "moi");
		
		Map<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(1, "moine");
		
		assertNotSame(map, map2);
	}
	
///////////////////////////////////////////
	@BeforeEach
	public void before() {
		this.message("Cours de : ");
	}

	@AfterEach
	public void after() {
		this.message("Spring");
	}

	@Test
	public void test10() {
		this.message("Java");
	}

	private void message(String sms) {
		System.out.println(sms);
	}
	
static ///////////////////////////////////////////
	List<Voiture> voitures = new LinkedList<Voiture>();
	@BeforeAll
	public static void beforeClass() {
		System.out.println("@BeforeClass");
		voitures.add(new Voiture("bleu", "toyota"));
		
	}
	
	@AfterAll
	public static void afterClass() {
		voitures.clear();
		System.out.println("@AfterClass");
	}
	
	@Test
	public void test11() {
		this.message(voitures.get(0).getColor());
	}
	
	
}
