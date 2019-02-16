package zw.string.split;
import java.io.IOException;

import com.aliyun.odps.udf.UDFException;
import com.aliyun.odps.udf.UDTF;
import com.aliyun.odps.udf.annotation.Resolve;
/**
 * arg1 账号
 * arg2 需要分割的字符串
 * arg3 分割符
 * @author zhouwei
 *
 */
@Resolve({"string,string,string"})
public class StringSplitUDTF extends UDTF {

	@Override
	public void process(Object[] args) throws UDFException, IOException {
		String acctNbr = (String) args[0];
		String splitStr = (String) args[1];
		String seperator = (String) args[2];
		
		String[] res = splitStr.split("\\"+seperator);
		for (String str : res) {
//			forward(new Object[]{acctNbr,str});
			System.out.println(acctNbr+" : " + str);
		}
		
	} 

}
