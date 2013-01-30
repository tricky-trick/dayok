package com.dayok.verifications;

import com.dayok.webdriver.Base;

public class CodePageVerification extends Base{
	
	public String verifySendCodeMsg() {
		
		String outResults="";
		String userMsg=repository.getCodePage().getCodeResult().getText();
		if(!userMsg.contains("успішно"))
		outResults+="Code was't sent. Error message is "+userMsg+"\n";
		return outResults;
	}
}