
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
		return 0;	}
	public int suma(int[] niz) {
		
		return 0;
	}
	public int prosjek(int[] niz) {
		return 0;
		}
}
