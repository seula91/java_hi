package Test;

public class word {

		private String eng;
		private String kor;
		private String jap;
		private String chi; 
		private String lev;
		private String dat;
		
		
		public word (String English, String Korean, String Japanese, String Chinese,
				String Level, String Date) {
			this.eng = English;
			this.kor = Korean;
			this.jap = Japanese;
			this.chi = Chinese;
			this.lev = Level;
			this.dat = Date;
			
			
		}
		public String getEnglish() {
	        return eng;

	    }
		public void setEnglish(String english) {
			this.eng = english;
		}
		
		public String getKorean() {
			return kor;
			
		}
		public void setKorea(String korea) {
			this.kor = korea;
		}
		
		public String getjapanese() {
			return jap;
			
		}
		
		public void setJapenese(String japenese) {
			this.jap = japenese;
		}
		
		public String getchinese() {
			return chi;
			
		}
		
		public void setChinese(String chinese) {
			this.chi = chinese;
		}
		
		public String getlevel() {
			return lev;
			
		}
		
		public void setLevel(String level) {
			this.lev = level;
		}


}

