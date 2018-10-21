
public class NizBrojevi {
	int[] niz;

	

	public int najmanjiUNizu(int[] niz) {
		int najmanjiUNizu = niz[0];
		for (int i = 1; i < niz.length; i++) {
			if (najmanjiUNizu > niz[i]) {
				najmanjiUNizu = niz[i];
			}
		}
		return najmanjiUNizu;
	}
	
	
	
	
	
	
	
	public int najveciUNizu(int[] niz) {
		int najveciUNizu = niz [0];
		for(int i = 1; i < niz.length; i++) {
			if(najveciUNizu < niz[1]) {
				najveciUNizu = niz[i];
			}
		}
		return najveciUNizu;	
	}
	
	public int suma(int[] niz) {
		int suma = 0;
		for(int i = 0; i < niz.length; i++) {
			suma += niz[i];
		}
		return suma;
		
	}
	public int prosjek(int[] niz) {
		int suma=0;
		int prosjek=0;
		for(int i=0;i<niz.length;i++) {
			suma+=niz[i];
			prosjek=suma/niz.length;
		}
		return prosjek;
		}
}
