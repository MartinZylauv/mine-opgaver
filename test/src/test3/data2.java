package test3;

import java.util.List;

public class data2 {
	String newdata = null;
public String compareData(List data){
	if(data.contains("1")){
		newdata = "et";
	}else if(data.contains("2")){
		newdata = "to";
	}
	return newdata;
}
}
