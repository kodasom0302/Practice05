package com.javaex.ex04;
//???
public class Base {
        
        //코드작성할것
    	private String day;
    	private String night;
    	private String afternoon;
    	
    	public Base() {
    	}
    	public Base(String day) {
    		this.day=day;
    	}
    	public Base(String night) {
    		this.night=night;
    	}
    	public Base(String afternoon) {
    		this.afternoon=afternoon;
    	}

    public String getDay() {
			return day;
		}
		public void setDay(String day) {
			this.day = day;
		}
		public String getNight() {
			return night;
		}
		public void setNight(String night) {
			this.night = night;
		}
		public String getAfternoon() {
			return afternoon;
		}
		public void setAfternoon(String afternoon) {
			this.afternoon = afternoon;
		}
		
	public void day() {
        System.out.println("낮에는 열심히 수업듣자");
    }

    public void night() {
    	//코드작성할것
    	System.out.println("밤에는 숙면");
    }
    
    public void afternoon(){
        System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
    }
}

