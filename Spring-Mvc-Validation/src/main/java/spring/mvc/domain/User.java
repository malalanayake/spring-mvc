package spring.mvc.domain;

import java.io.Serializable;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

public class User implements Serializable {

	@NotEmpty(message="{user.username.notempty}")
	String userName;
	@NotEmpty(message="{user.password.notempty}")
	String passWord;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

}
