package com.javaex.ex02;

public class Friend {

    private String name;
    private String hp;
    private String school;
    
	public Friend(String[] split) {
		super();
		this.name = split[0];
		this.hp = split[1];
		this.school = split[2];
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	@Override
	public String toString() {
		return "이름:" + this.name + " 핸드폰:" + this.hp + " 학교:" + this.school;
	}

	
    


}
