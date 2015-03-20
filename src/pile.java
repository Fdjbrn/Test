public class pile {
	private static final int ERREUR_PILE_VIDE = -3;
	public static final int SUCCES = 0;
	public static final int ERREUR_NB_NEGATIF = -1;
	public static final int ERREUR_PILE_PLEINE = -2;
	private final static int TAILLEPILE = 10;
	private int nbElements = 0;
	private int i = 0;
	private int pile[];

	public pile(int nbElements) {
		super();
		i = 0;
		this.nbElements = nbElements;
		pile = new int[nbElements];
	}

	int empiler(int a) {
		int testEmpiler = 0;
		i = nbElements;

		if (i == TAILLEPILE) {
			testEmpiler = ERREUR_PILE_PLEINE;
		}

		if (a < 0) {
			testEmpiler = ERREUR_NB_NEGATIF;
		} else {
			if (i != TAILLEPILE) {
				pile[i] = a;
				testEmpiler = SUCCES;
				nbElements++;
			}
		}

		return testEmpiler;
	}

	private int depiler() {
		int testDepiler = 0;
		i = nbElements;

		if (i == 0) {
			testDepiler = ERREUR_PILE_VIDE;
		}
		if (i > 0) {
			nbElements--;
			testDepiler = pile[nbElements];
		}
		return testDepiler;

	}
	
	private int sommet(){
		return pile[nbElements-1];
	}
	
	private void afficherPile(int pile[]){
		for (int i =0; i < pile.length; i++){
			System.out.println(this.pile[i]);
		}
	}




}
