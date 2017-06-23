package net.bigmir.venzor;

public class Group {
	private Student[] group;

	public Group(Student[] group) {
		super();
		this.group = group;
	}

	public Group() {
		super();
		this.group = new Student[10];
	}

	public Student[] getGroup() {
		return group;
	}

	public int checkGroup() throws MyException {
		int k = -1;
		for (int i = 0; i < this.group.length; i++) {
			if (this.group[i] == null) {
				k = i;
				return k;
			}
		}
		if (k == -1)
			throw new MyException();
		return k;
	}

	public boolean checkStudent(Student a) {
		boolean f = true;
		for (int i = 0; i < this.group.length; i++) {
			if (this.group[i] == a) {
				f = false;
			}
		}
		return f;
	}

	public void addStudent(Student a) {
		try {
			int i = this.checkGroup();
			if (this.checkStudent(a)) {
				this.group[i] = a;
				System.out.println("student " + a.getName() + " added to group");
			} else {
				System.out.println("student is already in group :)");
			}
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}

	}

	public void removeStudent(Student a) {
		int k = this.findStudent(a.getName());
		if (k != -1) {
			this.group[k] = null;
			System.out.println("student " + a.getName() + " removed from group");
			for (int i = k; i < this.group.length - 1; i++) {
				this.group[i] = this.group[i + 1];
			}
			this.group[this.group.length - 1] = null;
		}
	}

	public int findStudent(String a) {
		int k = -1;
		for (int i = 0; i < this.group.length; i++) {
			if (this.group[i].getName() == a) {
				k = i;
				break;
			}
		}
		if (k == -1) {
			System.out.println("this student from another group :)");
		}

		return k;
	}

	public void sortByName() {
		for (int i = this.group.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				try {
					int k = this.group[j].getName().compareTo(this.group[j + 1].getName());
					if (k > 0) {
						Student t = this.group[j];
						this.group[j] = this.group[j + 1];
						this.group[j + 1] = t;
					}
				} catch (NullPointerException e) {

				}
			}
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < this.group.length; i++) {
			if (this.group[i] != null) {
				sb.append(((i + 1) + ". " + this.group[i] + "\n"));
			}
		}
		return sb.toString();
	}

}
