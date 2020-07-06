package it.polito.tdp.parole.model;

public class TestModel {

	public static void main(String[] args) {
	TestModel t = new TestModel();
	t.run();
	}

	private void run() {
		Parole p = new Parole();
		p.addParola("Marco");
		p.addParola("Ale");
		p.addParola("Fede");
		p.addParola("Giovanni");
		
		
		System.out.println(p.getElenco());
		p.reset();
		System.out.println(p.getElenco());
	}

}
