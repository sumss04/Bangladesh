package com.usa.talentech.sum;

 class Student9 {
	 int rollno;
	 String name;
	 static String college="ITS";
	 static void change() {
		 college="BBDIT";
	 } 
Student9(int r, String n ){
	rollno=r;
	name=n;
}
void display() {
	System.out.println(rollno+""+name+""+college);
}
 public static void main(String[] args) {
	Student9.change();
	Student9 s1=new Student9(111,"Sumon");
	Student9 s2=new Student9(112,"Mashre");
	Student9 s3=new Student9(111,"Naba");
	s1.display();
	s2.display();
	s3.display();
 }
}
