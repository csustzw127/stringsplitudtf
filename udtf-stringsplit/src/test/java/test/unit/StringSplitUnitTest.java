package test.unit;

import java.io.IOException;

import org.junit.Test;

import com.aliyun.odps.udf.UDFException;

import zw.string.split.StringSplitUDTF;

public class StringSplitUnitTest {

	@Test
	public void test1() throws UDFException, IOException {
		StringSplitUDTF s = new StringSplitUDTF();
		Object[] args = new Object[]{"123","NDSB-POFF","-"};
		s.process(args );
	}
}
