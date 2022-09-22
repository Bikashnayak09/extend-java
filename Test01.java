class parent {
	static void m() {

		for (int j = 1; j <= 10; j++) {
			System.out.println(j);
		}

	}

}

class child extends parent {

	public static void main(String[] args) {

		for (int k = 11; k <= 20; k++) {
			System.out.println(k);
		}
		m();

	}
}
