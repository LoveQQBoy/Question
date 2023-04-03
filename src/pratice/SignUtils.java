package pratice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SignUtils {
	
	private Map<String,String> mapData = new HashMap<>();

	public SignUtils() {
	}
	
	public void  put (String key,String value) {
		mapData.put(key, value);
	}
	
	public String getSign() {
		//建立一個未排序的list
		List<String> keyList = new ArrayList<>(mapData.keySet());
		//利用collections的靜態方法進行排序
		Collections.sort(keyList);
		//利用StringBuilder進行文字操作
		StringBuilder stringBuilder = new StringBuilder();
		for(String key : keyList) {
			String value =mapData.get(key);
			stringBuilder.append(key).append("=").append(value).append("&");
		}
		//刪除最後一個&
		stringBuilder.deleteCharAt(stringBuilder.length()-1);
		return stringBuilder.toString();
	}
	
	public static void main(String[] argv) {
		SignUtils signUtils = new SignUtils();
		signUtils.put("timestamp", "1670549739457");
		signUtils.put("amount", "100");
		signUtils.put("userName", "alden");
		signUtils.put("userPhone", "09844789231");
		signUtils.put("orderNo", "fpx08742139912");
		System.out.println(signUtils.getSign());
	}
	

}
