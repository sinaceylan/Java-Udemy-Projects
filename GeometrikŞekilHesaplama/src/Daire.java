
public class Daire extends Sekil {

	private int yaricap;
	
	
	
	public Daire(String isim, int yaricap) {
		super(isim);
		this.yaricap = yaricap;
	}



	@Override
	void alanHesapla() {
		System.out.println(getIsim()+" in alan�: "+(Math.PI*yaricap*yaricap));
		
	}
	
	
	
	
	
	
}
