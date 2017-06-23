package net.bigmir.venzor;

public class Main {

	public static void main(String[] args) {
		Student stOne = new Student("Ivanov", true, 21, 160.8, 90, "european", 4.6, 12345, 4.3);
		Student stTwo = new Student("Pertov", true, 21, 160.8, 90, "european", 4.6, 12345, 4.3);
		Student stTree = new Student("Sidorov", true, 22, 160.8, 90, "european", 4.6, 12345, 4.3);
		Student stFour = new Student("Dyachyk", true, 21, 160.8, 90, "european", 4.6, 12345, 4.3);
		Student stFif = new Student("Pasternak", true, 20, 160.8, 90, "european", 4.6, 12345, 4.3);
		Student stSix = new Student("Filonova", false, 21, 160.8, 90, "european", 4.6, 12345, 4.3);
		Student stSev = new Student("Ivanova", false, 20, 160.8, 90, "european", 4.6, 12345, 4.3);
		Student stEit = new Student("Pasternak", false, 21, 160.8, 90, "european", 4.6, 12345, 4.3);
		Student stNine = new Student("Petrenko", true, 22, 160.8, 90, "european", 4.6, 12345, 4.3);
		Student stTen = new Student("Stupak", false, 21, 160.8, 90, "european", 4.6, 12345, 4.3);
		Student stElev = new Student("Osipova", false, 20, 160.8, 90, "european", 4.6, 12345, 4.3);

		Group gr = new Group();
		gr.addStudent(stOne);
		gr.addStudent(stTwo);
		gr.addStudent(stTree);
		gr.addStudent(stFour);
		gr.addStudent(stFif);
		gr.addStudent(stSix);
		gr.addStudent(stSev);
		gr.addStudent(stEit);
		gr.addStudent(stNine);

		gr.sortByName();
		System.out.println(gr.toString());

		gr.removeStudent(stOne);
		gr.addStudent(stElev);
		gr.addStudent(stTen);

		gr.sortByName();

		System.out.println(gr.toString());

		// Student[] a=gr.getGroup();
		// for (Student b : a){
		// if (b!=null){
		// System.out.println(b);
		// }
		// }

	}
}
