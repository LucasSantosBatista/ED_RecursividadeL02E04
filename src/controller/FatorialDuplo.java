package controller;

public class FatorialDuplo {

	public FatorialDuplo() {
		super();
	}

	public int calculaDFat(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * calculaDFat(n-2);
		}
	}
}
