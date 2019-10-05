package com;

public class test {
	public static void main(String args[]){
	Student nasi=new Student("nasi",'m',"wb");
	Student maha=new Student("maha",'f',"wb");
	
	Faculty nsp=new Faculty("dr. niladri",'m',"up","phd",10);
	
	College nsec=new College("NSEC","kolkata");
	
	nsec.addDepartment("CSE",2,nsp);
	nsec.addStudent("CSE",nasi);
	nsec.addStudent("CSE",maha);
	
	/*System.out.println(a);
	System.out.println(b);
	System.out.println(c);*/
	System.out.println(nasi.getRollNo());
	System.out.println(maha.getRollNo());
}
}