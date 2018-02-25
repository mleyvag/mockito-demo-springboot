package com.leyva.pe;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.leyva.pe.DataService;
import com.leyva.pe.SomeBusinessImpl;

public class SomeBusinessImplStubTest {
	@Test
	public void testFindTheGreatestFromAllData() {
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(new DataServiceStub());
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(24, result);
		
	}
}

class DataServiceStub implements DataService {
	@Override
	public int[] retrieveAllData() {
		return new int[] { 24, 6, 15 };
	}
}